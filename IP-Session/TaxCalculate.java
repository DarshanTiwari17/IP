import java.util.Scanner;
public class TaxCalculate 
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Salary:");
    double sal = sc.nextDouble();
    // sc.nextLine();
    double tax = 0;
    if (sal<250000)
    {
        tax = 0;
    }
    else if (sal >= 250000&&sal<500000)
    {
        tax = sal*0.05;
    }
    else if (sal >= 500000&&sal<1000000)
    {
        tax = sal*0.20;

    }
    else if (sal==1000000)
    {
        tax = sal*0.30;
    }
    else
    {
        System.out.println("Please Enter Valid Salary Amount!");
    }
    
    System.out.println("Tax:"+tax);

   }
}