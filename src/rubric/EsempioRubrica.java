package rubric;

public class EsempioRubrica {

	public static void main(String[] args) {
		Contatto c1=new Contatto("Giovanni","Verdi","334422555",15);
		Contatto c2=new Contatto("Andrea","Giacomelli","765343399",20);
		Contatto c3=new Contatto("Ciccio","Fantasma","3377590675",50);
		Contatto c4=new Contatto("Giorgio","Giallo","332560908665",35);
		Contatto c5=new Contatto("Antonio","Velardi","3354378850",40);
		Contatto c6=new Contatto("Antonio","Verdi","3354378850",40);
		
		Rubrica r1= new Rubrica();
		r1.addRubrica(c1);
		r1.addRubrica(c2);
		r1.addRubrica(c3);
		r1.addRubrica(c4);
		r1.addRubrica(c5);
		r1.addRubrica(c6);
		
		r1.stampaRubrica();
		r1.cercaPerIniziale('V');
		r1.cercaPerCognome(c1);
	}

}
