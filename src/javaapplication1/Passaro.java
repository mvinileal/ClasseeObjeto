/*
 *Programação orientada a objetos
 *Professor: Orlewilson Bentes Maia
 *Data: 03/11/2019
 *Autor: Marcus Vinícius
 *Descrição: Exemplo de classe e objeto
 */

package classeeobjeto;

public class Passaro {
    String reino;
    boolean fase;
    String cor;
    Float peso;
    int tamanho;
    
    void status() {
        
        System.out.println("Um passaro " + this.cor );
        System.out.println("De qual reino pertence esse ser? " + this.reino );
        System.out.println("Quantos centímentros tem o passaro? " + this.tamanho);
        System.out.println("Qual o peso dele em KG? " + this.peso);
        System.out.println("Ele é adulto? " + this.fase);
        
}
    void voar() {
        if (this.fase == true) {
            System.out.println("APROVADO! Ele vai conseguir voar");
        }else{
            System.out.println("REPROVADO!Ele ainda não sabe voar");
        }
        
    }
    
}

