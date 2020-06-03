import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class DemoLambdaInCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        System.out.println("list element are " + list);
        Collections.sort(list, (o1, o2) -> (o1 > o2) ? -1 :
                (o1 < o2) ? 1 : 0);

        System.out.println("Elements of the ArrayList after" +
                " sorting : " + list);


        /// using lambda to srt treeset
        TreeSet<Integer> h =
                new TreeSet<Integer>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are: " + h);

        /// using lambda to srt treeMap

        TreeMap<Integer, String> m =
                new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + m);
    }


}


