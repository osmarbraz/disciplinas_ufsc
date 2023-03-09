public class FatorialN{
	
	//Calcula o fatorial de valor
	public static double fatorial(double valor) {
		double fat=1;
		for(double i=1;i<=valor;i++){
			fat = fat * i;
		}
        return fat;
    }
	
	public static void main(String args[]){
		//Tempo a serem verificados
		double tempo[]= {1,60,3600,86400,2592000,31536000,3153600000.0};
		//Percorre os tempos
		for(int i = 0;i<tempo.length;i++){
			//Para n lg n
			double n = 1;	
			while (fatorial(n) <= Math.pow(10,9)*tempo[i]){
				n = n + 1;				
			}
			System.out.println("O valor de n para o tempo "+tempo[i]+": "+(n-1));
		}
	}
}