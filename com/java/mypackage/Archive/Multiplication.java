class Mutiplication{
    public static void main(String[] args) {
    int sum=0;
    for(int i=0;i<1000;i++)
    {
        int mutipleof5=i%5;
        int multipleof3=i%3;
        if(mutipleof5==0 || multipleof3==0)
        {
            sum = sum + i;
        }
    }
        System.out.println("Sum :"+sum);
    }
}