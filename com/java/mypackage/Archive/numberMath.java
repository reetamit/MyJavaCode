
public class numberMath {
static int a=1,b=1,rem=0;
    public static void main(String[] args) {
 
        //Find the smallest number which can be divisable by all numbers from 1 to 20
        while (b < 20){
            rem = a % b;
            if (rem != 0){
                a++;
                b = 1;
            }
            b++;
            }
            System.out.println(a);
        //End of code

        System.out.println(Sumsquaredifference(100));

    }

    static long Sumsquaredifference(int numlimit)
    {
        long sumOfSquers=0;
        long squereOfSum=0;
        //find the squere of the each number
        for(int i=1;i<=numlimit;i++)
        {
            sumOfSquers=sumOfSquers+i*i;
            squereOfSum=squereOfSum+i;
        }
        return ((squereOfSum*squereOfSum)-sumOfSquers);
    }

}
