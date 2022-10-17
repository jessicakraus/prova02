package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Caminhao> listaCaminhao = new ArrayList<Caminhao>(3);
		ArrayList<Onibus> listaOnibus = new ArrayList<Onibus>(3);

		Caminhao caminhao1 = new Caminhao("ABC1234", 2020, 4);
		Caminhao caminhao2 = new Caminhao("DEF4567", 2021, 5);
		Caminhao caminhao3 = new Caminhao("GHI8912", 2022, 6);

		Onibus onibus1 = new Onibus("JKL9874", 2015, 20);
		Onibus onibus2 = new Onibus("MNO8454", 2017, 22);
		Onibus onibus3 = new Onibus("PQR8574", 2019, 24);

		listaCaminhao.add(caminhao1);
		listaCaminhao.add(caminhao2);
		listaCaminhao.add(caminhao3);

		listaOnibus.add(onibus1);
		listaOnibus.add(onibus2);
		listaOnibus.add(onibus3);

		// Exibir os Caminhões
		System.out.println("\nCaminhões:");

		for (Caminhao caminhoes : listaCaminhao) {
			System.out.println("\n" + caminhoes);
		}

		// Exibir os Ônibus
		System.out.println("\nÔnibus:");

		for (Onibus onibus : listaOnibus) {
			System.out.println("\n" + onibus);
		}

	}
}
