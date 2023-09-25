class base{
    int x;

    public int base(){
        return x;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(" i am in base setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("i am a constructor");
    }
}
class derived extends base{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;

    }


}

public class cwh_45 {
    public static void main(String[]args){
     // inheritence
        // creating an object of base class
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
        // creating an object of derived class
        derived d = new derived();
        d.setY(43);
        System.out.println(d.getY());
    }


}
