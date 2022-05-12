	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Digite sua senha para liberar o acesso: ");
		Scanner sc = new Scanner(System.in); 
		int password = 0;
		password = sc.nextInt(); // reading dates
		
		// verifying if the password is right
		while( password != 2002) { 
			System.out.println("Senha inválida, digite corretamente"); 
			password = sc.nextInt();
		}
		System.out.println("Acesso liberado");
		
		
		sc.close();
	}

}
