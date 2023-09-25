import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();
        l2.add(29);
        l2.add(30);
        l2.add(31);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(0,5);
        l1.add(6);
        l1.addLast(5);
        l1.addFirst(1);
        l1.addAll(0,l2);
        System.out.println(l1.contains(29));
        System.out.println(l1.indexOf(30));
        // l1.clear();
        l1.set(1,20);
        for (int i=0;i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
