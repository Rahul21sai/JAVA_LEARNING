class Cylinder{
    private int radius; //using setter and getter
    private int height;

    public Cylinder(int height , int radius) {// using constructer
        this.height = height;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
    private int length;
    private  int breadth;
    public Rectangle(){
        this.length = 4;
        this.breadth = 5;

    }
    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;

    }

    public int getLength() {
        return length;

    }

    public int getBreadth() {
        return breadth;
    }
}


public class cwh_44 {
    public static void main(String[] args) {
        // problem 1
        Cylinder c = new Cylinder(10,5);// using constructer
       // Cylinder c = new Cylinder();// getter and setter
       // c.setHeight(10);
        //c.setRadius(5);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        // problem 2
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

        // problem 3
        Rectangle r = new Rectangle(4,5);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
