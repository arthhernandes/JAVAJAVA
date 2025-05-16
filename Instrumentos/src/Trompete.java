public class Trompete extends InstrumentoDeSopro{

    Trompete(String tom, int tamanho, String material) {
        super(tom, tamanho, material);
    }

    void tocarNotasAgudas(){
        System.out.println("FOM");
    }

    @Override
    void tocar() {

    }
}
