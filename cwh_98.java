import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98 {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance(TimeZone.getTimeZone("Asia/Srilanka"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
