import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            /*
            List<Instrumento> instrumentos = new ArrayList<>();
            instrumentos.add(new Violao("C",20,8,"Nylon"));

            for (int i = 0; i < instrumentos.size(); i++){
                instrumentos.get(i).tocar();
            }

             */

            Violao violao = new Violao("C",20,8,"Nylon");

            Musico musico = new Musico();
            musico.tocarInstrumento(violao);
            musico.afinarInstrumento(violao);
            

            List<Afinador> orquestra = new ArrayList<>();
            orquestra.add(new Violao("C",20,8,"Nylon"));
        }
    }