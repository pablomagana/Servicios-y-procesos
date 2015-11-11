
public class Calculos extends Thread{
	private int calculo;
	private static int[] arraycent=new int[100];
	public Calculos(int c){
		calculo=c;
	}
	public Calculos(){}
	public void centDesordenat(){
		for(int i=0;i<arraycent.length;i++){
			arraycent[i]=(int) Math.floor((Math.random()*101)+1);
		}
		System.out.println("calculos aritmeticos: ");
		System.out.println("numero de datos: "+arraycent.length);
	}
	
	public void calculaMedia(){
		int suma=0;
		for(int i=0;i<arraycent.length;i++){
			suma+=arraycent[i];
		}
		int media= suma/arraycent.length;
		System.out.println("La media es: "+media);
	}
	public void calculaMajor(){
		int max=arraycent[0];
		for(int i=1;i<arraycent.length;i++){
			if(arraycent[i]>max){
				max=arraycent[i];
			}
		}
		System.out.println("El mayor numero es: "+max);
	}
	public void calculaMenor(){
		int min=arraycent[0];
		for(int i=1;i<arraycent.length;i++){
			if(arraycent[i]<min){
				min=arraycent[i];
			}
		}
		System.out.println("El menor numero es: "+min);
	}
	
	
	
	
	@Override
	public void run() {
		switch (calculo) {
		case 1:
			calculaMedia();
			break;
		case 2:
			calculaMajor();
			break;
		case 3:
			calculaMenor();	
			break;
		}
	}
}
