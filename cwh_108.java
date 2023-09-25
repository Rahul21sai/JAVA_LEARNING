
@FunctionalInterface
interface myfunctionalinterface{
    void thismethod();
//    void thismethod2();
}
class newphone extends one{
    @Override
 public void name(){
    System.out.println("my name is bava");
    }
    @Deprecated
    public int sum(int a , int b ){
        return a+b;
    }

}

public class cwh_108 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        newphone phone = new newphone();
        phone.name();
        phone.sum(5,6);

    }
}
