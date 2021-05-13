# Assignment
Simple Code written to take employee details.
Business logic(Service class) and Main class(Utilization) are written separately.
In Emp class all the Parameters are declared 
String name, String job, Int name, Int age.
Input is taken from the user by using Scanner object.(sc)

like the name age,sal, job of the employee by using the methods in Scanner class like next(),nextInt(). And the methods to create the employee details and 
display their details of the employee that were created and Increasing their salary(raiseSal) methods are defined.
In the Main class.... variable choice is declared in order to give user the choice to choose the options



System.out.println("1.create\n 2.Display\n 3.Raise Sal\n 4.Exit\n Enter choice");
     choice=sc.nextInt();
	 
	 
	 
	
1)Create
2)Display
3)Raise salary.
4)Exit
that is kept in iterative statement for user felxibility and the choices are kept in switch case.
code is written in such a way that when ever the employee details are displayed or raised in salary when they are created else
the output will be no records.
if we give any number other than 0-4 the default statement is printed as invalid choice.
condition is 
while(choice>0 && choice<4)
