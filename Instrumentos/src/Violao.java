public class Violao extends InstrumentoDeCorda implements Afinador{


    Violao(String tom, int tamanho, int numeroDeCordas, String tipoCorda) {
        super(tom, tamanho, numeroDeCordas, tipoCorda);
    }

    void tocarAcordes(){
        System.out.println("DOM DOM DOM");
    }

    @Override
    void tocar() {
        System.out.println("Tocando violão");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando violão");
    }

    @Override
    public void mudarTom(String tom) {
        this.tom = tom;
        System.out.println("Mudando tom do violão para " + tom);
    }
}
