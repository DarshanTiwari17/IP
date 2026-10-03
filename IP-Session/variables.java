public class variables
{
    public int d;
    public String name;
    static int v=100;
    public variables(){
        this.name="Darshan";
    }
    public static void main(String[] args)
    {   // local variable
        int a=10;
        variables obj=new variables();
        System.out.println(" The Value of A is->  "+a);
        System.out.println("The name: "+obj.name);
        System.out.println("The value of v is->  "+obj.v);
        System.out.println("The value of d is->  "+obj.d);
    }
} 