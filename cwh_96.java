import java.util.Date;

public class cwh_96 {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(
                d.getDate()
        );
        System.out.println(d.getYear());
    }
}
