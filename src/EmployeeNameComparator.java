import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	//ascending order
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
