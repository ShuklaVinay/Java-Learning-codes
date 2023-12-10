public class Simple
{
    public static void main(String[] args) {
        String str1=new String("hello vinay");
        String str2=new String("hello vinay");
        boolean referenceComparison=(str1==str2);  //different object
        System.out.println(referenceComparison);
        boolean contentComparison=str1.equals(str2); //same value(content)
        System.out.println(contentComparison);
    }
}
