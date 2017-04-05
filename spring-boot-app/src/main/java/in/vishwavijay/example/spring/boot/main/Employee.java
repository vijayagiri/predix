package in.vishwavijay.example.spring.boot.main;

public class Employee {
	
	private int emplid;
	private String name;
	private float salary;
	
	
	public int getEmplid() {
		return emplid;
	}
	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int emplid,String name, float salary){
		
		this.emplid=emplid;
		this.name=name;
		this.salary=salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
