
public class Supermercat {
		
	static Caixera caixera;
	static Client c1;
	static Client c2;
	static int[] cesta1;
	static int[] cesta2;
	public static void main(String[] args) {
		caixera=new Caixera("Loren");
		
		cesta1 =new int[]{7,3,4,1,5};
		cesta2 =new int[]{3,8,3,1,9,2};
		c1=new Client("manel",cesta1);
		c2=new Client("pablo",cesta2);
		
		long TiempoInicial=System.currentTimeMillis();
		
		caixera.processarCompra(c1,TiempoInicial );
		System.out.println();
		caixera.processarCompra(c2,TiempoInicial);
	}

}
