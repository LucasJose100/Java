class Main {
  public static void main(String[] args) {
    		/* classe abstrata
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Alex");
		p1.setIdade(20);
		p1.setSexo("M");
		*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Maria");
		a1.setIdade(30);
		a1.setMatricula("005001000");
		a1.setCurso("SI");
		a1.setSexo("F");
		
		Professor prof = new Professor();
		prof.setNome("Marcelo");
		prof.setIdade(35);
		prof.setSexo("M");
		prof.setSalario(1000);
		prof.setEspecialidade("Mestre");
		
		Visitante visit = new Visitante();
		visit.setNome("Jose");
		visit.setIdade(10);
		visit.setSexo("M");
		
		Bolsista bolsista = new Bolsista();
		bolsista.setBolsa(100);
		bolsista.setNome("Mario");
		bolsista.setIdade(22);
		
    Tecnico tecnico = new Tecnico();
    tecnico.setNome("Fabio");
    tecnico.setIdade(24);
    tecnico.setSexo("M");
    tecnico.setMatricula("005001123");
    tecnico.setCurso("SI");
    tecnico.setRegistroProfissional("RI30");
		
		//System.out.println(p1.toString());
		
		System.out.println(a1.toString());
		System.out.println(prof.toString());
		System.out.println(visit.toString());
		System.out.println(bolsista.toString());
    System.out.println(tecnico.toString());
		
		a1.pagarMensalidade(1000);
		bolsista.pagarMensalidade(900);    
    tecnico.praticar();
  }
}

