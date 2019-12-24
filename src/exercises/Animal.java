package exercises;

public class Animal {
	
	Animal(){
		super();
		System.out.println("I am an animal");
	}
	
	public static void main(String[] args) {
		Animal a = new Cat("Jimmy");
		a = new Cat("as", 2);
	}
}


class Cat extends Animal{
	
	Cat(){
		super();
		System.out.println("I am Cat");
	}
	
	Cat(String name){
		super();
	}
	
	Cat(String name, int a){
		this();
	}
}
