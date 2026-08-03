package Java_Core;
// 91 . ArrayList in Java : Demo & Methods
import java.lang.reflect.Array;
import java.util.*;
public class Shubham74 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(5);

        list2.add(15);
        list2.add(18);
        list2.add(19);

        list.add(6);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(0,5);
        list.add(0,1);
        list.addAll(0,list2);
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
