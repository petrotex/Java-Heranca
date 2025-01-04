public class Peixe extends Animal {
  private String corEscama;

  public String getCorEscama() {
      return corEscama;
  }

  public void setCorEscama(String corEscama) {
      this.corEscama = corEscama;
  }

  @Override
  public String locomover() {
      return "Nadando";
  }

  @Override
  public String alimentar() {
      return "Comendo Substâncias";
  }

  @Override
  public String emitirSom() {
      return "Sem som";
  }

  public void soltarBolha() {
      System.out.println("Soltando bolha");
  }
}
