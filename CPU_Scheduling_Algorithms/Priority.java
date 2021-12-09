/**
 * Non-preemptive priority scheduling algorithm.
 */
 
import java.util.*;
public class Priority implements Algorithm
{
	ArrayList<Task> list = new ArrayList<Task>();
	int num = 0;
	
	Priority(List<Task> queue)
	{
		for (Task task: queue)
		{
			list.add(task);
		}
		Collections.sort(list);
	}

	@Override
	public void schedule() {
		for (Task task: list)
		{
			CPU.run(this.pickNextTask(), task.getBurst());
			System.out.println("Task " + task.getName() + " finished.\n");
		}
		this.pickNextTask();
		
		
	}

	@Override
	public Task pickNextTask() {
		Task nextTask;
		if (num + 1 != list.size() + 1)
			{
			nextTask = list.get(num);
			num += 1;
			return nextTask;
			}
		
		return null;
	}
	
	
}