
import java.util.Scanner;
public class dias_semana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //input no switch
		String dia;
		
		switch(x) {
			case 1: 
				dia = "domingo";
			break;
			case 2:
				dia = "Segunda-feira";
			break;
			case 3:
				dia = "Terça-feira";
			break;
			case 4:
				dia = "Quarta-feira";
			break;
			case 5:
				dia = "Quinta-feira";
			break;
			case 6:
				dia = "Sexta-feira";
			break;
			case 7:
				dia = "Sábado";
			break;
			case 8:
				dia = "domingo";
			break;
			default:
				dia = "Dia inválido";
			break;
			
			System.out.printf("Dia da semana: " + dia);
				
		}
		

}
