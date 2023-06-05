package dzieci;
import rodzic.TA_Pojazd;


public class TA_Motor extends TA_Pojazd
{
	private String typ="scigacz"; // zeby jakis typ byl:)
	
	public TA_Motor(int pred, int wag, int licz_kol, String t)
	{
		super(pred,wag,licz_kol);
		typ = t;
	}
	public TA_Motor()
	{
		super();
	}
	public void odczyt()
	{
		super.odczyt();
		System.out.println("\ntyp:" + typ);
	}
}
