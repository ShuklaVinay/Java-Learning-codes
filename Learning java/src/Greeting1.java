public class Greeting1
{
    public static void main(String[] args)
    {
     String fName="vinay";
     String mName="kumar";
     String lName="shukla";
     //concat string by using + operator
        System.out.println("concat all three strings : "+ " "+fName+" "+mName+" "+lName);
        //concat string by using concat() method
        System.out.println(fName.concat(mName).concat(lName));
    }
}
