import java.util.ArrayList;
import java.util.Scanner;

class mygeneric<T1>{
    int val;
    private T1 t1;

    public mygeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class cwh_110 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("str 1 ");
        arrayList.add(54);
        arrayList.add(643);
        arrayList.add(new Scanner(System.in));

        int a = (int) arrayList.get(2);
        System.out.println(a );
        mygeneric<String> g1 = new mygeneric<>(23,"mystring");
        String str = g1.getT1();
        System.out.println(str);
    }
}
