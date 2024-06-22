/*  wajp to read character from the user and print the entered character is   voewel or consonant  */

class VowelORConsonant
{
	public static void main(String[] args)
	{
		
		char ch = 'c';
		if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch =='u' )
		{
			System.out.println("Given character "+ch+ " is Vowal");
		}
		else if(ch>='b' && 'd'>=ch)
		{
			System.out.println("Given character " +ch+" is Consonant");
		}
		else{
			System.out.println("Invalid")
		}

	}
}