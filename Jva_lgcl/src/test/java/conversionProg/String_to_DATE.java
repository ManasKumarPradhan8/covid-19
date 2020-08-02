package conversionProg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String_to_DATE {

	public static void main(String[] args) throws ParseException {
String date="11/4/2010";
Date dateq=new SimpleDateFormat("dd/MM/yyyy").parse(date);
System.out.println(date+"   "+date);
	}

}
