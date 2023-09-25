public class cwh_85 {
    public static int great(){
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("cleaning up resources..this is the end fo the program");
        }
        return  -1;
    }
    public static void main(String[] args) {
        int k =great();
        System.out.println(k);
        int a =7;
        int b = 9;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for the value of b="+b);
            }
            b--;
        }
        try{
            System.out.println(5/5);
        }finally{
            System.out.println("yes this is finally");
        }

    }
}
