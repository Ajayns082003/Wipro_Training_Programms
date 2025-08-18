package Day_06;

public class Array_Exception {
	    public static void main(String[] args) {
	    	int [] a= {10,20,40,50,80};
	    	int index=5;
	    	
	    	try {
	    		a[5]=90;
	    		System.out.println("90 is the value of index :" +index);
	    	}
	    	catch(Exception e){
	    		System.out.println("Array index out of bound");
	    	}
	    	finally {
				System.out.println("Program Completed...");
			}
	    	}
	     }


