package Java_Core;
// 92 . LinkedList in Java : Demo & Methods

import java.util.ArrayList;
import java.util.LinkedList;

public class Shubham75 {
    public static void main(String[] args) {
      LinkedList<Integer> list = new LinkedList<>();
      LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(15);
        list2.add(18);
        list2.add(19);

        list.add(6);
        list.add(7);
        list.add(4);
        list.add(6);
        list.addLast(8);

        list.add(0,5);
        list.add(0,1);
        list.addAll(0,list2);
        list.addFirst(3);
        System.out.println(list.contains(27));
        System.out.println(list.indexOf(6));
        System.out.println(list.lastIndexOf(6));
        //  list.clear();
        list.set(1,566);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }

    }
}
