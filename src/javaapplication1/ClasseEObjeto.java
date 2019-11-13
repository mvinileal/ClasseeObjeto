/*
 *Programação orientada a objetos
 *Professor: Orlewilson Bentes Maia
 *Data: 03/11/2019
 *Autor: Marcus Vinícius
 *Descrição: Exemplo de classe e objeto
 */
package classeeobjeto;

public class ClasseEObjeto {

    public static void main(String[] args) {
      Passaro p1 = new Passaro();
      p1.cor = "azul";
      p1.reino = "animalia";
      p1.tamanho = 20;   
      p1.fase = false;
      p1.peso = 2.5f;
      
      p1.status();
      p1.voar();
     
    }
    
}
