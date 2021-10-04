package Hospital;

import java.util.ArrayList;

public class ListaDeMedicos {
	
	ArrayList<Medico> lista = new ArrayList<Medico>();
	
	public void cadastro(Medico medico) {
		if(medico != null);
		    lista.add(medico);
	}

// Remover
public void remover(Medico medico) {
	lista.removeIf((elemento)->elemento.getCrm().equalsIgnoreCase(medico.getCrm()));
}

// Buscar
public Medico buscar(Medico medico) {
for(Medico elemento : lista) {
	if(elemento.getCrm().equalsIgnoreCase(medico.getCrm())) {
	return elemento;
		
	}
}
	return null;
}

// Editar
public void editar(Medico novoMedico) {
	int indice = lista.indexOf(this.buscar(novoMedico));
	if(indice != -1);
	lista.set(indice, novoMedico);
	
}
			
public String lista() {
	StringBuilder builder = new StringBuilder();
		for(Medico medico : this.lista) {
			builder.append(medico.toString());
		}
		return builder.toString();
}
}
