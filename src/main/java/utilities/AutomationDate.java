package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class AutomationDate {
    private static final String ZONED_DATE_TIME_PATTERN =
            "([0-9]{4})-([0-9]{2})-([0-9]{2})T([0-9]{2}):([0-9]{2}):([0-9]{2}).([0-9]{3})Z";

    private AutomationDate() {
    }

    public static String format(Date date, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static Date addDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    public static Date getDate(String date) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }

    public static String getUTCTime(String dateTime) {
        Instant instant = Instant.parse(dateTime);
        return instant.toString();
    }

    public static String addUTCDays(String dateTime, int noOfDays) {
        Instant instant = Instant.parse(dateTime).plus(Period.ofDays(noOfDays));
        return getUTCTime(instant.toString());
    }

    public static Boolean isValidZonedDate(String dateTime) {
        return Pattern.matches(ZONED_DATE_TIME_PATTERN, dateTime);
    }
}
