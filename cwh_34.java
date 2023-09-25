public class cwh_34 {
    static int factorial(int n){
        if(n==0  || n==1){
          return 1;
        }

        else{
            return n * factorial(n-1);
            }

    }
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;

            }
            return product;

        }
    }
    // pattern under recursion
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for (int i =0 ; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String[]args){
        int n= 5;
        System.out.println("the value of factorial is :"+factorial(n));
        System.out.println("the value of factorial is :"+factorial_iterative(n));
        pattern1_rec(7);
    }
}
