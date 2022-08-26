package Programação.JavaPolimorfismo;

import Programação.JavaPolimorfismo.SuperClasse.Animal;

public class Principal {
    
    public static void main(String[] args) throws Exception{
        Animal a = new Animal(55.0, 5,4);
        Mamifero m = new Mamifero(55.0, 17, 2, "preto");

        m.alimentar();
    }
    
}
