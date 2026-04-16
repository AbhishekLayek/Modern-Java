/*
 * Virtual Thread: A virtual thread is a lightweight thread managed by the programming language (not directly by the operating system). It lets you run many tasks at the same time without the heavy cost of traditional threads.
 */

package Java21;

public class VirtualThread {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable task = () -> {
			for(int i = 1; i < 10000; i++) {
				System.out.println(i);
			}
		};
		
		Thread t = Thread.startVirtualThread(task);
		t.join();
	}
}
