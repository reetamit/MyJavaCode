package InterviewQuestions;
class FindTwoSumCloseToZero {

    public static void main(String[] args) {
        
        int[] numberlist = {1, 60, -10, 70, -80, 85};
        for (int i : SumofTwoNumber(numberlist)) {
            
            System.out.println(i);
        }
    }


    public static int[] SumofTwoNumber(int[] numberlist)
    {
        int[] twonumber= new int[2];
        int sum=0;
        int closetozero= Integer.MAX_VALUE;

        for(int i =0; i<numberlist.length;i++)
        {
            for(int j=i+1;j<numberlist.length;j++)
            {
                sum=numberlist[i]+numberlist[j];
                
                if(Math.abs(sum)>=0 && Math.abs(sum) < closetozero)
                {
                    closetozero=Math.abs(sum);
                    twonumber[0]=numberlist[i];
                    twonumber[1]=numberlist[j];
                }
            }
        }

        return twonumber;
    }

}