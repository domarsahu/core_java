// WAJP to cheak character vowel or not . 

class CheakVowel
{
	public static void main(String[] args)
	{
		char ch = 'A';
		String res = ch == 'A' || ch=='a' ||ch =='E' || ch=='e'||ch=='I' ||ch=='i' || ch=='O'|| ch=='o' ||ch=='U'||ch=='u'?"Vowel":"Not Vowel";
	
	
		System.out.println(res);
	}
}