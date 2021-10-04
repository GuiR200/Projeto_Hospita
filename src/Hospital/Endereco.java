package Hospital;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;
	private String bairro;
	
    
	public Endereco(String rua, String numero, String cidade, String estado, String cep, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.bairro = bairro;
	}
	// Getters
	public String getRua() {
		return this.rua;
	}
	public String getNumero() {
		return this.numero;
	}
	public String getBairro() {
		return this.bairro;
	}
	public String getCidade() {
		return this.cidade;
	}
	public String getEstado() {
		return this.estado; 
	}
	// Setters
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCEP(String CPE) {
		this.cep = CPE;
	}
	
	@Override
	public String toString() {
		return String.format("Logardoura: %s nº %s,bairro %s - %s/%s", this.rua,this.numero,this.bairro,this.cidade,this.estado);
	}
}
