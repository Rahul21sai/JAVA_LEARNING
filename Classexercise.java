import java.util.Scanner;
public class Classexercise {
    public static void main(String[] args) {
        //Scanner s =new Scanner(System.in);
       /* System.out.println("inputnumber a:");
        double a = s.nextDouble();
        System.out.println("inputnumber b:");
        double b= s.nextDouble();
        System.out.println("input number c:");
        double c= s.nextDouble();
        double result = b * b - 4.0 * a * c;
        if(result>0.0){
            System.out.println("quadratic");
        }
        else if (result==0.0){
            System.out.println("equal roots");
        }
        else {
            System.out.println("no solution");

        }
       /* int e= in.nextInt();
        if(e>0){
            System.out.println("number is positive");
            }
        else{
            System.out.println("number is negative ");

        }*/
       /* System.out.println("enter the year ");
        int a = s.nextInt();
        if ((a%4)==0 || (a%400)==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("oridnary year");

        }*/


     /*   System.out.println("enter the temperature in celcius:");
        float celcius = s.nextFloat();
        double fareh = (1.8) * celcius + 32 ;
        System.out.println(" temperature in fareh:"+fareh);
*/
        /*int term = 6;
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j>= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

         */
       /* String s = "friends";
        int x = 0;
        do {
            System.out.println(s.charAt(x));
            x++;
        }while(x<2);

        */
       /* Scanner s = new Scanner(System.in);
        System.out.println("enter the width of the triangle");
        double b = s.nextDouble();
        System.out.println("enter the height of the triangle");
        double h = s.nextDouble();

        double Area= 0.5*b*h;
        System.out.println("area of triangle"+ Area);

        */
      // fabinoic series

       /* Scanner s = new Scanner(System.in);
        System.out.println("enter no of terms");
        int n = s.nextInt();
        int i =0, j =1 ,nextTerm;
        System.out.println("fabonaaci series:");
        for(int c =0; c<n; c++){
            if(c<=1)
            nextTerm=c;
            else{
                nextTerm=i+j;
                i=j;
                j=nextTerm;

            }
            System.out.println(nextTerm);
        }

        */
        long n, fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        n = s.nextLong();
        for(int i = 1; i<=n; i++){
            fact=fact*i;

        }
        System.out.println("fact"+fact);






    }
}