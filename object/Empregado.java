package uscs5;

public class Empregado {

	private int codigoEmpregado;
	private String nomeEmpregado;
	private int idadeEmpregado;
	
	public Empregado(int codigoEmpregado, String nomeEmpregado, int idadeEmpregado) {
		this.codigoEmpregado = codigoEmpregado;
		this.nomeEmpregado = nomeEmpregado;
		this.idadeEmpregado = idadeEmpregado;
	}
	
	public void ImprimeEmpregado() {
		System.out.println("O codigo do empregado e: " + codigoEmpregado + "\n" +
							"O nome do empregado e: " + nomeEmpregado + "\n" +
							"A idade do empregado e: " + idadeEmpregado);
	}
	
	public void SetCodigoEmpregado(int x) {
		this.codigoEmpregado = x;
	}
	
	public int GetCodigoEmpregado() {
		return codigoEmpregado;
	}
	
	public void SetNomeEmpregado(String x) {
		this.nomeEmpregado = x;
	}
	
	public String GetNomeEmpregado() {
		return nomeEmpregado;
	}
	
	public void SetIdadeEmpregado(int x) {
		this.codigoEmpregado = x;
	}
	
	public int GetIdadeEmpregado() {
		return idadeEmpregado;
	}
	
}
