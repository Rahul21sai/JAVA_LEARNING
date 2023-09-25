// program to display number from 1 t0 5
import java.util.Scanner;
public class number1to5 {
    public static void main(String[] args) {
      /* int i=1, n =5;
        while(i<=n){
            System.out.println(i);
            i++;*/
        // compute the first 5 positive numbers
        double number, sum = 0.0;
        Scanner s = new Scanner(System.in);
        for(int i=1;i<6;++i){
            System.out.println("Enter number"+i +":");
            number =s.nextDouble();
            if (number<=0.0){
                continue;
            }
            sum+= number;
        }
        System.out.println("sum = "+sum);
        s.close();

    }
}
