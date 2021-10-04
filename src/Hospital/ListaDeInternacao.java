package Hospital;

import java.util.ArrayList;

public class ListaDeInternacao {
	
	ArrayList<Internacao> lista = new ArrayList<Internacao>();
	
	public void cadrastro(Internacao inter) {
		if(inter != null) {
			lista.add(inter);
		}
	}
		// Remover
		public void remover(Internacao internacoa) {
			lista.removeIf((elemento)->elemento.getDataIntenacao().equals(elemento.getDataIntenacao()));
		}
		
		// Buscar
		public Internacao buscar(Internacao internacao) {
			for(Internacao elemento : lista) {
				return elemento;
			}
			
		return null;
	}
		// Editar
		public void editar(Internacao internacao) {
			int indice = lista.indexOf(this.buscar(internacao));
			if(indice != -1);
//			lista.set(indice, internacao);
		}
		
		public String lista() {
			StringBuilder builder = new StringBuilder();
			for(Internacao internacao : this.lista) {
				builder.append(internacao.toString());
			}
		return builder.toString();
		}
		public void cadastrar(Internacao inter1) {
			// TODO Auto-generated method stub
			
		}
			
		}
			
