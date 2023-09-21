package case_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee_Repo {
	List<Employee> e = new ArrayList<>();
	
	public void addEmp(Employee tmp) {
		e.add(tmp);
		
	}
	public Employee findById(int id) {
		Optional<Employee> tmp = e.stream().filter(x-> x.getId() == id).findAny();
		return tmp.orElseThrow(()->new RuntimeException("employee not found"));
	}
	public Employee update(Employee tmp, int id) {
		Employee x = findById(id);
		x.setCity(tmp.getCity());
		x.setDesig(tmp.getDesig());
		x.setId(tmp.getId());
		x.setName(tmp.getName());
		x.setSal(tmp.getSal());
		return x;
	}
	public List<Employee> findAll(){
		return e;
	}
	public Employee findBydesig(String d) {
		Optional<Employee> tmp = e.stream().filter(x-> x.getDesig() == d).findAny();
		return tmp.orElseThrow(()->new RuntimeException("employee not found"));
	}
	public Employee findByCity(String c) {
		Optional<Employee> tmp = e.stream().filter(x-> x.getCity() == c).findAny();
		return tmp.orElseThrow(()->new RuntimeException("employee not found"));
	}
	public void delete(int id) {
		e.remove(findById(id));
	}
	
};
