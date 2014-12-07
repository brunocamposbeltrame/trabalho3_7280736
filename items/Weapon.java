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

public class Weapon extends Item
{
    //Atributos da classe Weapon.
    protected int attackpts;
    protected double range;
    protected boolean equipado = false;
    
    //Construtor padrao da classe Weapon. 
    public Weapon(String name, double price, int attpts, double range, boolean equipado)
    {
        super(name, price);
        this.verificaAttackPts(attpts);
        this.range = range;
        this.equipado = equipado;
    }
    
    //Construtor de copia da classe Weapon.
    public Weapon(Weapon w)
    {
        super(w.getName(), w.getPrice());
        this.attackpts = w.attackpts;
        this.range = w.range;
    }
    
    //Metodo que retorna os pontos de attack.
    @Override
    public int getAttackPts()
    {
        return this.attackpts;
    }
    
    //Metodo que retorna os pontos de defesa.
    @Override
    public int getDefensePts() 
    {
        return 0;
    }
    
    //Metodo que retorna o Range.  hpo.use(k);
    public double getRange()
    {
        return this.range;
    }
    
    //Metodo utilizado para verificar se os pontos de ataque são validos.
    private void verificaAttackPts(int attackpts)
    {
        if(attackpts >= 1 && attackpts <= 9)
        {
            this.attackpts = attackpts;
        }
        
        else
        {
            System.out.println("Pontos de ataque invalidos.");
            this.attackpts = 1;
        }
    }

    @Override
    public void use(GameCharacter c) 
    {
       
    }   
}