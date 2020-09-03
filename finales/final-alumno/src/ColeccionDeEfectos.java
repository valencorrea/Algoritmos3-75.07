import java.util.ArrayList;

public class ColeccionDeEfectos {

    private ArrayList<Efecto> efectos = new ArrayList<Efecto>();

    public void agregarEfecto(Efecto unEfecto) {
        this.efectos.add(unEfecto);
    }

    public String aplicarA(String unString) {
        for(Efecto unEfecto: this.efectos) {
            unString = unEfecto.aplicarA(unString);
        }
        return unString;
    }
}
