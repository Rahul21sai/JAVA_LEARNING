import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString() {
        return "i am tostring";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";
    }
}
class MaxageException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "make sure the age is correct ";
    }
}


public class cwh_83 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<9) {
            try {
                //throw new Myexception();
                throw new ArithmeticException("this a exception");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
