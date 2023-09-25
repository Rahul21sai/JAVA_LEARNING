public class cwh_35 {
    // practice 1 tables
     static void multiplication(int n){
         for(int i =1; i<=10; i++){
             System.out.format("%d X %d = %d\n", i ,n, i*n);
         }
     }
     //practice 2 pattern printing
    //*
    //**
    //***
    //****
     static void pattern1(int n){
         for(int i =0 ; i<n; i++){
             for(int j =0; j<i+1; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }
     // practice 3
     // sum of first n natural numbers
    // sum(n)= 1+2+3+4+5+....+n
    // sum(n) = n+ sun(n-1)
    static int sumrec(int n ){
         if (n==1){
             return 1;
         }
         return n + sumrec(n-1);
    }
    //practice 4 reverse pattern
    //****
    //***
    //**
    //*
    static void pattern2(int n){
         for (int i = n; i>=1; i--){
             for (int j=1; j<=i; j++){
                 System.out.print("*");
             }// should use 2 print statements for printing the patterns
             System.out.println();
         }
    }
    // fibinacci series 0,1,1,2,3,5,8,13,21....
    static int fib(int n ){
         if (n==1 || n==2){
             return (n-1);
         }else{
             return (n-1)+(n-2);
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
    public static void main(String[] args) {
        multiplication(10);
        pattern1(6);
        int c = sumrec(10);
        System.out.println(c);
        pattern2(5);
        int d = fib(5);
        System.out.println(d);
        pattern1_rec(10);
    }
}
