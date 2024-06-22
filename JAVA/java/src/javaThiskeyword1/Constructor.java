package javaThiskeyword1;

public class Constructor {
	int id;
	String name;
	
	Constructor()
	{
		System.out.println("this is default constructor");
	}
	Constructor(int id,String name)
	{
		this();
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id +" "+name);
		System.out.println("This is parameternized constructor");
	}
public static void main(String[] args) {
	Constructor c1 = new Constructor(112,"Domar");
	c1.display();
}
}
