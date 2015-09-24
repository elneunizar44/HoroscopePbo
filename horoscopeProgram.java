import java.util.*;
import java.io.*;
//import java.util.ArrayList;
class Compare {
    public String starHoros(int dayBirth,int monthBirth) {
	String tmp;
//	++monthBirth;
	int dayAndMonth;
	String starHoroscope="";
	if (dayBirth<10)
	    tmp=""+monthBirth+"0"+dayBirth+"";
	else
	    tmp=""+monthBirth+""+dayBirth+"";
	dayAndMonth=Integer.parseInt(tmp);
	Boolean[] dateStar={dayAndMonth<=119&&dayAndMonth>=021,dayAndMonth<=220&&dayAndMonth>=120,dayAndMonth<320 && dayAndMonth>221,dayAndMonth<421 && dayAndMonth>321,dayAndMonth<521 && dayAndMonth>422,dayAndMonth<622 && dayAndMonth>522,dayAndMonth<722 && dayAndMonth>623,dayAndMonth<822 && dayAndMonth>722,dayAndMonth<923 && dayAndMonth>824,dayAndMonth<1022 && dayAndMonth>924,dayAndMonth<1121 && dayAndMonth>1023};
	    String[] star={"Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagitarius"};
for(int i=0;i<11;i++) {
    if(dateStar[i]==true)
	starHoroscope+=star[i];
    else {
	if(monthBirth==0)
	    monthBirth+=12;
	dayAndMonth=Integer.parseInt(""+monthBirth+""+dayBirth+"");
	if(dayAndMonth<=1220&&dayAndMonth>=1122)
	    starHoroscope+=star[i];
    }
}
return starHoroscope;
}

}
public class horoscopeProgram{
    public static void main(String[] args) {
	//String[][] starHoroscope= new String[][];
	//String[][] chineseHoroscope=new String[][];
	Calendar calendar = new GregorianCalendar();
	Scanner input=new Scanner(System.in);
	Compare HorosComp=new Compare();
	//input the birth
	//date of a person
	System.out.println("Masukkan tanggal lahir kalian= ");
	calendar.set(Calendar.DAY_OF_MONTH,input.nextInt());
	//System.out.println("\n");
	//month of a person
	System.out.println("Masukkan bulan lahir kalian= ");
	calendar.set(Calendar.MONTH,input.nextInt()-1);
	//System.out.println("\n");
	//year of a person
	System.out.println("Masukkan tahun lahir kalian= ");
	calendar.set(Calendar.YEAR,input.nextInt());
	//System.out.println("\n");
	//store all of them
	int year=calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	int date= calendar.get(Calendar.DAY_OF_MONTH);
	//try print of them
	System.out.println(date+"-"+month+"-"+year);
	String star=HorosComp.starHoros(date,month);
	System.out.println(star);

    }
}

