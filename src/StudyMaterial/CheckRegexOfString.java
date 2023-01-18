package StudyMaterial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegexOfString {
    private static Pattern pattern = Pattern.compile("()$|VOLUME\\s");

    public static void main(String[] args) {
        StringBuilder q=new StringBuilder("query CID=rwm_khornfeck IDX=.GDAXI FID=C(1) SOR=VOLUME COU=10");
        StringBuilder q2=new StringBuilder("query EXC= FID=C(1);TARGETPRICE TYP=STO CID=\"ubs_vip_non-pro\" COU=10 INT=d FIL=VOLUME(1)>1000 SOR=VOLUME");

        Matcher m = pattern.matcher(q2);
        q2.replace(0, q2.length(), m.replaceAll("VOLUME(1)"));
        System.out.println(q2);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
