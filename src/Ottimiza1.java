import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ottimiza1 {

	public static void main(String[] args) {
		
		List<String> pt1 = new ArrayList<String>();
		List<String> pt2 = new ArrayList<String>();
		List<String> pt3 = new ArrayList<String>();
		List<String> pt4 = new ArrayList<String>();
		List<String> pt5 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String data;

		System.out.println("Insira uma data dd/MM/yyyy:");
		data = scan.nextLine();

		String[] dataFormatada = data.split("/|\\s");

		if (dataFormatada.length == 1) {
			String arrayParaString = String.join("", dataFormatada);
			for (int i = 0; i < arrayParaString.length(); i++) {
				if (i < 2) {
					char carac = arrayParaString.charAt(i);
					String caractereParaString = String.valueOf(carac);
					pt1.add(caractereParaString);
				} else if (i > 1 && i < 4) {
					char caractere = arrayParaString.charAt(i);
					String caractereParaString = String.valueOf(caractere);
					pt2.add(caractereParaString);
				} else if (i > 3 && i < 8) {
					char caractere = arrayParaString.charAt(i);
					String caractereParaString = String.valueOf(caractere);
					pt3.add(caractereParaString);
				}
			}
			pt4.addAll(pt3);
			pt4.add("/");
			pt4.addAll(pt2);
			StringBuilder converString = new StringBuilder();
			for (String m : pt4) {
				converString.append(m);
			}

			pt5.add(converString.toString().replaceAll(",", ""));
			System.out.println(pt5);

		} else {
			for (int i = 0; i < dataFormatada.length; i++) {
				if (i != dataFormatada.length && i < 1) {
					String u = dataFormatada[i];
					if (u.length() == 2) {
						pt1.add(u);
					} else {
						pt3.add(u);
					}
				} else if (i != dataFormatada.length && i == 1) {
					String d = dataFormatada[i];
					if (d.length() == 2) {
						pt2.add(d);
					} else {
						pt3.add(d);
					}
				} else if (i != dataFormatada.length && i == 2) {
					String t = dataFormatada[i];
					if (t.length() == 4) {
						pt3.add(t);
					} else {
						pt1.add(t);
					}

				}
			}
			pt4.addAll(pt3);
			pt4.add("/");
			pt4.addAll(pt2);

			StringBuilder converString = new StringBuilder();
			for (String m : pt4) {
				converString.append(m);
			}
			pt5.add(converString.toString().replaceAll(",", ""));
			System.out.println(pt5);
		}
		scan.close();
	}
}


