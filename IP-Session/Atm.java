import java.util.Scanner;
public class Atm 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pass = 1234;
        int user;
        int i=1;
        int count = 2;
        do
        {
            System.out.println("Enter Your Atm Pin:");
            user = sc.nextInt();
            i++;
            if (pass == user)
            {
                System.out.println("Correct Password");
                break;
            }
            else
            {
                System.out.println("Try Again!"+"Attempt Remaining:"+count);
                --count;
            }
        } while(i<=3);
        
    }
}