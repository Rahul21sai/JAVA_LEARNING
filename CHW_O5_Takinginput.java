import java.util.Scanner;

public class CHW_O5_Takinginput {
    public static void main(String[] args) {
    System.out.println("Taking input from user");
    Scanner sc = new Scanner(System.in);
        System.out.println(" Entre number 1");
        int a = sc.nextInt();
        System.out.println(" entre number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(" the sum of these numbers is ");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        System.out.println(" Entre number 1");
        float e = sc.nextFloat();
        System.out.println(" entre number 2");
        float r = sc.nextFloat();
        float sum2 = e+r;
        System.out.println(" the sum of these numbers is ");
        System.out.println(sum2);
String str = sc.next();
        System.out.println(str);

    }
}
