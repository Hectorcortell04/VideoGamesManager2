import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TiendaVideojuegos {
    public static void main(String[] args) throws IOException {

// Instanciar la clase Platt
        Platt p = new Platt();
        Videojuego v = new VideojuegoDigital("Spiderman", Plataforma.PLAYSTATION, 55.00, Genero.ACCION, 0.15);
        p.switchOn();
        p.installGame(v);
        p.switchOff();


    }
}