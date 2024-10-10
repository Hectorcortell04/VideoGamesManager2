import Exceptions.JuegoNoCompatibleException;

import java.io.*;

public class Platt implements Console {

    private Plataforma platform;

    public Platt() {
        this.platform = Plataforma.PLAYSTATION;
    }

    public Platt(Plataforma platform) {
        this.platform = platform;
    }

    public void switchOn() throws FileNotFoundException {
        System.out.printf("Encendiendo consola %s%n", getPlatform());
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("./src/main/resources" + getPlatform() + ".txt")));

    }

    public void switchOff() {
        System.out.printf("Apagando consola %s%n", getPlatform());
    }



    public void installGame(Videojuego vdj) throws JuegoNoCompatibleException, IOException {
        System.out.printf("Instalando %s en %s%n", vdj.getName(), getPlatform());
        FileWriter fileWriter = new FileWriter(new File(this.platform.toString() + ".txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(vdj.toString());
        bufferedWriter.close();

    }

    public void playGame(Videojuego vdj) {
        System.out.println("Jugando a mi enorme manchego");
    }

    public Plataforma getPlatform() {
        return platform;
    }
}
