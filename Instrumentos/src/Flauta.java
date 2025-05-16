public class Flauta extends InstrumentoDeSopro implements Afinador{

    Flauta(String tom, int tamanho, String material) {
        super(tom, tamanho, material);
    }

    void tocarMelodia(){
        System.out.println("TU RU RU");
    }

    @Override
    void tocar() {

    }

    @Override
    public void afinar() {

    }

    @Override
    public void mudarTom(String tom) {

    }
}
