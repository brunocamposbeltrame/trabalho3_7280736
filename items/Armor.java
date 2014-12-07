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

public class Armor extends Item
{
    //Atributos da classe Armor
    protected int defensepts;
    protected double weight;
    protected boolean equipado = false;
    
    //Construtor da classe Armor.
    public Armor(String name, double price, int defpts, double w, boolean equipado) 
    {
        super(name, price);
        this.defensepts = defpts;
        this.weight = w;
        this.equipado = equipado;
    }
    
    //Construtor de copia da classe Armor.
    public Armor(Armor a)
    {
        super(a.getName(), a.getPrice());
        this.verificaDefensePts(defensepts);
        this.weight = a.weight;
    }
    
    //Metodo que retorna os pontos de defesa.
    public int getDefensePts()
    {
        return this.defensepts;
    }
    
    //Metodo que retorna os pontos de ataque.
    public int getAttackPts()
    {
        return 0;
    }
    
    //Metodo que retorna weight.
    public double getWeight()
    {
        return this.weight;
    }
    
    //Metodo utilizado para verificar se os pontos de defesa são validos.
    private void verificaDefensePts(int defensepts)
    {
        if(defensepts >= 1 && defensepts <= 20)
        {
            this.defensepts = defensepts;
        }
        
        else
        {
            System.out.println("Pontos de defesa invalidos.");
            this.defensepts = 1;
        }
    }

    @Override
    public void use(GameCharacter c) 
    {
       
    }
}