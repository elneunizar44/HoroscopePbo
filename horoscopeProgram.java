import java.util.*;
import java.io.*;
//import java.util.ArrayList;
class Compare {
    public String starHoros(int dayBirth,int monthBirth) {
	String tmp;
	++monthBirth;
	int dayAndMonth;
	String starHoroscope="";
	if (dayBirth<10)
	    tmp=""+monthBirth+"0"+dayBirth+"";
	else
	    tmp=""+monthBirth+""+dayBirth+"";
	dayAndMonth=Integer.parseInt(tmp);
	Boolean[] dateStar={dayAndMonth<=219&&dayAndMonth>=121,dayAndMonth<=320&&dayAndMonth>=220,dayAndMonth<=420 && dayAndMonth>=321,dayAndMonth<=521 && dayAndMonth>=421,dayAndMonth<=621 && dayAndMonth>=522,dayAndMonth<=722 && dayAndMonth>=622,dayAndMonth<=822 && dayAndMonth>=723,dayAndMonth<=922 && dayAndMonth>=822,dayAndMonth<=1023 && dayAndMonth>=924,dayAndMonth<=1122 && dayAndMonth>=1024,dayAndMonth<=1221 && dayAndMonth>=1123};
	    String[] star={"Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagitarius"};
for(int i=0;i<11;i++) {
    if(dateStar[i]==true)
	starHoroscope=star[i];
    else
	if(monthBirth==1)
	    monthBirth+=12;
	dayAndMonth=Integer.parseInt(""+monthBirth+""+0+""+dayBirth+"");
	if(dayAndMonth<=1320&&dayAndMonth>=1222)
	    starHoroscope="Capricorn";
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

