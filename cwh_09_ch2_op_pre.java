public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        // precedence & associativity
        int r = 6*5-34/2;
        /*
        highest precedence goes to * and / .they are then evaluated on the basis
        of left to right associativity
         =30-34/2
         =30-17
         =13
         */
        int t = 60/5-34*2;
        /*
        =12-34*2
        =12-68
        =-56
         */
        System.out.println(r);
        System.out.println(t);
//      quick quiz
        int x =5;
        int y =4;
        int k =x*y/2;
        System.out.println(k);
        // 2nd question
        int b =8;
        int c =5;
        int a =2;
        int f = b*b -(4*a*c)/(2*a);
        System.out.println(f);
    }
}
