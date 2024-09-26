import Exceptions.JuegoNoCompatibleException;

public class Platt implements Console {

    private Plataforma platform;

    public Platt() {
        this.platform = Plataforma.PLAYSTATION;
    }
    public Platt(Plataforma platform) {
        this.platform = platform;
    }

    public void switchOn() {
        System.out.printf("Encendiendo consola %s%n", getPlatform());
    }

    public void switchOff() {
        System.out.printf("Apagando consola %s%n", getPlatform());
    }

    public void installGame(Videojuego vdj) throws JuegoNoCompatibleException {
        System.out.printf("Instalando %s en %s%n", vdj.getName(), getPlatform());
    }

    public void playGame(Videojuego vdj) {
        System.out.println("Jugando a mi enorme manchego");
    }

    public Plataforma getPlatform() {
        return platform;
    }
}
