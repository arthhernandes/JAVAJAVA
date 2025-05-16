public abstract class InstrumentoDeSopro extends Instrumento{

    String material;

    InstrumentoDeSopro(String tom, int tamanho, String material){
        super(tom, tamanho);
        this.material = material;
    }

}
