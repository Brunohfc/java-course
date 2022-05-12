	import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite de 1 a 7 para saber o dia da semana:\n"); 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //input of days of week in number
		String day = "s";
		
		// start of program for know the day
		switch(x) {
		case 1:
			day = "domingo";
		break;
		case 2: 
			day = "Segunda-feira";
		break;
		case 3: 
			day = "Terca-feira";
		break;
		case 4:
			day = "Quarta-feira";
		break;
		case 5: 
			day = "Quinta-feira";
		break;
		case 6:
			day = "Sexta-feira";
		break;
		case 7:
			day = "Sabado";
		break;
		default:
			System.out.println("Digite um dia valido");
		break;
		}
		// printing the day 
		System.out.println("O dia da semana e: " + day);
		sc.close();
	}

}
