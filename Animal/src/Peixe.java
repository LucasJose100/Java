public class Peixe extends Animal{
 
 private String corEscama;


 public String getCorEscama(){
  return this.corEscama;
}

public void setCorEscama(String corEscama){
this.corEscama=corEscama;
}

public void soltarbolha() {
 
 System.out.println("O peixe solta bolha");

}

@Override
public void locomover(){
  System.out.println("O peixe esá nadando");
}

@Override
public void alimentar(){
  System.out.println("O peixe está se alimentando");
}

@Override
public void emitirsom(){
  System.out.println("blublu");
}

}