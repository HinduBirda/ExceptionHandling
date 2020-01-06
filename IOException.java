package ExceptionHandling;

public class IOException {

	public static void main(String[] args) {
		try
		{
		    
		}
		catch(Exception e)
		{
		    IOException.printStacktrace();
		}
		finally
		{
			System.out.println("hey");
		}

	}

	private static void printStacktrace() {
		System.out.println("hi");
		
	}

}
