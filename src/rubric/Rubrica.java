package rubric;
import java.util.HashMap;
import java.util.ArrayList;

public class Rubrica {
	
	private HashMap<Character,ArrayList<Contatto>> rubrica;
	
	Rubrica(){
		rubrica=new HashMap<>();
	}
	
	
	public void addRubrica(Contatto contatto) {		
			ArrayList<Contatto> listaContatti= rubrica.get(contatto.setKey(contatto.cognome));
			if(listaContatti == null) {
				listaContatti= new ArrayList<>();
				rubrica.put(contatto.setKey(contatto.cognome), listaContatti);
			}
			listaContatti.add(contatto);			
	}
	
	public void stampaRubrica() {
		for (Character key : rubrica.keySet()) {
            System.out.println("Chiave: " + key);
            ArrayList<Contatto> listaContatti = rubrica.get(key);
            for (Contatto contatto : listaContatti) {
                System.out.println(contatto.cognome + " " + contatto.nome + " telefono: " + contatto.telefono);
            }
        }
	}
	
	public void cercaPerIniziale(char key) {
		if(rubrica.containsKey(key)) {
			ArrayList<Contatto> listaContatti = rubrica.get(key);
            for (Contatto contatto : listaContatti) 
                System.out.println(contatto.cognome + " " + contatto.nome + " telefono: " + contatto.telefono);
		}else
			System.out.println("Nessun contatto trovato");		
	}
	
	public void cercaPerCognome(Contatto contatto) {
		if(rubrica.containsKey(contatto.setKey(contatto.cognome))) {
			ArrayList<Contatto> listaContatti = rubrica.get(contatto.setKey(contatto.cognome));
			for(Contatto c : listaContatti) {
				if(c.cognome.equals(contatto.cognome)) {
					System.out.println(c.cognome + " " + c.nome + " telefono: " + c.telefono);
				}
			}
		}else {
			System.out.println("Nessun contatto trovato");
		}
	}
}
