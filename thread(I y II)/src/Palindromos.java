
public class Palindromos extends Thread {
	private static String palabra;
	public  Palindromos(String p){
		this.palabra=p;
	}
	public boolean esPalindromo(){
		
		for(int i=0;i<palabra.length();i++){
			if((palabra.charAt(i))!=(palabra.charAt((palabra.length()-1)-i))){
				return false;
			}
		}
		return true;
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
