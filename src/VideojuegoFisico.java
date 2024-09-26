public class VideojuegoFisico extends Videojuego {

    private double send;
    private static final double DEF_SEND = 3.0;

    public double CalculateSend() {
        return getPrice() + (send);
    }

    public VideojuegoFisico(String name, Plataforma plataforma, double price, Genero genero, double send) {
        super(name, plataforma, price, genero);
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

    @Override
    public boolean isCompatible(Console console) {
        return console.equals(getPlataform());
    }
}
