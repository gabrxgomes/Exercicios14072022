package Exercicio0102;

public class Exercicio0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Jolene");
		cachorro.setIdade(6);
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Alasão");
		cavalo.setIdade(11);
		
		Preguiça preguica = new Preguiça();
		preguica.setNome("Sid");
		preguica.setIdade(39);
		
		System.out.println("O cachorro " + cachorro.getNome() + " de idade: " + cachorro.getIdade());
		cachorro.SomAnimal();
		cachorro.MovimentoAnimal();
		System.out.println();
		
		System.out.println("O cavalo " + cavalo.getNome() + " de idade: " + cavalo.getIdade());
		cavalo.SomAnimal();
		cavalo.MovimentoAnimal();
		System.out.println();
		
		System.out.println("A preguiça " + preguica.getNome() + " de idade: " + preguica.getIdade());
		preguica.SomAnimal();
		preguica.MovimentoAnimal();
	}

}
