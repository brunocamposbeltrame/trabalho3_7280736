/* **********************************************************
 *   Nome: Bruno Campos Beltrame.                           *     
 *   NUSP: 7280736.                                         *
 *   Disciplina: SCC0204 Programacao Orientada a Objetos.   *
 *   Docente: Moacir Ponti.                                 *
 *                                                          *
 *   Trabalho Pratico - Parte II.                           *
 * **********************************************************/

package Principal;

import java.util.ArrayList;

public class Team 
{
    //Atributos privados da classe Team.
    private String name;
    private int win;
    private Color color;
    private int lose;
    private int draw;   
    private ArrayList<GameCharacter> characters;
    
    //Construtor personalizado da classe Team.
    public Team(String name, Color color)
    {
        this.name = name;
        characters = new ArrayList<>();
    }
    
    //Construtor padrão da classe Team.
    public Team()
    {
        characters = new ArrayList<>();
    }
    
    //Metodo utilizado para retornar o nome do time.
    public String getName()
    {
        return this.name;
    }
    
    //Metodo utilizado para modificar o nome.
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Metodo utilizado para modificar a cor do time.
    public void setColor(Color color)
    {
        this.color = color;
    }
    
    //Metodo utilizado para retornar os resultados.
    public String getResults()
    {
        return "Vitorias: " + this.win + "\nEmpates: " + this.draw + "\nDerrotas: " + this.lose + "\n";
    }
    
    //Metodo utilizado para expor a cor e o nome do time.
    @Override
    public String toString()
    {
        return ("Nome do time: " + this.name);
    }
    
    //Metodo utilizado para decidir a batalha, atraves das batalhas dos times.
    public int resolveBattle(Team team)
    {
        int aux = -1;
        int mortos1 = 0;
        int mortos2 = 0;
        
        for(int i = 0; i < characters.size(); i++)
        {
            if(characters.get(i).getHP() <= 0)
            {
                mortos1++;
            }
            
            if(team.getList().get(i).getHP() <= 0)
            {
                mortos2++;
            }
        }

        if(mortos1 < mortos2)
        {
                this.win++;
                aux = 0;
        }
            
            if(mortos1 > mortos2)
            {
                this.lose++;
                aux = 1;
            }
            
            if(mortos1 == mortos2)
            {
                this.draw++;
                aux = 2;
            }
            
        return aux;
    }
    
    //Metodo utilizado para adicionar um personagem ao time.
    public void addChar(GameCharacter c)
    {
        characters.add(c);
    }
    
    //Metodo utilizado para excluir um personagem do time, utilizando seu indice no ArrayList.
    public void removeChar(int index)
    {
        if(this.characters.isEmpty() == false && this.characters.contains(this.characters.get(index)) == true)
        {
            this.characters.remove(index);
        }
        
        else
        {
            System.out.println("Impossivel completar a operação.");
        }        
    }
    
    //Metodo utilizado para excluir um personagem do time, utilizando um personagem como parametro.
    public void removeChar(GameCharacter c)
    {
        if(this.characters.isEmpty() == false && this.characters.contains(c) == true)
        {
            this.characters.remove(c);
        }
        
        else
        {
            System.out.println("Impossivel completar a operação.");
        }      
    }
    
    //Metodo utilizado para encontrar determinado personagem.
    public GameCharacter searchChar(String name)
    {
        if(this.characters.isEmpty() == false)
        {
            int i = 0;
            int aux = 0;
            
            for(i = 0; i < this.characters.size(); i++)
            {
                if(this.characters.get(i).getName().equalsIgnoreCase(name) == true)
                {
                    aux = 1;
                    break;
                }
            }
            
            if(aux == 1)
            {
                return this.characters.get(i);
            }
            
            else
            {
                return null;
            }
        }
        
        else
        {
            System.out.println("Impossivel completar a operação.");
            return null;
        }
    }
    
    //Metodo utilizado para retornar a pontuação total do time.
    public int getPoints(int p)
    {
        int soma = 0;
        
        //Estrutura de loop Foreach...
        for (GameCharacter character : characters) 
        {
            soma += character.getHP();
        }
        
        return (soma / characters.size());
    }
    
    //Metodo que retorna a lista utilizada para armazenar os personagens.
    public ArrayList<GameCharacter> getList()
    {
        return this.characters;
    }
    
    public int getWin()
    {
        return this.win;
    }
    
    public int getDraw()
    {
        return this.draw;
    }
}