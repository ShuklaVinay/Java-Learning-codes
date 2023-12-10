class OuterClass
{
    int x=20;
    class InnerClass
    {
        int y=30;
    }
}
class InOut
{
    public static void main(String[] args)
    {
     OuterClass myOuter=new OuterClass();
      OuterClass.InnerClass myInner=myOuter.new InnerClass();
        System.out.println(myOuter.x+ myInner.y);
    }
}
