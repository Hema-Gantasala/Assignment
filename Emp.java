import java.util.Scanner;
class Emp
   {
     String name;
     int age;
     int sal;
     String job;
    
      Scanner sc=new Scanner(System.in);
      Emp()
       {
        System.out.println("Enter your name:");
         name=sc.next();
        System.out.println("Enter your age:");
         age=sc.nextInt();
        System.out.println("Enter your sal:");
         sal=sc.nextInt();
        System.out.println("Enter your job:");
         job=sc.next();
        }
        public void display()
         {
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         System.out.println("Sal:"+sal);
         System.out.println("Job:"+job);
         }
      public void raiseSal()
         {
         sal=(sal*10)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 10%");
         }
     }
                
