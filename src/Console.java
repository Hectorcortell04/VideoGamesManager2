import Exceptions.JuegoNoCompatibleException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Console {
    void switchOn() throws FileNotFoundException;

    void switchOff();

    void installGame(Videojuego vdj) throws JuegoNoCompatibleException, IOException;

    void playGame(Videojuego vdj);
}
