public class Mamifero extends Animal{

private String corPelo;

public String getCorPelo(){
  return this.corPelo;
}

public void setCorPelo(String corpelo){
this.corPelo=corpelo;
}

@Override
public void locomover(){
  System.out.println("O Cahorro esá correndo");
}

@Override
public void alimentar(){
  System.out.println("O Cachorro está se alimentando");
}

@Override
public void emitirsom(){
  System.out.println("O cachorro late");
}

}