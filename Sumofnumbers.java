import java.util.Scanner;
class Sumofnumbers{
    public static void main(String[]args
    ){
        int sum =0;
        //create an object for scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number =input.nextInt();
        // while loop continues
        while(number >= 0 ){
            sum += number;
            System.out.println("enter the number :");
            number = input.nextInt();
        }
        System.out.println("sum = "+sum);
        input.close();


    }
}
