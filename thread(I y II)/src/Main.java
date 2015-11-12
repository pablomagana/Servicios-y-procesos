import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
	private static final int MEDIA=1;
	private static final int MAX=2;
	private static final int MIN=3;
	public static void main(String[] args) {
		
		System.out.println("pablo magaña");
		
		//act 1
		System.out.println("Actividad 1");
		System.out.println();
		new Calculos().centDesordenat();
		Calculos c1=new Calculos(MEDIA);
		Calculos c2=new Calculos(MAX);
		Calculos c3=new Calculos(MIN);
		
		c1.start();
		c2.start();
		c3.start();
		//act2
		System.out.println();
		System.out.println("Actividad 2");
		System.out.println("El code del ejercici 2 unicament fa en bucle infinit en un unic fil d'execucio(nomes s'executa un hilo )");
		System.out.println("En este bucle, imprimeix el seu nom y s'espera el numero de segons que li retorne el Math.random, que retorna un numero del 0 al 9999.");
		//act3
		System.out.println();
		System.out.println("actividad 3");
		System.out.println();
		String[] palabras={
		"aba",
		"Aerea",
		"Alla",
		"Ama",
		"Ana",
		"Anana",
		"Ararara",
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
		
		
		ThreadPoolExecutor tpe= (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
		
		for(int i=0;i<palabras.length;i++){
			
			tpe.execute(new Palindromos(palabras[i]));
		}
		tpe.shutdown();
		
	}

}
