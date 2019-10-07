
public class AnimalTester {

	public static void main(String[] args) {
		
		 // --------- cachorro ----------
	    Mamifero c = new Mamifero();
	    c.setPeso(44);
	    c.setIdade(10);
	    c.setMembros(4);
	    c.setCorPelo("Branco");
	    
	    System.out.println("O cachorro tem pelo " + c.getCorPelo());

	    // --------- réptil ----------

	    Reptil r = new Reptil();
	    r.setPeso(20);
	    r.setIdade(10);
	    r.setMembros(4);
	    r.setCorEscama("Verde");

	    Peixe p =new Peixe();
	    p.setPeso(210);
	    p.setIdade(14);
	    p.setMembros(1);
	    p.setCorEscama("Azul");
	    p.soltarbolha();




	    Ave a= new Ave();
	    a.setPeso(2);
	    a.setIdade(18);
	    a.setMembros(2);
	    a.setCorPena("preto");
	    a.fazerNinho();

	    
	    //Criando um vetor com os vários tipos de animais

	    Animal animais[] = {c, r, p, a};

	    for (int i = 0; i < animais.length; i++) {
	      animais[i].locomover();
	      animais[i].alimentar();
	      animais[i].emitirsom();
	    }
	    
	
		
	

	}

}
