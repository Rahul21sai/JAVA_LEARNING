import java.util.Scanner;

public class chw_chap1_ps1 {
    public static void main(String[]args) {
        //question 1
        int a = 122;
        int b = 54;
        int c = 48;
        int sum = a + b + c;
        System.out.println(sum);
        //question 2
        float sub1 = 88;
        float sub2 = 99;
        float sub3 = 100;
        float cgpa = (sub1 + sub2 + sub3) / 30;
        System.out.println(cgpa);
        //question 3
        System.out.println("what is your name" );
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello " + name + " have a good day");
        //question 5
        System.out.println("Enter your number" );
        Scanner tt =new Scanner(System.in);
        System.out.println(tt.hasNextInt());
    }
}

