class OuterClass1
{
    int x=30;
    static class InnerClass1
    {
        int y=500;
    }
}
class InOut1
{
    public static void main(String[] args)
    {
        OuterClass1.InnerClass1 myInner=new OuterClass1.InnerClass1();
        System.out.println(myInner.y);
    }
}
