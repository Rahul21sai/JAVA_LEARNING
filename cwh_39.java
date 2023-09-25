class employeee{
    int salary;
    String name ;
    public int  getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String n ){
        name = n;

    }


}
class cellphone{
    public void ring(){
        System.out.println("ringing....");

    }
    public void vibrate(){
        System.out.println("vibrating....");

    }
    public void callfriend(){
        System.out.println("calling rahul.....");
    }
}
class square{
    int side;
    public int area(){
       return side* side;

    }
    public int perimeter(){
        return 4 * side ;

    }

}
class tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");

    }
}
// int /string --> use return
// void direct --> no   return



public class cwh_39 {
    public static void main(String[] args) {
        // problem 1
        employeee rahul11 = new employeee();
        rahul11.setname("naga sai rahul");
        rahul11.salary = 25000;
        System.out.println(rahul11.getSalary());
        System.out.println(rahul11.getName());
        // problem 2
        cellphone realme = new cellphone();
        realme.callfriend();
        realme.ring();
        realme.vibrate();
        //problem 3
        square sq = new square();
        sq.side = 10;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        //problem 4
        tommy payer1  = new tommy();
        payer1.fire();
        payer1.run();
        payer1.hit();





    }
}