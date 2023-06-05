package dzieci;
import rodzic.TA_Pojazd;


public class TA_SAM_osobowy extends TA_Pojazd
{
	private String typ=null;
	
	public TA_SAM_osobowy(int pred, int wag, int licz_kol, String t)
	{
		super(pred,wag,licz_kol);
		typ = t;
	}
	public TA_SAM_osobowy()
	{
		super();
	}
	public void odczyt()
	{
		super.odczyt();
		System.out.println("\ntyp:" + typ);
	}
}
