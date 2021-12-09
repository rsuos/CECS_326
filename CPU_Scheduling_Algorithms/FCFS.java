/**
 * FCFS scheduling algorithm.
 */
 
import java.util.*;

import javax.print.attribute.standard.QueuedJobCount;

public class FCFS implements Algorithm
{
	List<Task> queue = new ArrayList<Task>();
	int num = 0;
	
	FCFS(List<Task> queue)
	{
		this.queue = queue;
	}

	@Override
	public void schedule() {
		for (Task task: queue)
		{
			CPU.run(this.pickNextTask(), task.getBurst());
			System.out.println("Task " + task.getName() + " finished.\n");
		}
	}

	@Override
	public Task pickNextTask() {
		Task nextTask;
		if (num + 1 != queue.size() + 1)
			{
			nextTask = queue.get(num);
			num += 1;
			return nextTask;
			}
		
		return null;
	}
	
}