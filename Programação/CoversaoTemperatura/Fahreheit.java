public class Fahreheit {
    
    float valor;
  
    Kelvin FpK(){
        Kelvin conversor= new Kelvin();

        double conversao = ((valor - 32) * 5/9) + 273;
        System.out.println(valor + " F equivale a " + conversao + " K.");

        return conversor;

    }

    Celsius FpC(){
        Celsius conversor = new Celsius();

        double conversao = (valor - 32) / 1.8;
        System.out.println(valor + " F equivale a " + conversao + " C.");

        return conversor;
    }
    
}
