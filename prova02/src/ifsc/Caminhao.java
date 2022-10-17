package ifsc;

public class Caminhao extends Veiculo {

	private int eixos;

	public Caminhao() {

	}

	public Caminhao(String placa, int ano, int eixos) {

		this.setPlaca(placa);
		this.setAno(ano);
		this.setEixos(eixos);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public String toString() {
		return "Placa: " + this.getPlaca() + "\nAno: " + this.getAno() + "\nEixos: " + this.getEixos();
	}
}