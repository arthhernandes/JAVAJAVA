public abstract class Instrumento {

    String tom;
    int tamanho;

    Instrumento(String tom, int tamanho){
        this.tom = tom;
        this.tamanho = tamanho;
    }

    abstract void tocar();

    public int getTamanho() {
        return tamanho;
    }
}