package StudyMaterial;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

public class CheckRegexDatePattern {
    private static Pattern datePattern = Pattern.compile("\\d\\d:\\d\\d(:\\d\\d)(.\\d\\d\\d)?");

    public static void main(String[] args) {
        String firstValue = "03:46:53.383";
        String secondValue = "03:46:53.642";


        if (!firstValue.equals(secondValue)) {
            if (isTime(firstValue) && isTime(secondValue)) {
                LocalTime firstTime = LocalTime.parse(firstValue);
                LocalTime secondTime = LocalTime.parse(secondValue);
                long sec = Math.abs(firstTime.until(secondTime, ChronoUnit.SECONDS));
                System.out.println("firstTime===>" + firstTime);
                System.out.println("secondTime===>" + secondTime);
                System.out.println("sec===>" + sec);
            }

        }
    }

    public static boolean isTime(String strTime) {
        if (strTime == null) {
            return false;
        }
        return datePattern.matcher(strTime).matches();
    }
}
