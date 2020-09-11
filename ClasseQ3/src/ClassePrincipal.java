
public class ClassePrincipal {

	public static void main(String[] args){
		
		Lutador lutador1 = new Lutador("Ryu", 100,10);
		
		Lutador lutador2 = new Lutador("Bison",100, 12);
		
				
		
		
		for (int i = 0; i < 3; i ++){
		aplicarGolpe(lutador1, lutador2);}
		System.out.println("Energia Bison" + lutador2.energia);
		
		
		
		
		for (int i = 0; i < 8; i ++){
			reduzirEnergia(lutador1, lutador2);}
		
		System.out.println("Energia Ryu" + lutador1.energia);
	}

		


public static int aplicarGolpe (Lutador lutador1 , Lutador lutador2){
	lutador2.energia = (lutador2.energia - lutador1.forca); 
	
	
	return lutador2.energia;
	
	
}

public static int reduzirEnergia (Lutador lutador1 , Lutador lutador2){
	lutador1.energia = (lutador1.energia - lutador2.forca);
	return lutador1.energia;
}



}




//:
// reduzirEnergia, aplicarGolpe (deve receber como parâmetro outro lutador que irá levar o golpe e
//reduzir a energia desse lutador de acordo com a força do lutador que está aplicando o golpe).
//PASSOS:
//1. Instanciar um objeto lutador com nome Ryu, energia 100 e forca 10.
//2. Instanciar outro objeto lutador, dessa vez com nome Bison, energia 100, forca 12.
//3. Faça com que Ryu aplique 3 golpes seguidos em Bison.
//4. Imprimir a energia de Bison após receber os golpes (acessando o atributo energia).
//5. Faça com que Bison aplique 8 golpes seguidos em Ryu e em seguida.
//6. Imprimir a energia de Ryu após receber os golpes (acessando o atributo energia).
