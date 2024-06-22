package javaEmployee;

public class Inherite {
        void showA() {
        	System.out.println("hii A");
        	
        }
        class A extends Inherite{
        	void showB() {
        		System.out.println("hiii  B");
        		
        	}
        	public static void main(String[] args) {
        		Inherite ob = new Inherite();
        		ob.showA();
        	}
        	
        }
	
}
