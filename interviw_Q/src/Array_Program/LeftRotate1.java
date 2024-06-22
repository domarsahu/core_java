package Array_Program;

//one rotate

public class LeftRotate1 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int j = arr.length;
		int temp= arr[0];
		
		for(int i =1; i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}
		arr[j-1] = temp;
		
		for(int i = 0; i<j ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
