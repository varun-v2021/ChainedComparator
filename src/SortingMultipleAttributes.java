import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingMultipleAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Xenon", 10000, 35));
		employees.add(new Employee("Araon", 18000, 25));
		employees.add(new Employee("Araon", 25000, 25));
		employees.add(new Employee("Tritium", 20000, 38));
		employees.add(new Employee("Boron", 10000, 50));
		employees.add(new Employee("Borom", 10000, 50));
		employees.add(new Employee("Oxygen", 10400, 15));
		employees.add(new Employee("Radium", 17000, 66));
		employees.add(new Employee("Carbon", 30000, 90));

		System.out.println("\n*** Before sorting:");

		for (Employee emp : employees) {
			System.out.println(emp);
		}

		Collections.sort(employees,
				new EmployeeChainedComparator(new EmployeeNameComparator(), new EmployeeSalaryComparator()));
		System.out.println("\n*** After sorting:");

		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

}
