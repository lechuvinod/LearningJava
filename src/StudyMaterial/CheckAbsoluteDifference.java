package StudyMaterial;

import java.util.regex.Pattern;

public class CheckAbsoluteDifference {
    private static Pattern numberPattern = Pattern.compile("[-+]?\\d+(\\.\\d+)?");

    public static void main(String[] args) {
        String firstValue = "1";
        String secondValue = "-";


        if (!firstValue.equals(secondValue)) {
            if (isNumeric(firstValue) && isNumeric(secondValue)) {
                double firstResultValue = Double.parseDouble(firstValue);
                double secondResultValue = Double.parseDouble(secondValue);
                double absolueDifference = Math.abs(firstResultValue - secondResultValue);
                System.out.println("absolueDifference====>"+absolueDifference);
            }
        }
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return numberPattern.matcher(strNum).matches();
    }
}
