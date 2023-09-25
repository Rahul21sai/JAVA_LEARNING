
class base1{
    base1(){
        System.out.println("i am constructor");
    }
    base1(int x){
        System.out.println(" i am  overloaded constrctor with value of a as :"+x);
    }
    public int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived1 extends base1{
    derived1(){
        super(0);
        System.out.println("i am a derived constructor" );
    }
    derived1(int x , int y){
        super(x);
        System.out.println(" i am a overloaded constructor of derived with value of y as :"+y);

    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println(" i am child of derived constructor");
    }
    childofderived(int x, int y , int z){
        super(x,y);
        System.out.println("i am overloaded constructor of derived with value of z as :"+z);
    }

}


public class cwh_46 {
    public static void main(String[] args) {
      //   base1 b = new base1();
        derived1 d = new derived1(4,3);
        childofderived g = new childofderived(3,5,7);
    }
}
