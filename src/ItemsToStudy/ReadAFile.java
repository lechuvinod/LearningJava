package ItemsToStudy;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

public class ReadAFile {

        public static final String LOG_CONTENT = "188.191.254.20,[22/Mar/2009:07:00:32 +0100],GET / HTTP/1.0,200\n"
                + "166.249.66.231,[22/Mar/2009:07:06:20 +0100],GET / HTTP/1.1,200\n"
                + "166.249.66.231,[22/Mar/2009:07:11:20 +0100],GET / HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET / HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /style.css HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/ht1.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/ht2.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/en.jpg HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/bt_qui.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/bt_references.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/bt_contacts.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/ht3.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/vide.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/ht4.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/contact.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/puce.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/h_facades.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:06 +0100],GET /images/f_blanc.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:07 +0100],GET /images/bt_mail.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:07 +0100],GET /images/v_home_1.gif HTTP/1.1,200\n"
                + "183.198.25.175,[22/Mar/2009:07:40:07 +0100],GET /favicon.ico HTTP/1.1,404\n"
                + "188.191.254.20,[22/Mar/2009:07:50:33 +0100],GET / HTTP/1.0,200\n"
                + "188.191.254.20,[22/Mar/2009:08:40:32 +0100],GET / HTTP/1.0,200\n"
                + "185.114.141.210,[22/Mar/2009:08:54:11 +0100],GET / HTTP/1.1,200\n"
                + "188.191.254.20,[22/Mar/2009:09:30:31 +0100],GET / HTTP/1.0,200\n"
                + "185.214.36.20,[22/Mar/2009:09:30:51 +0100],GET / HTTP/1.1,200\n"
                + "182.249.2.69,[22/Mar/2009:09:32:23 +0100],GET / HTTP/1.1,200\n"
                + "29.120.218.236,[22/Mar/2009:09:37:19 +0100],HEAD / HTTP/1.1,200\n"
                + "29.120.218.236,[22/Mar/2009:09:37:19 +0100],GET / HTTP/1.1,200\n"
                + "29.120.218.236,[22/Mar/2009:09:37:19 +0100],GET / HTTP/1.1,200";

        public static class IPCount {
            public String ipAddress;
            public int count;


        }

    public static IPCount findMostFrequentIP(@NotNull BufferedReader reader) throws IOException {
          /*  int bufferReader = reader.read();
            int i = 0;
        int buffer = (int)LOG_CONTENT.length();
        int arrayLength[] = new int[buffer];
            for(i=0;i<buffer;i++) {
                arrayLength[i] = bufferReader;
                bufferReader = reader.read();

        }*/
        throw new UnsupportedOperationException("Waiting to be implemented.");

        /*return ;*/
        }

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new StringReader(LOG_CONTENT));
            IPCount ipcount = findMostFrequentIP(reader);
            System.out.println("IP address: " + ipcount.ipAddress);
            System.out.println("Occurrence: " + ipcount.count);
        }
    }


