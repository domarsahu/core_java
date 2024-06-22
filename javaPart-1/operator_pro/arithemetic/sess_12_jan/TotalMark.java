/* find the total mark and over all percntage of ashish, where 
 mark in science is 78
 mark in social science is 89
 mark in math is 99
 mark in english is 88
 mark in hindi is 67. 
full mark of everyn individual subject is 100 */

class TotalMark
{
	public static void main(String[] args)
	{
		int n1 = 78;
		int n2 = 89;
		int n3 = 99;
		int n4 = 88;
		int n5 = 67;
		int avg = (n1+n2+n3+n4+n5)*100/500;
		System.out.println("Total Perecntage is : "+ avg );
	}
}