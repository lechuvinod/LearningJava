package StudyMaterial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.Collectors;

public class DateForSample {


        public static void main(String[] args) {
           /* Calendar calendar = new GregorianCalendar();
            long startTime = calendar.getTimeInMillis();
            System.out.println(startTime);*/
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC);
            ZoneId zoneId = ZoneId.of("GMT");
            zonedDateTime = zonedDateTime.withZoneSameInstant(zoneId);
            zonedDateTime = zonedDateTime.minusDays(1);
            long millis = zonedDateTime.toInstant().toEpochMilli();
            System.out.println(millis);
        }

}
