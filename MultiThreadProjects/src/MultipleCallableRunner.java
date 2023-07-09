import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



class CallableTask2 implements Callable<String>{
	
	
	
	private String name;

	public CallableTask2(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		return "Hello "+ name;
	}
	
}


public class MultipleCallableRunner {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws ExecutionException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		// TODO Auto-generated method stub
		
		ExecutorService executorService = Executors.newFixedThreadPool(2             );
		
		List<CallableTask2> tasks=List.of(new CallableTask2("Suresh"),new CallableTask2("Aswath"),new CallableTask2("Saranya"),new CallableTask2("Aksharasree"));
		
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
		//Future<String> futureString = executorService.submit(new CallableTask("Suresh"));
		//System.out.println("new CallableTask(\"Suresh\"))");
		
		//String welcomemsg = futureString.get();
		
		//System.out.println(welcomemsg);
		
		System.out.println("Main method completed...");
		
		
		executorService.shutdown();

	}

}
