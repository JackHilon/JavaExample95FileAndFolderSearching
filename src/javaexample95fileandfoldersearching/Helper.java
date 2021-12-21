package javaexample95fileandfoldersearching;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    // To convert long value (Timestamp) to dateTime value as string
    
    
    
    // source: https://stackoverflow.com/questions/6782185/convert-timestamp-long-to-normal-date-format
    
    public static String ConvertTime(long time) {
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
        return format.format(date);
    }
    
}
