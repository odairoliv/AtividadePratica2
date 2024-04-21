public class Vesturario {

    private int id;
    private String tipo;
    private String marca;
    private String cor;
    private String tamanho;
    private int ano;

    public Vesturario(int id, String tipo, String marca, String cor, String tamanho, int ano) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String txt = 
        "\nID: " + id +
        "\nTipo:" + tipo +
        "\nMarca: " + marca +
        "\nCor: " + cor +
        "\nTamanho: " + tamanho + 
        "\nAno: " + ano;
        return txt;
    }
    
}
