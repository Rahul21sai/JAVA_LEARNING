import java.util.Scanner;

public class CWH_06_question {
    public static void main(String[] args) {
        System.out.println("Taking marks from the user");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number 1");
        int sub1 = sc.nextInt();
        System.out.println("enter number 2");
        int sub2 = sc.nextInt();
        System.out.println("enter number 3");
        int sub3 = sc.nextInt();
        System.out.println("enter number 4");
        int sub4 = sc.nextInt();
        System.out.println("enter number 5");
        int sub5 = sc.nextInt();
        int sum  = sub1+sub2+sub3+sub4+sub5;
        System.out.println(sum);
        float total= 100*5;
        System.out.println(total);
        float percent=(sum/total)*100;
        System.out.println(percent);
        }

}





