interface bicycle{
    int a =45;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface horn{
    void blowhorn2();
    void blowhorn3();
}
class Avoncycle implements bicycle,horn{
    void blowhorn(){
        System.out.println("hornnnnn");
    }

    public void applybrake(int decrement) {
        System.out.println("applying brake");

    }
    public void speedup(int increment) {
        System.out.println("applying speedup");
    }
    public void blowhorn2(){
        System.out.println("blow horn pii piii");
    }
    public void blowhorn3(){
        System.out.println("pooo ");
    }
}


public class cwh_54_55 {
    public static void main(String[] args)
    {
     Avoncycle cylerahul = new Avoncycle();
     cylerahul.applybrake(1);
     //you can create properties in interfaces
        System.out.println(cylerahul.a);
        // you cannot modify the properties in interfaces as they are final
cylerahul.blowhorn2();
cylerahul.blowhorn3();
    }
}
