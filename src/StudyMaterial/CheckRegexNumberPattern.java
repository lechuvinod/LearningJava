package StudyMaterial;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class CheckRegexNumberPattern {
    private static Pattern numberPattern = Pattern.compile("[-+]?\\d+(\\.\\d*[Ee]?\\d+)?");

    public static void main(String[] args) {
        System.out.println("The value is numeric");
        String firstValue = "533482.0";
        String secondValue = "405047.0";
        if (isNumeric(firstValue)) {
            double firstResultValue = Double.parseDouble(firstValue);
            double secondResultValue = Double.parseDouble(secondValue);
            double absolueDifference = abs(firstResultValue - secondResultValue);
            if ((absolueDifference / firstResultValue) < 0.05) {
                System.out.println("The value is less than 0.05");
            } else {
                System.out.println("The value is greater than 0.05");
            }
        }
        else {
            System.out.println("The value is not numeric");
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return numberPattern.matcher(strNum).matches();
    }
}
