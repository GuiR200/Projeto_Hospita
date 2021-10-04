package Hospital;

public class Paciente {
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefone;
	private Endereco end1;

	public Paciente(String nomeCompleto, String cpf, String telefone, Endereco end1) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.end1 = end1;
		// Adicinar a tua lógica

	}
	
	public Paciente(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return end1;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(Endereco end1) {
		this.end1 = end1;
	}

	@Override
	public String toString() {
		return String.format("Nome completo: %s\tTelefone: %s\tEndereço:%s", this.nomeCompleto, this.telefone,
				this.end1.toString());
	}
}
