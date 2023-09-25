abstract class pen {
    abstract void write();

    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}
abstract class monkey {
    void jump() {
        System.out.println("jumping...");

    }

    void bite() {
        System.out.println("biting...");
    }

    public abstract void eat();

    public abstract void sleep();

    interface basicanimal {
        void eat();

        void sleep();
    }
}

class human extends monkey implements monkey.basicanimal {
        void speak() {
            System.out.println("hello sir");
        }
        @Override
        public void eat() {
            System.out.println(" eating");
        }

        @Override
        public void sleep() {
            System.out.println("sleeping");

        }
    }

public class cwh_60 {
    public static void main(String[] args) {
       //q1
        fountainpen pen = new fountainpen();
       pen.changeNib();
     //q3
        human rahul = new human();
        rahul.sleep();
        //q5
        monkey m1 = new human();
        m1.bite();
        //m1.speak();-->> cannot use speak method because the reference is monkey which doesnto have speak method
    }
}
