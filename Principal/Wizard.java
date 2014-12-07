/* **********************************************************
 *   Nome: Bruno Campos Beltrame.                           *     
 *   NUSP: 7280736.                                         *
 *   Disciplina: SCC0204 Programacao Orientada a Objetos.   *
 *   Docente: Moacir Ponti.                                 *
 *                                                          *
 *   Trabalho Pratico - Parte II.                           *
 * **********************************************************/

package Principal;

import items.Armor;
import items.Weapon;
import java.util.Random;

public class Wizard extends GameCharacter 
{
    protected int wisdom;
      
    Wizard(String s, int i)
    {
        super(s);
        wisdom = i;
    }
      
    //Metodo que ataca um outro personagem.
    @Override
    public void attack(GameCharacter ch2)
    {
        Random r = new Random();
        
        int dado1P1 = r.nextInt(7);
        int dado2P1 = r.nextInt(7);
        int dado1P2 = r.nextInt(7);
        int dado2P2 = r.nextInt(7);
           
        if((dado1P1 + dado2P1) <= (dado1P2 + dado2P2))
        {
            //...
        }
        
        else
        {
            if(this.geradorDano(ch2) <= 0)
            {
                //Retira um ponto de vida do personagem que esta sendo atacado.
                ch2.setHP(ch2.getHP() - 1);
            }
            
            else
            {
                if((dado1P1 + dado2P1) > (dado1P2 + dado2P2))
                {
                    //Retira um o dobro de dano, uma vez que obteve ataque critico.
                    ch2.setHP(ch2.getHP() - 2 * ((int)((this.getAttackPoints() - ch2.getDefensePoints()) + (r.nextInt(6) - 5))));

                }
                
                else
                {
                    ch2.setHP(ch2.getHP() - (int)((this.getAttackPoints() - ch2.getDefensePoints()) + (r.nextInt(6) - 5)));
                    
                    if(ch2.getHP() <= 0);
                }
            }          
        }    
    }
    
    //Metodo que verifica o quanto de dano e gerado pelo ataque.
    private int geradorDano(GameCharacter ch2)
    {
        Random r = new Random();
        
        return (int)((this.getAttackPoints() - ch2.getDefensePoints())) + (r.nextInt(11) - 5);
    }
    
    //Metodo que adiciona mais pontos de attack ao personagem.
    public void addPower(int w)
    {
        if(w > 0 && w != this.wisdom)
        {
            this.wisdom += w;
        }
    }

    @Override
    protected int getDefensePoints() 
    {   
        int item_def_pts = 0;
        
        for(int i = 0; i < super.getMyitems().getSize(); i++)
        { 
            if(super.getMyitems().getList().get(i).getSecond() == true && super.getMyitems().searchItem(i).equals(Armor.class))
            {
                Armor armorAux = (Armor)super.getMyitems().searchItem(i);
                item_def_pts += armorAux.getDefensePts();
            }
        }
        
        return (int)((((0.5 * super.constitution) + (super.dexterity * 0.3) + (0.2 * super.speed)) + item_def_pts) * (super.XP / 2)) + (this.wisdom / 2);
    }

    @Override
    protected int getAttackPoints() 
    {
        int item_att_pts = 0;
        
        for(int i = 0; i < super.getMyitems().getSize(); i++)
        { 
            if(super.getMyitems().getList().get(i).getSecond()== true && super.getMyitems().searchItem(i).equals(Weapon.class))
            {
                Weapon weaponAux = (Weapon)super.getMyitems().searchItem(i);
                item_att_pts += weaponAux.getDefensePts();
            }
        }
        
        return (int)((((0.5 * super.constitution) + (super.dexterity * 0.3) + (0.2 * super.speed)) + item_att_pts) * (super.XP / 3));
    }
}