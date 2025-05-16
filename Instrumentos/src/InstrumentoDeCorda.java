public abstract class InstrumentoDeCorda extends Instrumento{

    int numeroDeCordas;
    String tipoCorda;

    InstrumentoDeCorda(String tom, int tamanho, int numeroDeCordas, String tipoCorda){
        super(tom, tamanho);
        this.numeroDeCordas = numeroDeCordas;
        this.tipoCorda = tipoCorda;
    }

}
