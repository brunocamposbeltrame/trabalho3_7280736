/* **********************************************************
 *   Nome: Bruno Campos Beltrame.                           *     
 *   NUSP: 7280736.                                         *
 *   Disciplina: SCC0204 Programacao Orientada a Objetos.   *
 *   Docente: Moacir Ponti.                                 *
 *                                                          *
 *   Trabalho Pratico - Parte II.                           *
 * **********************************************************/

package items;

import Principal.GameCharacter;

public abstract class Item 
{
   //Atributos privados da classe "Item" especificados no enunciado.
   private String name;
   private double price;
   private boolean equipado = false;
   
   /********************************************************************   
    *    Por padrao, as variaveis sao inicializadas com o modificador  *
    *    protected, porem e preferivel especifica-las                  *
    ********************************************************************/  
   
   //Construtor personalizado da classe Item.
   public Item(String name, double price)
   {
       verificaName(name);
       this.price = price;
   }
   
   //Inicio dos metodos de encapsulamento dos atributos privados
   public String getName()
   {
       return this.name;
   }
   
   public double getPrice()
   {
       return this.price;
   }

   //Metodo utilizado para verificar se o nome especificado esta dentro do esperado.
   private void verificaName(String name)
   {
       if (name.length() >= 2) 
       {
           this.name = name;
       }
       
       else
       {
           System.out.println("O nome especificado e muito curto, tente outro nome.");
           this.name = "No name";
       }
   }
   
   //Metodo abstrato que sera implementado nas classes filhas.
   public abstract void use(GameCharacter c);
   
   public abstract int getDefensePts();
   
   public abstract int getAttackPts();
}