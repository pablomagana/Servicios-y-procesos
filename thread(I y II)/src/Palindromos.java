
public class Palindromos implements Runnable{
	private  String palabra;
	public  Palindromos(String p){
		this.palabra=p;
	}
	public boolean esPalindromo(){
		String inversa=new StringBuilder(palabra).reverse().toString();
		if(palabra.equalsIgnoreCase(inversa)==true){
			return true;
		}else{
			return false;
		}
		
	}
	@Override
	public void run() {
		if(esPalindromo()){
			System.out.println(palabra+" es Palindroma");
		}else{
			System.out.println(palabra+" es NO Palindroma");
		}
		
	}
}
