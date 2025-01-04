public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String locomover() {
        return "Corre";
    }

    @Override
    public String alimentar() {
        return "Mamando";
    }

    @Override
    public String emitirSom() {
        return "Som de Mamífero";
    }
}
