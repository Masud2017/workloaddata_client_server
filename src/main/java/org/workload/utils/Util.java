package org.workload.utils;

import com.google.common.io.Resources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Util {
    private Logger logger = LoggerFactory.getLogger(Util.class);

    public static boolean sendBrowserResponseIfRequestIfFromBrowser(byte[] reqData, PrintWriter writer) throws FileNotFoundException {
        String byteToString = new String(reqData, StandardCharsets.UTF_8);

        File file = new File(Resources.getResource("test.html").getPath());
        Scanner fileReader = new Scanner(file);
        String htmlRes = "";
        while(fileReader.hasNext()) {
            htmlRes += fileReader.nextLine();
        }

        String responseStr =  "HTTP/1.0 200 OK\n"+"Server: workload server\n"+"Accept-Ranges: bytes\n" +
                String.format("Content-Length: %d\n",htmlRes.length()) +
                "Content-Type: text/html\n" +
                "Date: Sat, 15 Oct 2022 09:47:28 GMT\n" +
                "Expires: Sun, 23 Oct 2022 09:47:28 GMT\n" +
                "Last-Modified: Tue, 22 Oct 2019 18:30:00 GMT\n" +
                "X-Content-Type-Options: nosniff\n" +
                "X-XSS-Protection: 0\n\n";


        if (byteToString.contains("User-Agent")) {
            writer.write(responseStr + htmlRes);
            writer.flush();
            return true;
        }
        return false;
    }
}
