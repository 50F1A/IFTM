public class Kelvin {
    
    float valor;

    Celsius KpC(){
        Celsius conversor = new Celsius();

        double conversao = valor - 273;
        System.out.println(valor + " K equivale a " + conversao + " C.");

        return conversor;

    }

    Fahreheit KpF(){
        Fahreheit conversor = new Fahreheit();

        double conversao = ((valor - 273) * 1.8 + 32);
        System.out.println(valor + " K equivale a " + conversao + " F.");

        return conversor;
    }
    
}
