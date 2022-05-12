	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Digite os combustiveis quer: ");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		Scanner sc = new Scanner(System.in); 
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		 
		int combus = sc.nextInt(); // input the action
		
		while(combus != 4) { // if the number is different of 4, the program make a loop  
			if(combus == 1) {
				alcool += 1;
				
			} else if(combus == 2) {
				gasolina += 1;
				
			}else if (combus == 3) {
				diesel += 1;
			}
			combus = sc.nextInt();
		}
		// the program count the amount of times
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
