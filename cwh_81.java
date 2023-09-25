import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int[] marks;
        marks = new int[3];
        marks[0]=10;
        marks[1]=15;
        marks[2]=20;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array index");
        int ind =sc.nextInt();

        System.out.println("enter the the number you want to divide the value with");
        int number=sc.nextInt();
        try{
            System.out.println("the value of the array index enterd is :"+ marks[ind]);
            System.out.println("the value of array value/number is :" +
                    marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured ");
            System.out.println(e);

        }
        catch(Exception e){
            System.out.println("some other exception occured!");
            System.out.println(e);
        }



    }
}
