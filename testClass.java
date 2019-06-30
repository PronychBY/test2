
public class testClass {
	public static void task1() {
		//initialization
		int a = 3;
		int b = 2;
		int c = 8;
		
		//logic
		double result = ((a-3)*b/2)+c; 
		
		System.out.println("((a-3)*b/2)+c="+result);
	}
	
	public static void task2() {
		//initialization
		double a = 3;
		double b = 2;
		double c = 8;
		
		//logic
		double result = 
			(b+Math.sqrt(b*b+4*a*c))/ 
			2*a - a*a*a*c+Math.sqrt(b); 
		
		System.out.println("result test2="+result);
	}
	
	public static void task3() {
		//initialization
		double x = 3;
		double y = 2;
		
		//logic
		double result = 
			(Math.sin(x)+Math.cos(y))/ 
			(Math.cos(x)-Math.sin(y))*Math.tan(x*y); 
		
		System.out.println("result test3="+result);
	}
	
	
	public static void main(String[] args) {
		task1();
		task2();
		task3();
	}

}
