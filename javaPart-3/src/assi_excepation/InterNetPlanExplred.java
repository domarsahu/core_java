package assi_excepation;

class Explared
{
	public static void main(String[] args) {
		
		try 
		{
			throw new InterNetPlanExplred();
		}
		catch(InterNetPlanExplred e)
		{
			System.out.println(e.getMassage());
		}	
	}
}
public class InterNetPlanExplred  extends Exception{
	
	public String getMassage() {
		 
		return "Inter Net Plan Explred";
	}

}
