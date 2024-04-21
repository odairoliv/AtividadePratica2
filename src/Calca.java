public class Calca extends Vesturario {

    private String corte;

    public Calca(int id, String tipo, String marca, String cor, String tamanho, int ano, String corte) {
        super(id, "Calça", marca, cor, tamanho, ano);
        this.corte = corte;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nCorte: " + corte;
    }
    
}