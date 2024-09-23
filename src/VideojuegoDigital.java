public class VideojuegoDigital extends Videojuego {


    //Descuento por defecto
    private double disc;
    private static final double DEF_DISC = 0.15;

    public double calculateCost() {
        return getPrice() - (DEF_DISC);
    }

    public VideojuegoDigital(String name, String plat, double price, Genero genero, double disc) {
        super(name, plat, price, genero);
        if (ValidateDisc(disc)) {
            this.disc = disc;
        } else {
            this.disc = DEF_DISC;
        }
    }


    public boolean ValidateDisc(double disc) {
        return disc >= 0.0 && disc <= 1.0;

    }
}
