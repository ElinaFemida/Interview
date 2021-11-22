import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(2);
        mll.insertFirst(8);
        System.out.println(mll);

        mll.insertLast(77);
        mll.insertLast(88);
        System.out.println(mll);

        Iterator<Integer> iterator = mll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer x : mll) {
            System.out.println(x);
        }

        MyArrayList <Integer> mal = new MyArrayList<>();
        mal.add(3);
        mal.add(0,2);
        System.out.println(mal);
        mal.remove(1);
        System.out.println(mal);
    }
}

