import java.util.Locale;

public class VideojuegoDigital extends Videojuego {


    //Descuento por defecto
    private double disc;
    private static final double DEF_DISC = 0.15;


    public VideojuegoDigital(String name, Plataforma plataforma, double price, Genero genero, double disc) {
        super(name, plataforma, price, genero);
        if (ValidateDisc(disc)) {
            this.disc = disc;
        } else {
            this.disc = DEF_DISC;
        }
    }

    public double calculateCost() {
        return getPrice() - (DEF_DISC);
    }

    public boolean ValidateDisc(double disc) {
        return disc >= 0.0 && disc <= 1.0;

    }

    public boolean isCompatible(Console console) {
        return console.equals(getPlataform());
    }

    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH, "%02.2f", calculateCost());
    }

}
