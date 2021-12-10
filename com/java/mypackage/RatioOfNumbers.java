import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RatioOfNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

            Float positive=0.000000f,negetive=0.000000f,zero=0.000000f;

        for (Integer integer : arr) {
            if(integer>0)
            positive ++;
            else if(integer==0)
            zero++;
            else 
            negetive++;

        }
        bufferedReader.close();
        DecimalFormat df = new DecimalFormat("##.000000");
       // df.setMaximumFractionDigits(6);
        System.out.println(df.format(positive/n));
        System.out.println(df.format(negetive/n));
        System.out.println(df.format(zero/n));
    }
}