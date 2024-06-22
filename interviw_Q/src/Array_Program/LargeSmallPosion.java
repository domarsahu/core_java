package Array_Program;

import java.util.Scanner;

// array and find largest and the smallest number position in Java

public class LargeSmallPosion {
	
	public static void main(String[] args) {
		
	//	int a[] = {12,53,1,99,34};

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a length");
	        int len = sc.nextInt();
	        int a[]=new int[len], i,ln=0,lnp=0,sn=0,snp=0;
	        System.out.println("Enter numbers");
	        for(i=0; i<len; i++)
	        {
	            a[i]=sc.nextInt();
	        }

	        for(i=0; i<len; i++)
	        {
	            if(i==0)
	            {
	                ln=a[i];
	                sn=a[i];
	                lnp=i;
	                snp=i;
//	                System.out.println("ln "+ln);
//	                System.out.println("sn "+sn);
//	                System.out.println("lnp "+lnp);
//	                System.out.println("snp "+snp);
	            }
	            else if(a[i]>ln)
	            {
	                ln=a[i];
	                lnp=i;
//	                System.out.println("ln "+ln);
//	                System.out.println("lnp "+lnp);
	            }
	            else if(a[i]<sn)
	            {
	                sn=a[i];
	                snp=i;
//	                System.out.println("sn "+sn);
//	                System.out.println("snp "+snp);
	            }
	        }
	        System.out.println("Largest Number "+ln);
	        System.out.println("Smallest Number "+sn);
	        System.out.println("Largest Number Position = "+(lnp+1));
	        System.out.println("Smallest Number Position = "+(snp+1));
	    }
		
}


