import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
	
	
	
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		return "Hello "+ name;
	}
	
}


public class CallableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExecutorService executorService = Executors.newFixedThreadPool(3);
			Future<String> futureString = executorService.submit(new CallableTask("Suresh"));
			System.out.println("new CallableTask(\"Suresh\"))");
			
			String welcomemsg = futureString.get();
			
			System.out.println(welcomemsg);
			
			System.out.println("Main method completed...");
			
			
			executorService.shutdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
