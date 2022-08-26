public class Exercício7 {
    public static void main (String[] args){
        float ganhador1 = (46*780000)/100;
        System.out.println("O primeiro ganhador receberá a quantia de " + ganhador1 + " reais");

        float ganhador2 = (32*780000)/100;
        System.out.println("O segundo ganhador receberá a quantia de " + ganhador2 + " reais");

        float ganhador3 = (((100-(46+32))*780000/100));
        System.out.println("O terceiro ganhador receberá a quantia de " + ganhador3 + " reais");
    }
    
}