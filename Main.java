import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
{
     int choice=0;
     boolean b=false;
     Emp e=null;
    do
   {
    Scanner sc=new Scanner(System.in);
     System.out.println("1.create\n 2.Display\n 3.Raise Sal\n 4.Exit\n Enter choice");
     choice=sc.nextInt();
 
    switch(choice)
    {
     case 1:  e= new Emp();
              b=true;
              break;
     case 2: if(b)
             e.display();
             else
             System.out.println("no records");
             break;
     case 3: if(b)
             e.raiseSal();
             else
              System.out.println("no records");
             break;
     }

   }while(choice>0 && choice<4);

 }
}