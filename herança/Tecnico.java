public class Tecnico extends Aluno {

  private String registroProfissional;

  public void praticar() {
    System.out.println("Aluno Tecnico "+ this.getNome() + " esta praticando");
  }

  // getters/setters

  public void setRegistroProfissional(String registroProfissional) {
    this.registroProfissional = registroProfissional;
  }

  public String getRegistroProfissional() {
    return this.registroProfissional;
  }

}