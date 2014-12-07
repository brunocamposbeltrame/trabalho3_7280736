/* **********************************************************
 *   Nome: Bruno Campos Beltrame.                           *     
 *   NUSP: 7280736.                                         *
 *   Disciplina: SCC0204 Programacao Orientada a Objetos.   *
 *   Docente: Moacir Ponti.                                 *
 *                                                          *
 *   Trabalho Pratico - Parte II.                           *
 * **********************************************************/

package Principal;

import items.*;
import javax.swing.JOptionPane;
 
public abstract class GameCharacter
{
    //Atributos privados da classe "Item" especificados no enunciado.
    private String alias;
    private Inventory myitems;
    private int HP = 90;
    private int MP;
    
    /********************************************************************   
     *    Por padrao, as variaveis sao inicializadas com o modificador  *
     *    protected, porem e preferivel especifica-las                  *
     ********************************************************************/
    
    protected int XP = 1;
    protected int speed;
    protected int strenght;
    protected int dexterity;
    protected int constitution;
    
    //Construtor personalizado da classe Character.
    public GameCharacter(String alias)
    {
        verificaNome(alias);
        this.myitems = new Inventory();
    }
    
    //Metodo que retorna o nome do personagem.
    public String getName()
    {
        return this.alias;
    }
    
    //Metodo que calcula os pontos de ataque a outro personagem.
    protected abstract int getDefensePoints();
    
    //Metodo que calcula os pontos de defesa. Em Java, os metodos são polimorficos por default.
    protected abstract int getAttackPoints();
    
    //Metodo abstrato que realiza ataque a outro personagem.
    public abstract void attack(GameCharacter c);
    
    //Metodo que adiciona pontos de experiencia ao personagem. 
    public void addXP(int XP)
    {
        if((this.XP + XP) >= 100)
        {
            this.XP = 100;
        }
        
        else
        {
            if((this.XP + XP) < 0)
            {
                this.XP = 0;
            }
            
            else
            {
                this.XP += XP;
            }    
        }   
    }
    
    //Metodo que adiciona mais pontos de vida ao personagem.
    public void addHP(int HP)
    {
        if((this.HP + HP) >= 100)
        {
            this.HP = 100;
        }
        
        else
        {
            if((this.HP + HP) < 0)
            {
                this.HP = 0;
            }
            
            else
            {
                this.HP += XP;
            }    
        } 
    }
    
    //Metodo que adiciona mais pontos de magia ao personagem.
    public void addMP(int MP)
    {
        if((this.MP + MP) >= 100)
        {
            this.MP = 100;
        }
        
        else
        {
            if((this.MP + MP) < 0)
            {
                this.MP = 0;
            }
            
            else
            {
                this.MP += XP;
            }    
        } 
    }
    
    //Metodo utilizado para verificar se o nome do personagem e valido.
    private void verificaNome(String name)
    {
        if(name.length() >= 2)
        {
            this.alias = name;
        }
        
        else
        {
            System.out.println("Nome invalido para o personagem");
            this.alias = "No Name";
        }
    }
    
    //Comeco dos metodos setters referente ao encapsulamento dos atributos.
    public void setSpeed(int atributo) 
    {
        if((this.strenght + this.dexterity + this.constitution + atributo) <= 100 && atributo > 0)
        {
            this.speed = atributo;
        }
        
        else
        {
            System.out.println("Valor invalido para a velocidade.");
        }
    }

    public void setStrenght(int atributo) 
    {
        if((this.speed + this.dexterity + this.constitution + atributo) <= 100 && atributo > 0)
        {
            this.strenght = atributo;
        }
        
        else
        {
            System.out.println("Valor invalido para a forca.");
        }
    }

    public void setDexterity(int atributo) 
    {
        if(((this.speed) + (this.strenght) + (this.constitution) + atributo) <= 100 && atributo > 0)
        {
            this.dexterity = atributo;
        }
        
        else
        {
            System.out.println("Valor invalido para a destreza.");
        }
    }

    public void setConstitution(int atributo) 
    {
        if((this.speed + this.strenght + this.dexterity + atributo) <= 100 && atributo > 0)
        {
            this.constitution = atributo;
        }
        
        else
        {
            System.out.println("Valor invalido para a constituicao do personagem.");
        }
    }
    
    public Inventory getMyitems() 
    {
        return this.myitems;
    }
    
    public int getHP()
    {
        return this.HP;
    }
    
    public int getSpeed()
    {
        int contador = 0;
        int i = 0;
        
        for(i = 0; i < this.myitems.getSize(); i++)
        {
            if(this.myitems.getList().get(i).getSecond()== true && this.myitems.searchItem(i).equals(Armor.class))
            {
                contador++;
                break;
            }
        }
        
        if(contador > 0)
        {
            Armor armorAux = (Armor)this.myitems.searchItem(i);
            this.setSpeed((int)(this.getSpeed() * Math.exp(-1 * Math.pow((armorAux.getWeight() / 20), 2))));
        }     
    
        return this.speed;
    }

    public void setHP(int HP) 
    {
        this.HP = HP;
    }

    public void setMP(int MP)
    {
        this.MP = MP;
    }

    public void setXP(int XP)
    {
        this.XP = XP;
    }
    //Fim dos metodos setters referente ao encapsulamento dos atributos.
    
    //Metodo que exibe as informacoes do personagem.
    public void exibeInfo()
    {
        JOptionPane.showMessageDialog(null, "Nome: " + this.getName() + "\nHP: " + this.HP + "\nXP: " + this.XP);
    }
}