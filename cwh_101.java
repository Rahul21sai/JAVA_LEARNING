import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101 {
    public static void main(String[]args){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String Mydate = dt.format(df2);
        String mydate = dt.format(df);
        System.out.println(mydate);
        System.out.println(
                Mydate
        );
    }
}
