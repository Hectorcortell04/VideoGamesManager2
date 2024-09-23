public class VideojuegoFisico extends Videojuego {

    private double send;
    private static final double DEF_SEND = 3.0;

    public double CalculateSend() {
        return getPrice() + (send);
    }

    public VideojuegoFisico(String name, String plat, double price, Genero genero, double send) {
        super(name, plat, price, genero);
        if (ValidateSend(send)) {
            this.send = send;
        } else {
            this.send = DEF_SEND;
        }
    }

    public boolean ValidateSend(double send) {
        return send >= DEF_SEND;
    }

    public double calculateCost(){
        return getPrice() + DEF_SEND;
    }
}
