public class Reptil extends Animal{

private String corEscama;


public String getCorEscama(){
  return this.corEscama;
}

public void setCorEscama(String corescama){
  this.corEscama=corescama;
}

@Override
public void locomover(){
  System.out.println("O reptil esá correndo");
}

@Override
public void alimentar(){
  System.out.println("O reptil está se alimentando");
}

@Override
public void emitirsom(){
  System.out.println("O reptil é brabo");
}








}