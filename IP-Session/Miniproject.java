import java.util.Scanner;
public class Miniproject
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Quantity: ");
        int quan=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Price: ");
        int price=sc.nextInt();
        float total=quan*price;
        total = total>=1000?total-100:total;
        System.out.println("Total:"+total);
        
    }
}