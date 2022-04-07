package simpleGameNumber;
import java.util.Random;
public class randomPick {
	private int PcNumber;
	public void getnumber(int a)
	{
		PcNumber= a;
		Random N=new Random();
	    PcNumber=N.nextInt(10);	
	}
	public int showNumber()
	{
		return PcNumber;
	}

}
