
public class Caixera extends Thread{
	
	private String nom;
	private Client c;
	private long t;
	
	public Caixera(String nom,Client c,long t){
		this.nom=nom;
		this.c=c;
		this.t=t;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void processarCompra(Client c,long t){
		System.out.println("Cliente "+c.getNom()+" en caja: "+c.getNom()+". Instante "+(t/1000)+" seg");
		int[] compra=c.getCarroCompra();
		for(int i=0;i!=compra.length;i++){
			System.out.print("Cliente "+c.getNom()+"-- Producte "+(i+1)+"-- Duració ");
			System.out.println(compra[i]+" segons");
			esperarXsegons(compra[i]);
		}
		long temps=(System.currentTimeMillis()-t)/1000;
		System.out.println(nom+" ha acabat de procesar la compra de "+c.getNom()+" en l'instant "+temps +" seg");
	}
	public void esperarXsegons(int l){
		try {
			Thread.sleep(l*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		processarCompra( c, t);
		super.run();
	}
	
	
}
