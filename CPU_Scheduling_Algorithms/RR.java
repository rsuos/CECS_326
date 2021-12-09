/**
 * Non-preemptive priority scheduling algorithm using RR.
 *
 * This algorithm will run tasks according to round-robin scheduling.
 */
 
import java.util.*;

// Your code here

public class RR implements Algorithm
{
	List<Task> queue = new ArrayList<Task>();
	ArrayList<Task> list = new ArrayList<Task>();
	
	final int timeQuantum = 4;
	int taskAmount = 0;
	int num = 0;
	boolean start = true;
	
	RR(List<Task> queue)
	{
		this.queue = queue;
		taskAmount = queue.size();
	}

	@Override
	public void schedule() {
		while (!list.isEmpty() || start)
		{
			start = false;
			Task current = this.pickNextTask();
			CPU.run(current, current.getBurst());
			current.setBurst(current.getBurst() - timeQuantum);
			if (current.getBurst() <= 0) 
			{
				System.out.println("Task: " + current.getName() + " finished.\n");;
				list.remove(0);
			}
		}
		
	}

	@Override
	public Task pickNextTask() {
		
		Task nextTask = null;
		
		if (num + 1 != queue.size() + 1)
			{
			nextTask = queue.get(num);
			num += 1;
			list.add(nextTask);
			}
		
		Collections.sort(list, new SortByBurst());
		
		if (!list.isEmpty()) 
			{
			nextTask = list.get(0);
			return nextTask;
			}
		else return null;
	}	
	
	
}

