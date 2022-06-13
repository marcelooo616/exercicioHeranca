package br.com.generation.heranca;

public class Main {

	public static void main(String[] args) {
		
		Cachorrro cachorro = new Cachorrro();
		Cavalo cavalo = new Cavalo();
		
		cachorro.nome = "cachorro";
		cachorro.idade = 2;
		cachorro.som = "hauahuhau";
		cachorro.correr = "sim";
		
		Cavalo horse = new Cavalo();
		
		horse.nome = "Bojack";
		horse.idade = 19;
		horse.som = "qual o sentido da vida";
		horse.correr = "sim";
		
		Preguica preguica = new Preguica();
		
		preguica.nome = "flash Mark2";
		preguica.idade = 5 ;
		preguica.som = "zzzzzzzzz";
		
		
		
		
 		
		
		
		
		
		System.out.println("===cachorro===");
		System.out.println("o nome do cachoro e: " + cachorro.nome);
		System.out.println("A idade do cachorro e:" + cachorro.idade);
		System.out.println("o cachorro corre: " + cachorro.correr);
		System.out.println("Qual som o cachorro faz: " + cachorro.som);
		System.out.println();
		
		System.out.println("===cavalo===");
		
		System.out.println("O nome do cavalo e: " + horse.nome);
		System.out.println("A idade do cachorro e: " + horse.idade);
		System.out.println("O cavalo corre: " + horse.correr);
		System.out.println("qual som o cavalo faz: " + horse.som);
		System.out.println();
		
		
		System.out.println("===preguiça===");
		System.out.println("Qual o nome da preguiça: " + preguica.nome);
		System.out.println("A idade do cavalo: " + preguica.idade);
		//System.out.println(preguica.correr);
		System.out.println("Qualo o som da preguiça" + preguica.som);
		System.out.println();
		
		
		
		System.out.println();

	}

}
