package scan.java.program;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
       Scanner scan=new Scanner(System.in);
       String packName=""; short packValue=0;
       long cusID=0L; int duration=0;
       
       System.out.println("Tell us Package name: ");
       packName=scan.nextLine();
       System.out.println("Tell us Customer ID: ");
       cusID=scan.nextLong();
       System.out.println("Tell us Pack Value ");
       packValue=scan.nextShort();
       System.out.println("Duration");
       duration=scan.nextInt();
       
       System.out.println("Congrats  your package "+packName+" for the Customer ID"+cusID+" has recharged with "+packValue+" for days of "+duration);
    }
}
