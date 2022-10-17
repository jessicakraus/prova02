package ifsc;

public class Onibus extends Veiculo {

	private int assentos;

	public Onibus() {

	}

	public Onibus(String placa, int ano, int assentos) {

		this.setPlaca(placa);
		this.setAno(ano);
		this.setAssentos(assentos);
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public String toString() {
		return "Placa: " + this.getPlaca() + "\nAno: " + this.getAno() + "\nNúmero de assentos: " + this.getAssentos();
	}
}