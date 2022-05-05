import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ottimizza3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int qtd, n, maior = 0;
		List<Integer> listaNumero = new ArrayList<Integer>();

		System.out.println("Quantos numeros quer inserir?");
		qtd = scan.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o " + (i + 1) + "º número");
			n = scan1.nextInt();
			listaNumero.add(n);
		}
		for (int i = 0; i < listaNumero.size(); i++) {
			if (listaNumero.get(i) > maior) {
				maior = listaNumero.get(i);
			}
		}
		scan.close();
		scan1.close();
		System.out.println(maior);
	}

}