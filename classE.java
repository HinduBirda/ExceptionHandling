package Inheritance;
class classE extends D{
    public static void main(String args[]){
    	int x[]={1,2,3};
    	System.out.println("hi");
    	try{
    		System.out.println(x[3]);
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
      classE obj= new classE();
      obj.add(2,3);
      obj.add();
      obj.Print();
      obj.multiply(3,2);
    }
  }


