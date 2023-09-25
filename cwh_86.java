
import java.util.Scanner;

public class cwh_86 {
    public static void main(String[] args) {
        //prob 2
        try{
            int a =666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }
        boolean flag =true;
        int[]marks = new int[3];
        marks[0]=7;marks[1]=34;marks[2]=56;
        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;
        while(flag && i<5) {
            try {
                System.out.println("enter the value of index");
                index = sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[index]);
                break;

            } catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("error");
        }

    }
}
