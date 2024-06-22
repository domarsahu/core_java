package project1;

public class User {
	
		public static void main(String args[]) {
	Scanner rs = new Scanner(System.in);
	System.out.println("Enter the total subject of student");
	int s=rs.nextInt();
	if(s<=3) {
	System.out.println("Each subject out of mark is ");
	int max=rs.nextInt();
	System.out.println("No. of 1st subject is ");
	int first=rs.nextInt();
	System.out.println("No. of 2nd subject is ");
	int second=rs.nextInt();
	System.out.println("No. of 3rd subject is ");
	int third=rs.nextInt();
	int total=first+second+third;
	float sub=s*max;
	System.out.println("Total marks is "  +total);
	float persent=total *100 /sub;
	System.out.println("The persentage of student is  "+persent);
	}
	else if(s<=5) {
	System.out.println("Each subject out of mark is ");
	int max=rs.nextInt();
	System.out.println("No. of 1st subject is ");
	int first=rs.nextInt();
	System.out.println("No. of 2nd subject is ");
	int second=rs.nextInt();
	System.out.println("No. of 3rd subject is ");
	int third=rs.nextInt();
		System.out.println("No. of 4th subject is ");
		int fourth=rs.nextInt();
		System.out.println("No. of 5th subject is ");
		int fifth=rs.nextInt();



	int total=first+second+third+fourth+fifth;

	float sub=s*max;

	//System.out.println("Total no. of student");
	//float t=rs.nextFloat();
	System.out.println("Total marks is "  +total);
	float persent=total *100 /sub;
	System.out.println("The persentage of student is  "+persent);
	}	   
	}  }

