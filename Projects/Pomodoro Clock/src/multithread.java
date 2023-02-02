import java.util.*;
class kelToCel extends Thread
{
    float kel,cel;
    public kelToCel(float a)
    {
        this.kel=a;
    }
    public void run()
    {
        cel=kel-273.15f;
        System.out.println("The temperature in Celcius is "+cel);
    }
}
class kelToFar extends Thread
{
    float kel,far;
    public kelToFar(float a)
    {
        this.kel=a;
    }
    public void run()
    {
        far=((kel-273.15f)*9f/5f)+32f; //try removing the brackets
        System.out.println("The temperature in Fahrenheit is "+far);
    }
}
class assignment
{
    public static void main(String args[])
    {
        float kel;
        System.out.println("Enter temperature in Kelvin");
        Scanner sc = new Scanner(System.in);
        kel=sc.nextFloat();
        kelToCel t1 = new kelToCel(kel);
        kelToFar t2 = new kelToFar(kel);
        t1.start();
        t2.start();
    }
}