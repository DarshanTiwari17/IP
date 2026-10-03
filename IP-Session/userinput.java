import java.util.Scanner;
public class userinput
{
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      int age;
      System.out.println("Enter your Age: ");
      age = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the Name:");
      String name=sc.nextLine();
      System.out.println("The age is: "+age);
      System.out.println("The name is: "+name);

      if(age>50)
      {
        System.out.println("Get some rest");
      }
      else if (age >=18)
      {
        System.out.println("You are eligible!");
      }
      
      else
      {
        System.out.println("You are not eligible!");
      }
      sc.close();
    }
}