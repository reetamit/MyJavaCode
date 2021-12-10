
class Test{

String obj_name;

public Test(String odjName) {
    this.obj_name = odjName;
}

public static void main(String[] args) {
    Test t1=new Test("T1");
    Test t2=new Test("T2");

    t1=t2;
System.gc();
}

@Override
protected void finalize() throws Throwable
{
    System.out.println(this.obj_name + "garbage collected");
}

}