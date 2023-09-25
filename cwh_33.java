public class cwh_33 {
   /* static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a , int b , int c){
        return a+b+c;
    }
    static int sum(int a , int b , int c, int d){
        return a+b+c+d;
    }*/

    static int sum(int ...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
   public static void main(String[] args) {
        System.out.println("welcome to varargs" );
        System.out.println("the sum of 4 and 5 is :" + sum(4,5));
        System.out.println("the sum of 3, 4 and 5 is :" + sum(4,5,3));
        System.out.println("the sum of 2,3,4 and 5 is :" + sum(4,5,2,3));
       System.out.println("the sum of 2,3,4 and 5 is :" + sum(4,5,2,3,3));

    }
}
