
// rock paper scissor game

import java.util.Random;
import java.util.Scanner;
public class cwh_41 {
    public static void main(String[]args){
        // 0 for rock
        //1 for paper
        // 2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter 0 for rock , 1 for paper , 2 for scissor ");
        int userinput = sc.nextInt();

        Random rand = new Random();
        int cinput = rand.nextInt(3);

        if (userinput == cinput){
            System.out.println("draw");
        } else if (userinput == 0 && cinput == 2 || userinput == 1 && cinput == 0 ||
        userinput ==2 && cinput == 1) {
            System.out.println("you win! ");


        }
        else{
            System.out.println("computer win!");
        }
        System.out.println("computer chooice :"+cinput);
        if(cinput ==0){
            System.out.println("rock");
        } else if (cinput ==1) {
            System.out.println("paper");
        } else if (cinput == 2){
            System.out.println("scissor");
        }
    }
}
