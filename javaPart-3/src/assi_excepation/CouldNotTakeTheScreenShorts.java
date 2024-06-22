package assi_excepation;

class Could
{
public static void main(String[] args) {
		
		try 
		{
			throw new CouldNotTakeTheScreenShorts();
		}
		catch(CouldNotTakeTheScreenShorts e)
		{
			System.out.println(e.getMassage());
		}	
	}
}
public class CouldNotTakeTheScreenShorts extends Exception{

	public String getMassage()
	{
		return "Could Not Take The ScreenShorts";
	}
	
}
