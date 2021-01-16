package auto;

public class Auto {
    private int rocznik;
    private int  przebieg;

    public Auto() {
        System.out.println("Tworzę obiekt z pustymi polami ....");
    }

    public Auto(int rocznik, int przebieg) {
        this.rocznik = rocznik;
        this.przebieg = przebieg;
        System.out.println("Tworzę obiekt i od razu ustawiam rocznik i przebieg");
    }

    public void ustawPoleRocznik(int rocznik) {
        System.out.println("Ustawiam rocznik");
        this.rocznik = rocznik;
    }

    public void setPrzebieg(int przebieg) {
        System.out.println("Ustawiam przebieg");
        this.przebieg = przebieg;
    }

    @Override
    public String toString() {
        return "auto.Auto{" +
                "rocznik=" + rocznik +
                ", przebieg=" + przebieg +
                '}';
    }
}
