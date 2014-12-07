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

public class ManaPotion extends Potion
{
    //Construtor da classe ManaPotion.
    public ManaPotion(String name, double price, int mana)
    {
        super(name, price, mana);
    }
    
    //Implementacao do metodo use() da classe pai (abstrata).
    @Override
    public void use(GameCharacter c)
    {
        c.addMP(getRestorePts());
    }

    @Override
    public int getDefensePts() 
    {
        //Necessario para que a classe ManaPotion não seja vista como abstrata
        return -1;
    }

    @Override
    public int getAttackPts() 
    {
        //Necessario para que a classe ManaPotion não seja vista como abstrata
        return -1;
    }
}