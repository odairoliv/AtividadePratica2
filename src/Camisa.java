public class Camisa extends Vesturario{
    
    private String manga;

    public Camisa(int id, String tipo, String marca, String cor, String tamanho, int ano, String manga) {
        super(id, "Camisa", marca, cor, tamanho, ano);
        this.manga = manga;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nManga: " + manga;
    }
    

}
