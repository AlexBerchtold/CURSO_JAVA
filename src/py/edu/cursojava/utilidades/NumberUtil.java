package py.edu.cursojava.utilidades;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberUtil {
	private static NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
	
	public static String integerAString(Integer i) {
		return nf.format(i);
	}
	
	public static Integer stringAInteger(String d){
		try {
			return nf.parse(d).intValue();
		} catch (ParseException e) {
			return null;
		}
	}
	
	public static String doubleAString(double d){
		return nf.format(d);
	}
	
	public static Double stringADouble(String s){
		try {
			return  nf.parse(s).doubleValue();
		} catch (ParseException e) {
			return null;
		}
	}
	
	public static Integer doubleaInteger(double d){
		return (int)d;
	}
	
}
