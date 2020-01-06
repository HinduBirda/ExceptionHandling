package ExceptionHandling;

public class NumberFormatException {

	public static void main(String[] args) {
		try{
			 int num=Integer.parseInt ("XYZ") ;
			 System.out.println(num);
		      }
		catch(Exception e){
			  System.out.println("Number format exception occurred");

	}

}
}