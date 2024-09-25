package Exceptions;

public class JuegoNoCompatibleException extends RuntimeException {
    public JuegoNoCompatibleException() {
        System.out.println("El juego NO es compatible con la plataforma");
    }
}
