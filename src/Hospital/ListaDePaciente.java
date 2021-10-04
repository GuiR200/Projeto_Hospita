package Hospital;

import java.util.ArrayList;

public class ListaDePaciente {

	ArrayList<Paciente> lista = new ArrayList<Paciente>();
	
	public void cadrastro(Paciente paciente) {
		if(paciente != null);
		lista.add(paciente);
	}
	
	// Remover
	public void remover(Paciente paciente) {
		lista.removeIf((elemento)->elemento.getNomeCompleto().equalsIgnoreCase(paciente.getNomeCompleto()));
	}
	
	// Buscar
	public Paciente buscar(Paciente paciente) {
		for(Paciente elemento : lista) {
			if(elemento.getNomeCompleto().equalsIgnoreCase(paciente.getNomeCompleto())) {
			return elemento;
			}
		}
		
		return null;
	}
	
	// Editar
	public void editar(Paciente novopaciente) {
		int indice = lista.indexOf(this.buscar(novopaciente));
		if(indice != -1);
		lista.set(indice, novopaciente);
	}
	
	public String lista() {
		StringBuilder builder = new StringBuilder();
		for(Paciente paciente : this.lista) {
			builder.append(paciente.toString());
		}
		
		return builder.toString();
	}
}
