public class Conversoes {
    
    public static void main(String[] args) {
        Celsius C = new Celsius();

        C.valor = 37;

        C.CpK();
        C.CpF();

        Kelvin K = new Kelvin();

        K.valor = 310;

        K.KpC();
        K.KpF();

        Fahreheit F = new Fahreheit();

        F.valor = (float) 98.6;

        F.FpC();
        F.FpK();
    }
    
}
