import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



class CallableTask3 implements Callable<String>{
	
	
	
	private String name;

	public CallableTask3(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		return "Hello "+ name;
	}
	
}


public class MultipleAnyCallableRunner {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws ExecutionException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		// TODO Auto-generated method stub
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallableTask3> tasks=List.of(new CallableTask3("Suresh"),new CallableTask3("Aswath"),new CallableTask3("Saranya"),new CallableTask3("Aksharasree"));
		
		String result = executorService.invokeAny(tasks);
		
			System.out.println(result);
		//Future<String> futureString = executorService.submit(new CallableTask("Suresh"));
		//System.out.println("new CallableTask(\"Suresh\"))");
		
		//String welcomemsg = futureString.get();
		
		//System.out.println(welcomemsg);
		
		System.out.println("Main method completed...");
		
		
		executorService.shutdown();

	}

}
