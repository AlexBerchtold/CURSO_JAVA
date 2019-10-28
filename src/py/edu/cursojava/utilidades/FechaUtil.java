package py.edu.cursojava.utilidades;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.MaskFormatter;

public class FechaUtil {
	private static MaskFormatter formatter;
	private static DateFormat DATE_FORTMAT = new SimpleDateFormat("dd/MM/yyyy");
	private static DateFormat HOUR_FORMAT = new SimpleDateFormat("HH:mm");
	private static DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	
	//Metodos para pasar el formato al jtext
	public static MaskFormatter getFormato() {
		try {
			formatter = new MaskFormatter("##/##/####");
			formatter.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formatter;
	}
	
	public static MaskFormatter getFormatoHora(){
		try {
			formatter = new MaskFormatter("##:##");
			formatter.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formatter;
	}

	//Metodo que convierte datos string a formato Date 
	public static Date stringAFecha(String text) {
		DATE_FORTMAT.setLenient(false);
		try {
			return DATE_FORTMAT.parse(text);
		} catch (ParseException e) {
			return null;
		}
	}
	
	//Metodo que convierte datos string a formato TIME
	public static Time stringAHora(String text){
		HOUR_FORMAT.setLenient(false);
		try {
			long ms = HOUR_FORMAT.parse(text).getTime();
			return new Time(ms);
		} catch (ParseException e) {
			return null;
		}
	}
	
	//Metodo que convierte datos string a formato DATETIME
	public static Date stringAFechaHora(String text){
		DATE_FORTMAT.setLenient(false);
		try {
			return hourdateFormat.parse(text);
		} catch (ParseException e) {
			return null;
		}
	}
	

	//Metodo que convierte datos del tipo Date a String
	public static String fechaAString(Date fecha) {
		return DATE_FORTMAT.format(fecha);
	}
	
	//Metodo que convierte datos del tipo TIME a String
	public static String horaAString(Date fecha){
		return HOUR_FORMAT.format(fecha);
	}
	
	//Metodo que convierte datos del tipo DateTime a String
	public static String fechaHoraAString(Date fecha){
		return hourdateFormat.format(fecha);
	}
	
}
