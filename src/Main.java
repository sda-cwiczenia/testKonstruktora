import auto.Auto;
//import auto2.Auto;

import java.time.LocalTime;
//import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new auto.Auto();
        auto1.setPrzebieg(100);
        auto1.ustawPoleRocznik(2010);
        auto2.Auto auto2 = new auto2.Auto(2005, 180);
        auto2.setPrzebieg(80);
        System.out.println(auto2);

        LocalTime czas = LocalTime.now();
        System.out.println(czas);
        LocalTime czas1 = LocalTime.of(12,0,0);
        System.out.println(czas1);
        czas1 = czas1.plusHours(1);
        System.out.println(czas1);

        double obwod = Math.cos(2*Math.PI*5);





    }
}
