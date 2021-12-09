import java.util.Comparator;

public class SortByBurst implements Comparator<Task>
{

	@Override
	public int compare(Task a, Task b) {
		return a.getBurst() - b.getBurst();
	}
	
}