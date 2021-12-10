interface Sayble{
    void say();
}

public class MethodReference {

    public static void saySomething()
    {
        System.out.println("Nothing to say!");
    }

    public void test()
    {
        System.out.println("Bla bla bla");
    }

    public static void main(String[] args) {
        
        Sayble m = MethodReference::saySomething;
        m.say();

        MethodReference m1=new MethodReference();
        Sayble s1=new MethodReference()::test;
        s1.say();
    } 
}

    


