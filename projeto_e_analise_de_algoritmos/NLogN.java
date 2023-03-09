public class NLogN{
	
	//Realiza a mudanca de base de valor pela base
	public static double log(double valor, double base) {
		//Math.log logaritmo natural na base e
        return Math.log(valor) / Math.log(base);
    }
	
	public static void main(String args[]){
		//Tempo a serem verificados
		double tempo[]= {1,60,3600,86400,2592000,31536000,3153600000.0};
		//Percorre os tempos
		for(int i = 0;i<tempo.length;i++){
			//Para n lg n
			double n = 1;
			long passo = 1;			
			while ((n * log(n,2)) <= Math.pow(10,9)*tempo[i]){
				n = n + passo;
				//Acelerar o passo 	
				if (n>100000000){										
					passo = passo + 10;
				} 
			}
			System.out.println("O valor de n para o tempo "+tempo[i]+": "+(n-1));
		}
	}
}