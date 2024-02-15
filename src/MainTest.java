import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void mainTest() {
        OffsetDateTime odt = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = odt.getYear();
        int month = odt.getMonthValue();
        int day = odt.getDayOfMonth();
        String dayOfWeek = odt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        assertEquals(2023, year);
        assertEquals(3, month);
        assertEquals(1, day);
        assertEquals("mercoledì", dayOfWeek);
    }
}