// custom class
class employee{
    int id ;
    String name ;
    int salary;
    public void printdetails(){
        System.out.println("my id is :" + id);
        System.out.println(("my name is :"+ name));
    }
    public int getsalary(){
        return salary;
    }
}
public class cwh_38 {
    public static void main(String[]args){
        System.out.println("this is custom class ");
        employee rahul = new employee();
        employee rahul1 = new employee();

        //instanting a new employee object
        // setting attributes
        rahul.id = 10;
        rahul.name = " code with rahul";
        rahul.salary = 20;
        rahul1.id = 11;
        rahul1.name = " code with rahul1";
        rahul1.salary = 30;
        // printing the attributes
        System.out.println(rahul.id);
        System.out.println(rahul.name);
        rahul.printdetails();
        rahul1.printdetails();
        int salary = rahul.getsalary();
        System.out.println(salary);



    }

}
