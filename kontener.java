public class kontener {
    private double masaladunku;
    private double wysokosc;
    private double wagawlasna;
    private double glebokosc;
    private double maksymalnaladownosc;
    private String numerseryjny;

    static int numerkontenera = 1;

    public double getMasaladunku() {
        return masaladunku;
    }

    public void setMasaladunku(double masaladunku) {
        this.masaladunku = masaladunku;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getWagawlasna() {
        return wagawlasna;
    }

    public void setWagawlasna(double wagawlasna) {
        this.wagawlasna = wagawlasna;
    }

    public double getGlebokosc() {
        return glebokosc;
    }

    public void setGlebokosc(double glebokosc) {
        this.glebokosc = glebokosc;
    }

    public double getMaksymalnaladownosc() {
        return maksymalnaladownosc;
    }

    public void setMaksymalnaladownosc(double maksymalnaladownosc) {
        this.maksymalnaladownosc = maksymalnaladownosc;
    }

    public String getNumerseryjny() {
        return numerseryjny;
    }

    public void setNumerseryjny(String numerseryjny) {
        this.numerseryjny = numerseryjny;
    }
    public kontener (double a,double b, double c, double d, double e) {
        this.masaladunku = a;
        this.wysokosc = b;
        this.wagawlasna = c;
        this.glebokosc = d;
        this.maksymalnaladownosc = e;
        this.numerseryjny = "KON" + numerkontenera++;

    }
}
