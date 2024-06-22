package Array;

public class Array_Student {
	public static void main(String[] args) {
		
		Array_Student o1 = new Array_Student();
		Array_Student o2 = new Array_Student();
		Array_Student o3 = new Array_Student();
		Array_Student o4 = new Array_Student();
		Array_Student o5 = new Array_Student();
		
		Array_Student a [] = {o1,o2,o3,o4,o5};
//		
//		System.out.println(a);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
	//for each
		
		for(Array_Student x :a)
		{
			System.out.println(x);
		}
		
		
//		for(int i = 0; i<=a.length-1;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("### Backward ###");
//		for(int i = a.length-1; i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
	}

}
