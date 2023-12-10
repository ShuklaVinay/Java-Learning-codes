import java.util.Scanner;
public class MyPackageClass
{
    public static void main(String[] args)
    {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the User Name:");
        String userName=myObj.nextLine();
        System.out.println("Enter the User Address");
        String userAddress=myObj.nextLine();
        System.out.println("User Name: "+ " "+userName);
        System.out.println("User Address :"+" "+userAddress);

    }
}
