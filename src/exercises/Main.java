package exercises;

class Main extends Parent {
	  
	  public void method1(){
	    System.out.println("abstract method1 implementation in main class");
	  }
	  
	  public void method2(){
	    System.out.println("abstract method2 implementation in main class");
	  }
	  
	  public static void main(String[] args) {
		Parent p = new Main();
		p.method1();
	}
}
