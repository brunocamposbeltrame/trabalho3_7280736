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

public abstract class Potion extends Item
{
    //Atributo da classe Potion.
    private int restorepts = 0;
    
    //Construtor personalizado da classe Potion.
    public Potion(String name, double price, int restore)
    {
        super(name, price);
        this.restorepts = restore; 
    }
    
    //Construtor de copia.
    public Potion(Potion p)
    {
        super(p.getName(), p.getPrice());
        this.restorepts = p.restorepts;
    }
    
    //Metodo que retorna os pontos que podem ser restaurados.
    public int getRestorePts()
    {
        return this.restorepts;
    }
    
    //Metodos abstrato para uso da poção de magia.
    @Override
    public abstract void use(GameCharacter c);
    
    @Override
    public int getDefensePts()
    {
        return this.restorepts;
    }
    
    @Override
    public int getAttackPts()
    {
        return 0;
    }
}