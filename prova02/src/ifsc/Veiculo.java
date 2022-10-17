package ifsc;

public abstract class Veiculo {

	private String placa;
	private int ano;

	public Veiculo() {

	}

	public Veiculo(String placa, int ano) {

		this.setPlaca(placa);
		this.setAno(ano);
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public String toString() {
		return "Placa: " + this.getPlaca() + "\nAno: " + this.getAno();
	}
}