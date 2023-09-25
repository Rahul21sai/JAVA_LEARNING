import java.util.HashSet;

public class cwh_95 {
    public static void main(String[] args) {
        HashSet<Integer>  myhashset = new HashSet<>(6, 0.5F);

        myhashset.add(6);
        myhashset.add(9);
        myhashset.add(8);
        myhashset.add(11);
        myhashset.add(21);
        System.out.println(myhashset);
        System.out.println(System.currentTimeMillis());
    }
}
