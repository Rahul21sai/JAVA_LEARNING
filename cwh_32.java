public class cwh_32 {
    static void foo(){
        System.out.println(" good morning bro!");

    }
    static void foo(int a ) {
        System.out.println("good morning "+  a  +"bro!");
    }
    static void foo(int a , int b){
        System.out.println("good morning "+a  +"bro!");
        System.out.println("good morning "+b  + " bro!");
    }
    static void change(int a){
        a =98;

    }
    static void change2(int[]arr){
        arr[0]=98;
    }
    static void telljoke(){
        System.out.println("hello world");
    }

    public static void main(String[]args){
       telljoke();
        // caswe 1 : changing the integer
        int x = 45;
        change(x);
        System.out.println("the valuye of x after running change is :"+ x );
       // case 2 : changing the array
        int[] marks = {23,23,23,45,54,5};
        change2(marks);
        System.out.println("the value of x after running change is : "
       + marks[0]);

        //method over loading
        foo();
        foo( 3000);
        foo(3003,4000);// arguments are actual


    }
}
