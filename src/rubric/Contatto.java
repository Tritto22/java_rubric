package rubric;

public class Contatto extends Persona{
	protected String telefono;
	
	
	Contatto(String n, String c, String t, int e){
		nome=n;
		cognome=c;
		telefono=t;
		eta=e;
	}
	
	protected char setKey(String cognome) {
		char key= cognome.charAt(0);
		return key;
	}
}
