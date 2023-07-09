
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

	private int number;


	
	public Task(int i) {
		// TODO Auto-generated constructor stub
		this.number = i;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Task"+number+" started");
		for(int i=number*100;i<=number*100+99;i++) {
			System.out.print(i+" ");
			
		}
		
		System.out.println("Task"+number+" stopped");
		
	}
	
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			//used for creating single thread
			//ExecutorService executorService = Executors.newSingleThreadExecutor();
			ExecutorService executorService = Executors.newFixedThreadPool(2);
//			executorService.execute(new Task1());
//			executorService.execute(new Thread(new Task2()));
			executorService.execute(new Thread(new Task(1)));
			executorService.execute(new Thread(new Task(2)));
			executorService.execute(new Thread(new Task(3)));
			executorService.execute(new Thread(new Task(4)));
			executorService.shutdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

