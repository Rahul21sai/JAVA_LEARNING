class ekclass{
    int a;

    public int getA() {
        return a;
    }

    ekclass(int a){
        this.a = a;

    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int c ){
        super(c);
        System.out.println(" i am a constructor");
    }
}


public class cwh_47 {
    public static void main(String[] args) {
        ekclass e = new ekclass(5);
        System.out.println(e.getA());
        doclass d = new doclass(5);

    }
}
