package Array_practice;

public class OccuranceDuplicateNumber {
	public static void main(String[] args) {
		int a[] = {0,1,2,3,6,3,2,3,2,1};
		int b[]=a.clone();
		for(int i = 0; i<a.length; i++)
		{
			
			int  c=0;
			for(int j=0; j<b.length; j++) {
				
				if(a[i] == b[j])
				{
					c++;
					b[j] ='\0';
					
				}
				
			}
		  if(c>0)
				System.out.println("Occurance are "+a[i] + " ,   howmany count  " +c);
			
		}
		
		
		
	}
	

}
