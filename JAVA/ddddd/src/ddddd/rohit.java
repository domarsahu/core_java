package ddddd;
import java.util.*;

public class rohit {
	public static void main(String arg[]){
		Scanner sumi = new Scanner(System.in);
		System.out.println("size of domar");
		
		int n = sumi.nextInt();
		System.out.println(" x ");
		int x = sumi.nextInt();
		
		
		
		System.out.println(n+ " -->");
		
		int ar[]=new int[n];
		
		System.out.println("give domar array ->");
		for ( int i=0; i<n;i++) {
			
			ar[i]=sumi.nextInt();
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				
				if(ar[i]<ar[j]) {
					
					int temp = ar[i];
					
					ar[i]= ar[j];
					ar[j] = temp;
				}
			}
		}
		
		for( int i =0; i <n; i ++) {
			System. out. println(ar[i] + "  ,  ");
		}
	

	}
}
