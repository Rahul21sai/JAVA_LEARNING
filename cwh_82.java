import java.util.Scanner;

public class cwh_82 {
    public static void main(String[] args) {
        int[] marks;
        marks = new int[3];
        marks[0]=10;
        marks[1]=15;
        marks[2]=20;
        Scanner sc =new Scanner(System.in);
        boolean flag= true;
        while(flag) {
            System.out.println("enter the array index");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index doest exists");
                    System.out.println("exception in level 2");
                    System.out.println(e);
                }
            } catch(Exception e){
            System.out.println("this is a exception :");
            System.out.println(e);
        }
    }
        System.out.println("thanks for using this program");
    }
}
