package assi_excepation;

class Low{
	public static void main(String[] args) {
		try 
		{
			throw new BatteryLow();
		}
		catch(BatteryLow e)
		{
			System.out.println(e.getMassage());
		}	
	}
}

public class BatteryLow extends Exception {

	public String getMassage ()
	{
		return "Battary Low";
	}
}
