public class TestAQueue
{
	public static void main(String args[])
	{
		QueueArrayBased queue = new QueueArrayBased();
		
		queue.enqueue("First");
		
		System.out.println("Item at the front of the queue: " + queue.peek());
		
		queue.enqueue("Second");
		queue.enqueue("Third");
		
		queue.dequeue();
		
//		queue.dequeueAll();
		
		queue.enqueue("Fourth");
		queue.enqueue("Fifth");
		
		System.out.println("Is the queue empty?: " + queue.isEmpty());
		
		System.out.print("Horizontal queue list: ");
		QueueArrayBased.displayQueue(queue);
		
		System.out.println();
		System.out.println("Are the following Palindrome?");
		System.out.println(isPal("Leo"));
		System.out.println(isPal("wow"));
	}
	
    public static boolean isPal(String s)
    {
        StackReferenceBased stack = new StackReferenceBased();
        QueueArrayBased queue = new QueueArrayBased();

		String str = new String();
		
		for (int i = 0; i < s.length(); i++) {
		    str = "" + s.charAt(i);
		    System.out.println(str);
		    queue.enqueue(str);
		    stack.push(str);
        }
        while (!queue.isEmpty()) {
            if (!queue.dequeue().equals(stack.pop()))
                return false;
        }
        return true;
    }
}