package dzieci;
import rodzic.TA_Pojazd;


public class TA_Sam_ciezarowy extends TA_Pojazd
{
	private String przeznaczenie=null;
	
	public TA_Sam_ciezarowy(int pred, int wag, int licz_kol, String t)
	{
		super(pred,wag,licz_kol);
		przeznaczenie = t;
	}
	public TA_Sam_ciezarowy()
	{
		super();
	}
	public void odczyt()
	{
		super.odczyt();
		System.out.println("\nprzeznaczenie:" + przeznaczenie);
	}
}
