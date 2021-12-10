public class fibbonacci {
    static int n1=0,n2=1,n3=0,i=0;
    static int sum = 0;
    public static void main(String[] args) {
        while(true)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            i=n3;
            if(n3>=4000000)
            {
                break;
            }
            if(i%2==0)
            {
                sum=sum+n3;
                System.out.println("Sum:"+sum);
                System.out.println("n3:"+n3);
            }
        }
        System.out.println("Sum of even number from fibonacci:"+sum);
    }

   /* static void printfibbonacci(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            //System.out.println(","+n3);
            if(n3%2==0)
            {
                sum=sum+n3;
            }
            printfibbonacci(count-1);
        }
    }*/
}
