public class Palindrome {
    
public static void main(String[] args) {

int num1=0,num2=0,max=0,multiply=0,maxNum1=0,maxNum2=0;
    for(num1=999;num1>=100;num1--)
    {
        for(num2=num1;num2>=100;num2--)
        {
            multiply = num1*num2;
            if(isPalindrome(multiply) && max < multiply)
            {
                max = multiply;
                maxNum1=num1;
                maxNum2=num2;
            }
        }
    }

    System.out.println("The number"+ maxNum1+"X"+maxNum2+"="+ (max) +"is palindrome");
}

static boolean isPalindrome(int num)
{
    int reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = num;
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      return true;
    }
    else {
      return false;
    }
}

}
