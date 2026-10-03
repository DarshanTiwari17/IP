abstract class Bank
{
    abstract void interestRate();
    void openAccount()
    {
        System.out.println("Account Opened");
    }
}

class SBI extends Bank
{
    @Override
    void interestRate()
    {
        System.out.println("SBI interest rate is 6%");
    }
}

class HDFC extends Bank
{
    void interestRate()
    {
        System.out.println("HDFC interest rate is 8%");
    }
}

class Outer
{
    static class Inner{
        void printer()
        {
            System.out.println("Hello");
        }
    }
}






public class MainClass
{
    public static void main (String[] args)
    {
        Bank b1 = new SBI();
        b1.openAccount();
        b1.interestRate();

        Bank b2 = new HDFC();
        b2.openAccount();
        b2.interestRate();

        Outer.Inner i1 = new Outer.Inner();
        i1.printer();

    }
}
