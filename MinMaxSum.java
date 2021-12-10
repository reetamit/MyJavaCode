import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        arr.stream().forEach(System.out::println);
        double sumMin = arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3);
        double sumMax= arr.get(1)+arr.get(2)+arr.get(3)+arr.get(4);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
String input = "07:05:45PM";
        //Date/time pattern of input date (12 Hours format - hh used for 12 hours)

        DateFormat inFormat = new SimpleDateFormat( "HH:mm:ss");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm a");
        Date date;
        try {
            date = inFormat.parse(input);
            System.out.println(outFormat.format(date));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

       
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       // List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //    .map(Integer::parseInt)
        //    .collect(Collectors.toList());

        //Result.miniMaxSum(arr);

       // bufferedReader.close();
    }
}

