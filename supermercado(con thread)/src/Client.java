
public class Client {
	private String nom;
	private int[] carroCompra;
	
	public Client(String nom,int[] carroCompar){
		this.nom=nom;
		this.carroCompra=carroCompar;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int[] getCarroCompra() {
		return carroCompra;
	}
	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}
	
}
