package case_study;

public class Employee {
	int id;
	int sal;
	String name;
	String desig;
	String city;
	public Employee(int id, int sal, String name, String desig, String city) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.desig = desig;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + ", desig=" + desig + ", city=" + city + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
