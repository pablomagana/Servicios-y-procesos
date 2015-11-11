
public class Main {
	private static final int MEDIA=1;
	private static final int MAX=2;
	private static final int MIN=3;
	public static void main(String[] args) {
		
		//act 1
		/*
		new Calculos().centDesordenat();
		Calculos c1=new Calculos(MEDIA);
		Calculos c2=new Calculos(MAX);
		Calculos c3=new Calculos(MIN);
		
		c1.start();
		c2.start();
		c3.start();
		*/
		//act3
		String[] palabras={
		"aba",
		"Aérea",
		"Allá",
		"Ama",
		"Ana",
		"Anana",
		"Arañara",
		"Arenera",
		"Arenera",
		"Arepera",
		"Ata",
		"Aviva",
		"Azuza",
		"Apa",
		"Afromorfa",
		"Aboba",
		"Eme",
		"Erigire",
		"Erre",
		"Malayalam",
		"Nadan",
		"Neuquen",
		"Nomon",
		"Non",
		"ojo"};
		
		for(int i=0;i<palabras.length;i++){
			new Palindromos(palabras[i]).start();
		}
		
		
	}

}
