package ExceptionHandling;

public class InterruptedException {

	public static void main(String[] args) {
		try {
			  Thread.sleep(100);
			} catch (Exception e) {
			  throw new RuntimeException(e);
			}

	}

}
