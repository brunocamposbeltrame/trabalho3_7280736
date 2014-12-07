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

public class HealthPotion extends Potion
{
    //Construtor da classe HealthPotion.
    public HealthPotion(String name, double price, int restoreHealth)
    {
        super(name, price, restoreHealth);
    }
    
    //Implementacao do metodo use() da classe pai (abstrata).
    @Override
    public void use(GameCharacter c) 
    {
        c.addHP(getRestorePts());
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