

class Person{
	private String name;
	private String address;
	private String phone;
	private String email;
	public Person(String pname, String paddress, String phNum, String pemail) {
		name=pname;
		address = paddress;
		phone = phNum;
		email= pemail;
	}
	public String toString() {return getClass().getName() + ": " + name;}
}
class Student extends Person{
	final int freshman = 1;
	final int sophomore =2;
	final int junior = 3;
	final int senior = 4;
	String status = "freshman";
	
	public Student(String name, String address, String phonenumber, String email, int Status) {
		super(name,address,phonenumber,email);
		if(Status ==1) { status = "freshman";}
		if(Status ==2) { status = "sophomore";}
		if(Status ==3) { status = "junior";}
		if(Status ==4) { status = "senior";}
		else { status = "student";}
		}
	public String toString() {return super.toString();
}
class Employee extends Person{
	private String office;
	private double salary;
	java.util.Date dateHired;
	
	public Employee(String name, String address, String phonenumber, String email, String off, double sal) {
		super(name, address, phonenumber, email);
		office = off;
		salary =  sal;
	}
	public String toString() { return (super.toString() + " " + office + " " + salary);}
}
class Faculty extends Employee{
	private String officeHours;
	private String rank;
	public Faculty(String name, String address, String phoneNumber, String email, String off, int salary, String offHours, String ranks) {
		super(name,address, phoneNumber,email,off,salary);
		officeHours = offHours;
		rank = ranks;
	}
	public String toString() { return(super.toString() + " " + officeHours + " " + rank);}
}
class Staff extends Employee{
	private String title;
	public Staff(String name, String address, String phonenumber, String email,String off, int salary, String tit) {
		super(name, address,phonenumber,email,off,salary);
		title= tit;
	}
	public String toString() { return (super.toString() + " " + title);}
}
public class part2{
	public static void main(String []args) {
		Person a = new Person("Macintosh", "New York", "123-456-7890", "hotdog@aol.com");
		Person b = new Student("Mike", "Oregon", "321-423-3433","mikeiscool@aol.com",2);
		Person c = new Employee("Angelo", "virginia", "433-342-6056", "fasd@gmail.com", "Mat", 90000);
		Person d = new Faculty("Donatello", "Maine", "932-324-2342", "fhrt@gmail.com","Sci",7000,"1am=5am", "manager");
		Person e = new Staff ("fred","California","781-432-2347","flhkjk@gmail.com", 120000, "Senior Enginner");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
	}
}







	
	
