import java.util.Scanner;
public class array {
    public static void main(String[]args){
        /*int[]age  = {12,3,5};
        System.out.println("using for each loop :");
        for(int a : age){
            System.out.println(a);*/
        Scanner s = new Scanner(System.in);
        int [] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int sum  = 0;
        double Average;
        // access all elements through for loop
        for (int num :numbers){
            sum += num;
        }
        int arraylength=numbers.length;
        Average =( (double)sum/(double)arraylength);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+ Average);

    }

}
