package br.com.application;

public class Application {

	public static void main(String[] args) {

		int max = 100;
		int multiplo3 = 1 * 3;
		int multiplo5 = 1 * 5;
		int multiploTresCinco = 3 * 5;

		for (int i = 1; i <= max; i++) {
			if (i == multiplo3) {
				System.out.println("Foo");
			}
			if (i == multiplo5) {
				System.out.println("Baa");
			}
			if (i == multiploTresCinco) {
				System.out.println("FooBaa");
			} else {
				System.out.println(i);
			}
		}

	}

}
