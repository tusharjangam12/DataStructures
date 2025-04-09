package Practice;

import java.util.Scanner;

public class Employee {
int id ;
String name ;
int age;
double salary;
Scanner scan = new Scanner (System.in);

void accept ()
{
	System.out.println("Eneter Id:");
	id = scan.nextInt();
	//scan.nextLine();
	System.out.println("Enter Name :");
	name =  scan.nextLine();
	System.out.println("Enter Age :");
	age = scan.nextInt();
	System.out.println("Enter Salary :");
	salary = scan.nextDouble();
	}

void display () 
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(age);
	System.out.println(salary);
	}
	public static void main(String[] args) {
		Employee e = new Employee ();
		e.accept();
		e.display();
	}

}
