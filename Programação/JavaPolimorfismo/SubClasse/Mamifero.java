package Programação.JavaPolimorfismo;

import Programação.JavaPolimorfismo.SuperClasse.Animal;

public class Mamifero extends Animal{

    String corDePelo;

    public Mamifero(double peso, int idade, int numeroMembro, String corDePelo) {
        super(peso, idade, numeroMembro);  
        this.corDePelo = corDePelo;        
    }

    public void alimentar(){
        System.out.println( "Mamifero está mamando.");
    }
    
    public void locomover(){
        System.out.println( "Mamifero está andando.");
    }

    public void emitirSom(){
        System.out.println( "Som padrão do mamifero.");
    }

    public String getCorDePelo() {
        return corDePelo;
    }

    public void setCorDePelo(String corDePelo) {
        this.corDePelo = corDePelo;
    }

}
