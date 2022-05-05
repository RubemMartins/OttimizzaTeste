import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ottimiza2 {

	public static void main(String[] args) {

		List<String> listaPalavras = new ArrayList<String>();
		String palavras;
		int q;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);

		System.out.println("Quantas palavras?");
		q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("Insira a " + (i + 1) + "º palavra");
			palavras = scan1.nextLine();
			listaPalavras.add(palavras);
		}
		StringBuilder arrayListParaString = new StringBuilder();
		for (String concatPalavras : listaPalavras) {
			arrayListParaString.append(concatPalavras);
			arrayListParaString.append(" ");
		}
		System.out.println(arrayListParaString);
		scan.close();
		scan1.close();
	}

}