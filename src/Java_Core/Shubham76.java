package Java_Core;
// 93 . ArrayDeque in Java

import java.util.ArrayDeque;

public class Shubham76 {
    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.add(6);
        list.add(56);
        list.add(9);
        list.addFirst(5);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
