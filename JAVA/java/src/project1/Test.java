package project1;

public class Test {
void show()
{
	System.out.println("1");
}
}
public class Xyz extend Test
{
void show()
{
	System.out.println("2");
}
public static void main(String[] arg)
{
	Test t=new Test();
	t.show(a,10);
    
	Xyz x=new Xyz();
	x.show(b,20);
}
}