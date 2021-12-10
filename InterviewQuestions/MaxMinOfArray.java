package InterviewQuestions;
public class MaxMinOfArray {

    public static void main(String[] args) {
        int[] numberlist = {12,25,8,55,10,33,17,11};
        MaxMin(numberlist);
    }

    public static void MaxMin(int[] numberlist)
    {
        int max=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<numberlist.length;i++)
        {
            if(numberlist[i]<min)
            {
                max=min;
                min=numberlist[i];
            } else if(numberlist[i]>max && numberlist[i]!=min)
            {
                max=numberlist[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
        
    }
    
}
