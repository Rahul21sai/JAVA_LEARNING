


abstract class parent22{
    public parent22() {
        System.out.println(" mai base2 ka constructor hoon");
    }
    public void sayhello(){
        System.out.println("hello");

    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends parent22{
    @Override
    public void greet() {
        System.out.println("good morning");

    }
    @Override
    public void greet2(){
        System.out.println("good afternoon");
    }
}
abstract class child3 extends parent22{
    public void th(){
        System.out.println(" i am good");
    }
}

public class cwh_53 {
    public static void main(String[]args){
    // abstract method - abstract void moveTo (double x , double y)
        // a method that is declared without an implemnetation
        // an idea without concreate existance
     // we cannnot make object when it is absract class   parent22 p = new parent22();
        child2 c = new child2();
        //child3 c3  = new child3();-- error

        }
}
