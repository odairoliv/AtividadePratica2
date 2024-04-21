public class Acessorio extends Vesturario{
    private String material;

    public Acessorio(int id, String tipo, String marca, String cor, String tamanho, int ano, String material) {
        super(id, "Acessório", marca, cor, tamanho, ano);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nMaterial: " + material;
    }
}
