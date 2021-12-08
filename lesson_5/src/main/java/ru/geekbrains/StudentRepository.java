package ru.geekbrains;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class StudentRepository {

    private final EntityManagerFactory entityManagerFactory;

    public StudentRepository(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public List<Student> findAll() {
        return executeForEntityManager(
                entityManagerFactory -> entityManagerFactory.createQuery("select s from Student s", Student.class)
                        .getResultList());
    }

    public Optional<Student> findById(long id) {
        return executeForEntityManager(
                entityManagerFactory -> Optional.ofNullable(entityManagerFactory.find(Student.class, id)));
    }

    public void insert(Student student) {
        executeInTransaction(entityManagerFactory -> entityManagerFactory.persist(student));
    }

    public void update(Student student) {
        executeInTransaction(entityManagerFactory -> entityManagerFactory.merge(student));
    }

    public void deleteById(long id) {
        executeInTransaction(
                entityManagerFactory -> entityManagerFactory.createQuery("delete from Student where id = :id")
                        .setParameter("id", id)
                        .executeUpdate());
    }

    private <R> R executeForEntityManager(Function<EntityManager, R> function) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return function.apply(entityManager);
        } finally {
            entityManager.close();
        }
    }

    private void executeInTransaction(Consumer<EntityManager> consumer) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            consumer.accept(entityManager);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }
}