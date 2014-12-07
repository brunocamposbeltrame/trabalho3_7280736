/* **********************************************************
 *   Nome: Bruno Campos Beltrame.                           *     
 *   NUSP: 7280736.                                         *
 *   Disciplina: SCC0204 Programacao Orientada a Objetos.   *
 *   Docente: Moacir Ponti.                                 *
 *                                                          *
 *   Trabalho Pratico - Parte II.                           *
 * **********************************************************/

package Principal;

public enum Color 
{
    //Constantes criadas a partir do processo de enumeração.
    BLUE("Blue", 1), RED("Red", 2), GREEN("Green", 3), YELLOW("Yellow", 4), WHITE("White", 5), BLACK("Black", 6);
    
    private String colorName;
    private int colorValue;
    
    /*Na linguagem Java, se pretende-se iniciar o enum com valores, é preciso
    criar um contrutor que receba esse valor. */
    Color(String name, int value)
    {
        this.colorName = name;
        this.colorValue = value;
    }
    
    public String getColorName()
    {
        return this.colorName;
    }
    
    public int getColorValue()
    {
        return this.colorValue;
    }
}