import java.util.Locale;

public abstract class Videojuego {

    protected String name;
    private Plataforma plataform;
    private double price;
    private Genero genero;

    private static final String DEF_NAME = "default";
    private static final Plataforma DEF_PLATFORM = Plataforma.PLAYSTATION;
    private static final double DEF_PRICE = 0.0;
    private static final Genero DEF_GENERO = Genero.ACCION;

    public Videojuego() {
        this.name = DEF_NAME;
        this.plataform = DEF_PLATFORM;
        this.price = DEF_PRICE;
        this.genero = DEF_GENERO;
    }

    public Videojuego(String nombre, Plataforma plataforma, double precio, Genero genero) {
        if (validateName(nombre)) {
            this.name = nombre;
        } else {
            this.name = DEF_NAME;
        }
        if (validateCost(precio)) {
            this.price = precio;
        } else {
            this.price = DEF_PRICE;
        }
    }


    //Setters y Getters

    public static String getDefName() {
        return DEF_NAME;
    }

    public static String getDefPlatform() {
        return Plataforma.PLAYSTATION.name();
    }

    public static double getDefPrice() {
        return DEF_PRICE;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlataform() {
        return Plataforma.PLAYSTATION.name();
    }

    public void setPlataform(String plataform) {
        plataform = Plataforma.PLAYSTATION.name();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //Métodos para validar
    private boolean validateName(String name) {
        return name != null && !name.isEmpty();
    }

    private boolean validateCost(double cost) {
        return cost >= 0;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s %s %f %s ", name, plataform, price, genero);
    }

    public abstract boolean isCompatible(Console console);

}
