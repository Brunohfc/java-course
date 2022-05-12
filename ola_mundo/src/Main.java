	import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		//Locale.setDefault(Locale."US");
		Locale localBr = new Locale("pt","BR");
		// TODO Auto-generated method stub
		String prod1 = "Computer";
		String prod2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:\n");
		System.out.printf("%s, which price is $ %.2f\n", prod1, price1);
		System.out.printf("%s, which price is $ %.2f\n", prod2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
		System.out.printf("eight decimal places %.8f\n", measure);
		System.out.printf("Three decimal places %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point %.3f\n", measure);
		
	}

}
