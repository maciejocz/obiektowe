package rodzic;

public class TA_Pojazd 
{
	protected int predkosc,waga,liczba_kol;
	protected static int licznik;
	
	public TA_Pojazd(int pred, int wag, int licz_kol)
	{
		licznik++;
		predkosc = pred;
		waga = wag;
		liczba_kol = licz_kol;
	}
	public TA_Pojazd()
	{
		this(0,1,2); //dymyslnie 0 predkosc, 1 waga, 2 kola
	}
	public int licznik()
	{
		return licznik;
	}
	public int get_waga()
	{
		return waga;
	}
	public void set_waga(int l)
	{
		waga = l;
	}
	public void set_waga()
	{
		waga = 0;
	}
	public void odczyt()
	{
		System.out.println("\npredkosc:"+ predkosc + " \nwaga:"+ get_waga()+ "\nliczba_kol:" + liczba_kol);
	}
	public int obciazenie()
	{
		return waga / liczba_kol;
	}

}
