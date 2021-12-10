package InterviewQuestions;
public class FindSmallestSecondSmallest {
    

    public static void main(String[] args) {

        int[] numberlist = {12,25,8,55,10,33,17,11};
        FindTwoSmall(numberlist);
        
    }

    public static void FindTwoSmall(int[] numberlist)
    {
        int smallest=0,nextsmallest=0;
        smallest=Integer.MAX_VALUE;
        nextsmallest=Integer.MAX_VALUE;

        for(int i=0;i<numberlist.length;i++)
        {
            if(numberlist[i]<smallest)
            {
                nextsmallest=smallest;
                smallest=numberlist[i];
            } else if(numberlist[i]<nextsmallest && numberlist[i]!=smallest)
            {
                nextsmallest=numberlist[i];
            }
        }
        
        System.out.println("Smallest:"+ smallest);
        System.out.println("NextSmallest:"+nextsmallest);

    }
}


