import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	//descending order
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getSalary() - o1.getSalary();
	}

}
