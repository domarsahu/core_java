package project1;

public class Aa {
void show A()
{
	System.out.println("a class method");
}
}
class B extends Aa {
	System.out.println("b class method");

}
public static void main(String[] args)
{
	Aa ob1=new Aa();
	ob1.show A();
}
}