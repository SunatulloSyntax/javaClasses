package exercises;

public class Method {

	public static void main(String[] args) {
    myNewLesson("Sam");
    myNewLesson("ALi");
    myNewLesson("Vali");
    add(1,3);
    add(1,3);
    add(4,3);
    add(2,5);
    
		
		
	}
	public static void myNewLesson(String name)
	{
		System.out.println("Hello it's " + name);
	}
	
	public static void add(int a,int b) 
	{
		int sum = a + b;
		System.out.println("The addition of " + a + " and " + b + " is " + sum);
	}

}
