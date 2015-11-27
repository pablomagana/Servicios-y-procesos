
public class CapiCua extends Thread {
	String num;
	public CapiCua(String num){
		this.num=num;
	}
	public boolean cappicua(){
		int i=0;
		while(i<num.length()){
			if(num.charAt(i)==num.charAt((num.length()-1)-i)){
				i++;
			}else{
				break;
			}
		}
		if(i==num.length()){
			return true;
		}else{
			return false;
		}
		
	}
	
	@Override
	public void run() {
		if(cappicua()){
			System.out.println("numero capicua");
		}else{
			System.out.println("numero NO capicua");
		}
		
		super.run();
	}
}
