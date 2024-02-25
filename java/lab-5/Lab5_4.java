import java.util.Scanner;
class Employee{
	int employee_id;
	String employee_name;
	String designation;
	int age;
	double salary;
}
   Employee(){
   	int employee_id=0;
	String employee_name="NULL";
	String designation="NULL";
	int age=0;
	double salary=0;
   }
class Employee{
	public void GetEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id:");
        employee_id = c.nextInt();
        System.out.println("enter employee name:");
        employee_name = c.nexLine();
        System.out.println("enter employee designation:");
        designation = c.nexLine();
        System.out.println("enter employee age:");
        age = c.nextInt();
        System.out.println("enter employee salary:");
        salary = c.nextDoble();
	}
	public void DisplayEmployeeDetails(){
		System.out.println();
		System.out.println("employee_id:"+employee_id);

	}
}