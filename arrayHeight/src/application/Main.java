package application;

	import java.util.Scanner;
	import java.util.Locale;
	
	public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int num = sc.nextInt();
		double [] vect = new double[num];
		
		// fazendo o vetor at� o numero desejado
		for(int i =0; i < num; i++) {
			vect[i] = sc.nextDouble();
		}
		
		
		double sum = 0.0;
		for(int i = 0; i <num; i++) {//fazendo a variavel receber os valor para realizar o calculo
			
			sum += vect[i];
		}
		
		double averege = 0;
		
		averege = sum / num; // fazendo a media 
		
		System.out.printf("A media e: %.2f",averege ,"metros" ); // mostrando o resultado
		
		
		sc.close();

	}

}
