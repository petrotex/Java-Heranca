public class Falcao extends Ave {
    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String locomover() {
        return "Voando rapidamente";
    }

    @Override
    public String emitirSom() {
        return "Som de Falcão";
    }

    public String caçar() {
        return "Caçando pequenos animais";
    }
}
