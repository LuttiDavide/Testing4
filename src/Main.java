import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime odt = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = odt.getYear();
        int month = odt.getMonthValue();
        int day = odt.getDayOfMonth();
        String dayOfWeek = odt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        System.out.println("year : " + year);
        System.out.println("month : " + month);
        System.out.println("day : " + day);
        System.out.println("dayOfWeek : " + dayOfWeek);
    }
}