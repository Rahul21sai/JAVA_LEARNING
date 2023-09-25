import java.util.Scanner;

class guessnumber{
     private int counter = 0;
     private int myNumber;
     private int compNumber;

     public guessnumber(){
         compNumber = (int)(Math.random()*100);
     }
     public void setnumber(int n){
         myNumber = n ;
     }
     public int isCorrect(){
         if(myNumber == compNumber){
             return 0;
         } else if (myNumber > compNumber) {
             return -1;

         }
         else {
             return 1;

         }

     }
     public void setCounter(){
         counter++;

     }
     public void getCounter(){
         System.out.println("the number of guess were"+ counter);
     }
 }
public class cwh_43 {
    public static void main(String []args){
        guessnumber obj = new guessnumber();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter a number between 1 to 100 (1-100):");
            int n = sc.nextInt();
            obj.setnumber(n);

            if(obj.isCorrect()==0){
                obj.setCounter();
                System.out.println("congratulations!! you have guessed the correct number");
                obj.getCounter();
                break;
            }
            else if(obj.isCorrect()==-1){
                obj.setCounter();
                System.out.println("enter the small number");

            }
            else if (obj.isCorrect()==1){
                obj.setCounter();
                System.out.println("enter larger number");
            }
        }

        /*
        create a class game , which allows a user to play "guess the number"
        game once , game should have following methods:
        1. Constructor to generate the random number
        2. takeuserinput() to take a user input of number
        3. iscorrectnumber() to detect whether the number entered by the user is true
        4. getter and setter for no guesses
        use properties such as no of guesses(int) etc det this task done!!

         */

    }

}
