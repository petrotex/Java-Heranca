public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String locomover() {
        return "Rastejar";
    }

    @Override
    public String alimentar() {
        return "Comendo vegetais";
    }

    @Override
    public String emitirSom() {
        return "Som de Réptil";
    }
}
