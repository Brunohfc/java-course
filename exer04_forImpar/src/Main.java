
	import java.util.Scanner;
	public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero para realizar a contagem: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // reading the input of user
		
		for(int i = 1; i <= x; i +=2) {
			
			System.out.print(" " +i +"\n"); // showing the dates until the parameter
		}
	}

}
