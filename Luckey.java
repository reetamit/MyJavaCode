import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.List;

public class Luckey {
    public static void main(String[] args) {
        int l=1283076;
        BLNumber(l);
    }

    public static void BLNumber(int l)
    {
        int rem=0;
        boolean arr[] = new boolean[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=false;
        }

        while(l!=0)
        {
            rem=l%10;
            if(arr[rem])
            {
                System.out.println("False");
                return;
            } else {
                l/=10;
                arr[rem]=true;
            }
        }
        System.out.println("True");
    }
    public static void LNumber(int l){
        int rem=Integer.MAX_VALUE;
        List<Integer> temp=new ArrayList<Integer>();

        while(l!=0)
        {
            rem=l%10;
            l/=10;
            if(temp.contains(rem))
            {
                temp.add(rem);
                System.out.println("False");
                return;
            }else {
                temp.add(rem);
            }
        }
        System.out.println("TRUE");
    }
}
