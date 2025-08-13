package singleton.design.pattern;

public class main {
	public static void main(String[] args) {
		
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		
		
		if(instance1==instance2) {
			System.out.print("Both are same");
		}
		
	}
}
