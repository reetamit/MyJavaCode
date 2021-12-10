import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8APIUse {
    

    public static void main(String[] args) {
        int a[] = {2,3,4};
        List<Integer> pList= Arrays.stream(a).boxed().collect(Collectors.toList());
        
        int m = pList.stream().mapToInt(i -> (i*i)).sum();
        System.out.println(m);

    
    }
}
