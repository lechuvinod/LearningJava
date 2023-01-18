package ItemsToStudy;

import java.nio.charset.StandardCharsets;

public class AddNewElemntsInStringBuilder {
    public static void main(String[] args) {
        StringBuilder query = new StringBuilder("history FID=TIME;OPEN;HIGH;LOW;CLOSE;VOLUME STA=1000048302521 ACD=D ARD=all OCV=STANDARD SYM=DAL.MI FOR=JSON INT=D CID=trkd_widiba END=1668513906423");
        forIndexChanges(query);
        fidTimeChanges(query);
    }
    public static void forIndexChanges(StringBuilder query) {
        System.out.println("First query in forIndexChanges====>" + query);
        int forIndex = query.indexOf("FOR=JSON");
        query.replace(forIndex, forIndex + 9, "FOR=TABLE ");
        System.out.println("Final query in forIndexChanges====>" + query);
    }
    public static void fidTimeChanges(StringBuilder query) {
        System.out.println("First query in fidTimeChanges====>" + query);
        int fidTime = query.indexOf("FID=TIME;");
        query.replace(fidTime, fidTime + 9, "FID=DATE;TIME;");
        System.out.println("Final query in fidTimeChanges====>" + ";");
    }
}
