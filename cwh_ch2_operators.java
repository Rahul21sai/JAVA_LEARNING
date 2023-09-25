public class cwh_ch2_operators {
    public static void main(String[] args) {
        // arithmetic operator
        int a =5;//= is assignment operator
        int b =7+a;
        int c =13%a;// modulo operator
        //4.8%1.1 --> Returns decimal remainder
         b += 3;
        System.out.println(b);
        System.out.println(c);
        System.out.println(6==6);//comparison operator
        System.out.println(64>6 && 64>8);// logical operator
        System.out.println(64>6 || 64>99);
        // bitwise operator
        System.out.println(2&3);// 10
                                // 11
                               // -------
                               //  10
    }
}
