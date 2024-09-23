import Exceptions.JuegoNoCompatibleException;

import java.io.IOException;

public interface Console {
    void switchOn();

    void switchOff();

    void installGame(Videojuego vdj) throws JuegoNoCompatibleException;

    void playGame(Videojuego vdj);
}
