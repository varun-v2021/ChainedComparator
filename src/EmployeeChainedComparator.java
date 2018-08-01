import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainedComparator implements Comparator<Employee> {

	private List<Comparator<Employee>> listComparators;

	public EmployeeChainedComparator(Comparator<Employee>... comparators) {
		// TODO Auto-generated constructor stub
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		for (Comparator<Employee> comparator : listComparators) {
			int result = comparator.compare(o1, o2);
			if (result != 0)
				return result;
		}
		return 0;
	}
}
