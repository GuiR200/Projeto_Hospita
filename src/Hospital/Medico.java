package Hospital;

public class Medico {
	private String crm;
	private String nomeCompleto;
	private String telefoneContato;
	private Endereco endereco;
		
	public Medico(String crm,String nomeCompleto,String telefoneCompleto){
		this.crm = crm;
		this.nomeCompleto = nomeCompleto;
		this.telefoneContato = telefoneCompleto;
		
	}
	public Medico(String crm){
			this.crm = crm;
	}
	public String getTelefoneContato() {
		return telefoneContato;
	    
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCrm() {
		return crm;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	@Override
	public String toString() {
		return String.format("CRM; %s\tNome: %s\tTelefone: %s\tEndereço: %s0", this.crm,this.nomeCompleto,this.telefoneContato,this.endereco.toString()); 
	}

		
	}

