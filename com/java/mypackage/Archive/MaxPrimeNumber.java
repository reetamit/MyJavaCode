import java.time.LocalDateTime;
import java.util.Date;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

public class MaxPrimeNumber {
    public static void main(String[] args) {


        int nth=0;
        int number=0;
        while(true)
        {
            number++;
            if(isPrime(number))
            {
                nth++;
                if(nth==10001)
                break;
            }
        }
        System.out.println(number);
        LocalDateTime end = LocalDateTime.now();
    }

    static boolean isPrime(int num)
    {
        boolean isPrimeNum = true;
        int limit = num;
        if(num<=1)
        {
            isPrimeNum = false;
            return isPrimeNum;
        }

        for(int i=2; i<=limit/2;i++)
        {
            if(num % i == 0)
            {
                isPrimeNum = false;
                break;
            }
        }
            return isPrimeNum;
    }
}
