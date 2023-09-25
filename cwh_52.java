class circle1{
    circle1(){
        System.out.println(" i am non parm of circle");
    }
    public int radius;

    circle1(int r){
        System.out.println(" i am circle parameterized constructor");
        this.radius = r;

    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends circle1{
    public int height;
    Cylinder1(int r , int h){
        super(r);
        System.out.println(" i am cylinder 1 parameterized constructor");

        this.height =h;
    }
}

public class cwh_52 {
    public static void main(String[] args) {
        //problem 1
        //circle1 objC = new circle1(12);
        Cylinder1 onj = new Cylinder1(12,4);
    }
}
