/* WAJP to create three integer variable and check var1 is greater than var2 and 
     var3 print boolean output. */

class ThreeInt 
{
	public static void main(String[] args) 
	{
		int var1 = 10;
		int var2 = 20;
		int var3 = 5;

		//boolean a = var1 > var2;
		//boolean b = var1 > var3;

		//System.out.println(" var1 is greater then: " +a);
		//System.out.println(" var1 is greater then: " +b);

		System.out.println(var1 > var2 && var1 > var3);
	}
}
