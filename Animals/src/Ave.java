public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String locomover() {
        return "Voando";
    }

    @Override
    public String alimentar() {
        return "Comendo frutas";
    }

    @Override
    public String emitirSom() {
        return "Som de Ave";
    }

    public String fazerNinho() {
        return "Construindo ninho";
    }
}
