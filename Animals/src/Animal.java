public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membro;
  
    public float getPeso() {
      return peso;
    }
  
    public void setPeso(float peso) {
      this.peso = peso;
    }
  
    public int getIdade() {
      return idade;
    }
  
    public void setIdade(int idade) {
      this.idade = idade;
    }
  
    public int getMembro() {
      return membro;
    }
  
    public void setMembro(int membro) {
      this.membro = membro;
    }
  
    public abstract String locomover();

    public abstract String alimentar();

    public abstract String emitirSom();
  
  }