import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //input dates
		String dia;
		
		switch (x) {
			case 1:
				dia = "domingo";
			break;
			case 2: 
				dia = "Segunda-feira";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
