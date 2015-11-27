import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Supermercat {
		
	static Caixera caixera;
	static Client c1;
	static Client c2;
	static int[] cesta1;
	static int[] cesta2;
	public static void main(String[] args) {
		
		long TiempoInicial=System.currentTimeMillis();
		
		cesta1 =new int[]{7,3,4,1,5,5,7,2,6,5,8,2,6,4,8,2,6,8,5,2,6,8,1,6,8,7,1,2,5,8,9,2,5,8,6,2,5,7,5,2,5,7,4,25,8,4,7,8,4,2,7,5};
		cesta2 =new int[]{3,8,3,1,9,2};
		c2=new Client("manel",cesta1);
		c1=new Client("pablo",cesta2);
		
		caixera=new Caixera("Loren",c1,TiempoInicial);
		caixera=new Caixera("Loren",c2,TiempoInicial);
		
		ThreadPoolExecutor tpe=(ThreadPoolExecutor) Executors.newCachedThreadPool();
		
		for(int i=0;i<20000;i++){
			tpe.execute(new Caixera("Loren"+i,c1,TiempoInicial));
		}
		tpe.shutdown();
		
		System.out.println("fin");
	}

}
