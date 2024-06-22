package Array_Program;

public class FitchDupalicate {

//		public static void duplicate(int arr[])
//		{
	
	public static void main(String args[])
	{
		int arr [] = { 1,3,2,1,3,2,4,5,2,4 , 1,1};
			int dupli [] = new int [arr.length];
			int visited = -1;
			for(int i = 0; i < arr.length; i++)
			{
				int count = 1;
				for(int j = i + 1; j < arr.length; j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
						dupli[j] = visited;
					}			
				}
				if(dupli[i] != visited)
				{
					dupli[i] = count;
				}
				
			}
			for(int i = 0; i < dupli.length; i++)
			{
				if(dupli[i] > 1)
				System.out.print(arr[i]+" ");
			}
	}	
		
			//duplicate(arr);
}
	
	
	

