import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_99 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        GregorianCalendar cal =new GregorianCalendar();
        System.out.println(cal.isLeapYear(2023));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
    }
}
