public class cwh_25 {
    public static void main(String[] args) {
    /*int n = 4;
    for (int i = n ; i>0; i--){
        for (int j =0 ; j<i ; j++){
            System.out.print("*");
        }
        System.out.println("\n");
    }*/
    /*  int sum =   0;
      int n = 3;
      for(int i = 0; i<n ; i++){
          sum = sum +(2*i);
      }
        System.out.println("sum of even numbers is :" );
        System.out.println(sum);

     */
        int n= 5 ;
        int i = 1 ;
        int factorial = 1;
        while(i <=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }

}
