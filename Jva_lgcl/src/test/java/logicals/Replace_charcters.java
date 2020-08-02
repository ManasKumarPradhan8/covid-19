package logicals;

public class Replace_charcters {

		public static void main(String[] args) {
			String original= "howtodohinjava";
			 System.out.println(original);
			//Replace one character
			System.out.println( original.replace("h", "H") ); //Howtodoinjava
			System.out.println(original.replace('o','8'));
			 
			//Replace all matching characters
			System.out.println( original.replaceAll("o", "7") );      //hOwtOdOinjava
			 
			//Remove one character
			System.out.println( original.replace("o", "") );  //owtodoinjava
			 System.out.println(original.replace('o','q'));
			//Remove all matching characters
			System.out.println( original.replace("o", "") );         //hwtdinjava

		}

	}

