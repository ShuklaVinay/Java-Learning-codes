import java.sql.SQLOutput;

public class RealExample {
    public static void main(String[] args) {
        int myAge = 25;
        int votingAge = 18;
        if(myAge >= votingAge)
        {
            System.out.println("old enough for vote");
        }
        else
        {
            System.out.println("old not enough for vote");
        }
    }
}