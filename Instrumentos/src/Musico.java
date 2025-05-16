public class Musico {

    public void tocarInstrumento(Instrumento instrumento){
        instrumento.tocar();
    }

    public void afinarInstrumento(Afinador instrumento){
        System.out.println("Musico trabalhando");
        instrumento.afinar();
        instrumento.mudarTom("Novo tom");
    }

}
