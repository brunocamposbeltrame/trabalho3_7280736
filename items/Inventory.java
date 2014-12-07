/* **********************************************************
 *   Nome: Bruno Campos Beltrame.                           *     
 *   NUSP: 7280736.                                         *
 *   Disciplina: SCC0204 Programacao Orientada a Objetos.   *
 *   Docente: Moacir Ponti.                                 *
 *                                                          *
 *   Trabalho Pratico - Parte I.                            *
 * **********************************************************/

package items;
import java.util.AbstractMap;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Inventory 
{   
    //Atributos privados da classe "Inventory" especificados no enunciado.
    private int spaces;
    private double gold;
    private ArrayList<Pair<Item, Boolean>> items;
    
    //Construtor da classe "Inventory" que inicializa os atributos com valor nulo.
    public Inventory()
    {
        this.gold = 0.0;
        this.spaces = 1;
        this.items = new ArrayList<>(spaces);
    }
    
    //Metodo que retorna o numero de "gold" disponivel.
    public double getTotalGold()
    {
        return this.gold;
    }
    
    //Metodo que retorna a quantidade de espacos disponivel para armazenamento.
    public int getAvailableSpace()
    {
        return (this.spaces - this.items.size());
    }
    
    //O metodo em questao e utilizado para gastar a quantia estipulada em ouro.
    public void spendGold(double gold)
    {
        if(getTotalGold() >= gold && getTotalGold() > 0.0)
        {
            this.gold -= gold;
        }
        
        else
        {
            System.out.println("O saldo de ouro e insuficiente para realizar a acao desejada.");
        }    
    }
    
    //O metodo em questao e utilizado para aumentar o montante em ouro do personagem.
    public void earnGold(double gold)
    {
        if(gold > 0)
        {
            this.gold += gold;    
        }
        
        else
        {
            System.out.println("O valor especificado nao e valido!\nEntre com outro valor.");
        }
    }
        
    //Metodo utilizado para aumentar ou     Pair par = new Pair(Double, Integer);diminuir o numero de espacos de armazenamento.
    public void setSpaces(int spaces)
    {
        this.spaces = spaces;
    }
    
    //Metodo que retorna o numero de items no inventario.
    public int getSize()
    {
        return this.items.size();
    }
    
    //Procura o item desejado atraves do seu nome.
    public Item searchItem(String item)
    {   
        int contador = 0;
        int i = 0;
        
        for(i = 0; i < items.size(); i++)
        {
            if(items.get(i).getFirst().getName().equalsIgnoreCase(item) == true)
            {
                contador++;
                break;
            }
        }            
        
        if(contador > 0)
        {
            return items.get(i).getFirst();
        }
        
        else
        {
            System.out.println("O item procurado nao encontra-se no inventario");
            return null;
        }
    }
    
    //Procura o item desejado atraves do seu indice.
    public Item searchItem(int indice)
    {
        if(indice >= 0 && indice <= this.items.size())
        {
            return this.items.get(indice).getFirst();
        }
        
        else
        {
            System.out.println("O item procurado nao encontra-se no inventario");
            return null;
        }
    }
  
    //Insere um novo item a colecao de itens.
    public void insertItem(Item item, Boolean equipado)
    {
        if(this.getAvailableSpace() > 0)
        {
            if(equipado == false)
            {   
                Pair p = new Pair(item, equipado);
                items.add(p);
            }

        if(item.getClass() == Armor.class && equipado == true)
        {
            int contador1 = 0;

            for(int i = 0; i < this.getSize(); i++)
            {
                if(this.items.get(i).getSecond() == true)
                {
                    contador1++;
                    break;
                }
            }

            if(contador1 > 0)
            {
                Pair p2 = new Pair(item, false);
                items.add(p2);
            }

            else
            {
                Pair p3 = new Pair(item, equipado);
                items.add(p3);
            }
        }

        if(item.getClass() == Weapon.class && equipado == true)
        {
            int contador2 = 0;

            for(int i = 0; i < this.getSize(); i++)
            {
                if(this.items.get(i).getSecond() == true)
                {
                    contador2++;
                }
            }

            if(contador2 > 2)
            {
                Pair p4 = new Pair(item, false);
                items.add(p4);
            }

            else
            {
                Pair p5 = new Pair(item, equipado);
                items.add(p5);
            }
        }
        }

        else
        {
            System.out.println("Espaço insuficiente de armazenamento.");
        }
    }

    //Remove o item desejado utilizando seu nome como argumento.
    public void removeItem(String item)
    {
        if(this.items.isEmpty() == false)
        {          
            if(this.searchItem(item) != null)
            {
                this.items.remove(this.searchItem(item));
            }
            
            else
            {
                System.out.println(item + " nao se encontra no inventario.");
            }
        }
        
        else
        {
            System.out.println("Impossivel realizar a operacao, inventario ja se encontra vazio.");
        }
    }
    
    //Remove o item desejado utilizando seu index na colecao como argumento.
    public void removeItem(int indice)
    {
        if(this.items.isEmpty() == false)
        {  
            if(this.searchItem(indice) != null)
            {
                this.items.remove(this.searchItem(indice));
            }
            
            else
            {
                System.out.println(indice + " nao se encontra no inventario.");
            }
        }
        
        else
        {
            System.out.println("Impossivel realizar a operacao, inventario ja se encontra vazio.");
        }
    }
    
    public ArrayList<Pair<Item, Boolean>> getList()
    {
        return this.items;
    }
}