import dzieci.TA_Motor;
import dzieci.TA_SAM_osobowy;
import dzieci.TA_Sam_ciezarowy;
import rodzic.TA_Pojazd;


public class TA_main 
{

	public static void main(String[] args) 
	{
		TA_Pojazd t = new TA_Pojazd(50,50,8);
		
		t.odczyt(); //pirewszy obiekt
		
		TA_SAM_osobowy b = new TA_SAM_osobowy(150,30,4,"van");
		
		b.odczyt();// drugi obiekt
		
		TA_Motor c = new TA_Motor();
		
		c.odczyt();// trzeci obiekt
		
		TA_Sam_ciezarowy d = new TA_Sam_ciezarowy(10,100,4,"betoniarka");
		
		d.odczyt();
		System.out.println("Obciazenie:" + d.obciazenie());
		//static daje nam mozliwosc automatycznego zwiekszania wartosci licznik 
		//w kolejnych obiektach co daje nam cos w rodzaju unikalnego ID niezaleznie od tego czy to rodzic czy dziecko
		
		
		//i: zmienne te nie s¹ dziedziczone z TA_Pojazd tak¿e tutaj ich to nie dotyczy.
		
		//j: w moim przypadku nastepuje przesloniecie.
	}

}
