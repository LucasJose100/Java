
public class Ave extends Animal {
	
	private String corPena;



	  public String getCorPena(){
	    return this.corPena;
	  }

	  public void setCorPena(String corPena){

	    this.corPena=corPena;
	  }

	  public void fazerNinho(){
	    System.out.println("Fazendo Ninho");
	  }


	  @Override
	public void locomover(){
	  System.out.println("A ave est� voando");
	}

	@Override
	public void alimentar(){
	  System.out.println("A ave est� se alimentando");
	}

	@Override
	public void emitirsom(){
	  System.out.println("A ave est� cantando");
	}


}
