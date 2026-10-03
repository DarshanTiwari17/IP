public class Reverse
{
    public static void main(String args[])
    {
        int num = 12345;
        int num1 =1;
        while (num<=1)
        {
            num1  *=10 + (num1%10);
            num/=10;
        }
        System.out.println("Reverse:"+num);
    }
}