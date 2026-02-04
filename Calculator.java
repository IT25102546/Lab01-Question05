   public class Calculator {
   
      public static int add(int a, int b){
	  
          return a + b;
		  
		  }
		  
	  public static int multiply(int a, int b){
	  
	      return a* b;
		  
	  }
	  
      public static int square(int a) {
	  
	      return a * a;
		  }
		  
		  public static void main(String[] args) {
		  
		  int result1 = square(add(multiply(3,4),multiply(5,7)));
		  
		  int result2 = square(add(4,7))+ square(add(8,3));
		  
		  System.out.println("Result of (3 * 4 + 5 * 7)² : " + result1);
		  System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);
		  
		  
		  }
		  
		  } 