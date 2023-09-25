public class cwh_80 {
    public static void main(String[] args) {
        int a =5000;
        int b = 0;
        // without try
        //int c = a/b;
        //System.out.println("the result is "+c);

        // with try
        try{
            int c = a/b;
            System.out.println("the result is "+c);

        }
        catch (Exception e){
            System.out.println("we failed to divide, Reaspn: ");
            System.out.println(e);
        }
        System.out.println("we reached the end of the program");


    }
}
