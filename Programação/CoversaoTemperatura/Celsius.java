public class Celsius {

    float valor;

    Kelvin CpK(){
        Kelvin conversor = new Kelvin();

        double conversao = valor + 273;
        System.out.println(valor + " C equivale a " + conversao + " K.");

        return conversor;

    }

    Fahreheit CpF(){
        Fahreheit conversor = new Fahreheit();

        double conversao = (valor * 1.8) + 32;
        System.out.println(valor + " C equivale a " + conversao + " F.");

        return conversor;
    }
    
}