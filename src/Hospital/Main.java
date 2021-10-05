package Hospital;

public class Main {

	private static Internacao dadosEditada;

	public static <Dados> void main(String[] args) {
//		// Criando os objeto
//		Endereco end1 = new Endereco("Travessa não te interessa", "12-A", "centro", "Porto Alegre", "RS", "0000");
//		Paciente pac1 = new Paciente("Julia", "9999", "98888", end1);
//		Medico med1 = new Medico("000-RS", "Geovane MOta", "000");
//		Internacao inter1 = new Internacao(pac1, med1);
//		med1.setEndereco(end1);
//
//		// Pupular os dados
//		end1.setBairro("Centro");
//		end1.setCEP("0000");
//		end1.setCidade("Porto Alegre");
//		end1.setEstado("RS");
//		end1.setNumero("12-A");
//		end1.setRua("Travessa não te interessa");
//
////		pac1.cpf = "0000";
////		pac1.nomeCompleto = "João Paulo Nogueira";
////		pac1.rg = "9999";
//		pac1.setTelefone("99999");
//		pac1.setEndereco(end1);
//
//		// Imprimir dados
//		System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s", pac1.getNomeCompleto(),
//				end1.getRua(), end1.getNumero(), end1.getBairro(), end1.getCidade(), end1.getEstado());
//
////		System.out.printf(inter1.dadosDoMedico());
//		
//		System.out.println(inter1.toString());
	
	
	ListaDeInternacao dados = new ListaDeInternacao() ;
	
	// Cadastrar as intenacao
			Internacao inter1 = new Internacao(null, null);
			Internacao inter2 = new Internacao(null, null);
			
			dados.cadastrar(inter1);
			dados.cadastrar(inter2);
			
			Dados dadosEditada = new Dados();
			
			// lista de internacoa
			System.out.println(dados.lista());
			
			dados.editar(inter1);
			
			// lista de internacoa
					System.out.println(dados.lista());		
					
	}
}

					