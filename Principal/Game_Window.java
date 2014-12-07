/* **********************************************************
 *   Nome: Bruno Campos Beltrame.                           *     
 *   NUSP: 7280736.                                         *
 *   Disciplina: SCC0204 Programacao Orientada a Objetos.   *
 *   Docente: Moacir Ponti.                                 *
 *                                                          *
 *   Trabalho Pratico - Parte III.                           *
 * **********************************************************/

package Principal;

import items.Armor;
import items.HealthPotion;
import items.ManaPotion;
import items.Weapon;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class Game_Window extends javax.swing.JFrame 
{
    public Game_Window() 
    {
        team1 = new Team();
        team2 = new Team();
        initComponents();
    }
    
    Team team1;
    Team team2;

    private void initComponents() 
    {
        painelPrincipal = new javax.swing.JPanel();
        time1Desc = new javax.swing.JLabel();
        nomeDesc1 = new javax.swing.JLabel();
        nomeTime1 = new javax.swing.JTextField();
        corDesc1 = new javax.swing.JLabel();
        corTime1 = new javax.swing.JComboBox();
        corDesc2 = new javax.swing.JLabel();
        nomeDesc2 = new javax.swing.JLabel();
        time2Desc = new javax.swing.JLabel();
        nomeTime2 = new javax.swing.JTextField();
        corTime2 = new javax.swing.JComboBox();
        time1Pronto = new javax.swing.JToggleButton();
        time2Pronto = new javax.swing.JToggleButton();
        separador3 = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        jogadoresDesc1 = new javax.swing.JLabel();
        nomeJogDesc1 = new javax.swing.JLabel();
        tipoJogDesc1 = new javax.swing.JLabel();
        nomeJog1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaJog1 = new javax.swing.JTable();
        jogadoresDesc2 = new javax.swing.JLabel();
        nomeJogDesc2 = new javax.swing.JLabel();
        nomeJog2 = new javax.swing.JTextField();
        tipoJogDesc2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaJog2 = new javax.swing.JTable();
        addTime2 = new javax.swing.JButton();
        addTime1 = new javax.swing.JButton();
        deletar1 = new javax.swing.JButton();
        deletar2 = new javax.swing.JButton();
        jogadoresPronto1 = new javax.swing.JToggleButton();
        jogadoresPronto2 = new javax.swing.JToggleButton();
        separador4 = new javax.swing.JSeparator();
        resultsDesc1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultsTime1 = new javax.swing.JTextArea();
        resultDesc2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultsTime2 = new javax.swing.JTextArea();
        vencedorDesc = new javax.swing.JLabel();
        timeVencedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuInst = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo de RPG aleatório.");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(252, 238, 197));
        painelPrincipal.setForeground(new java.awt.Color(153, 37, 37));

        time1Desc.setFont(new java.awt.Font("Purisa", 1, 15)); 
        time1Desc.setForeground(new java.awt.Color(153, 37, 37));
        time1Desc.setText("Time 1");

        nomeDesc1.setFont(new java.awt.Font("Purisa", 0, 15));
        nomeDesc1.setForeground(new java.awt.Color(153, 37, 37));
        nomeDesc1.setText("Nome do time:");

        nomeTime1.addKeyListener(new java.awt.event.KeyAdapter() 
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                nomeTime1KeyReleased(evt);
            }
        });

        corDesc1.setFont(new java.awt.Font("Purisa", 0, 15));
        corDesc1.setForeground(new java.awt.Color(153, 37, 37));
        corDesc1.setText("Cor do time:");

        corTime1.setFont(new java.awt.Font("Purisa", 0, 15));
        corTime1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Blue", "Red", "Green", "Yellow", "White", "Black" }));
        corTime1.addItemListener(new java.awt.event.ItemListener() 
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt) 
            {
                corTime1ItemStateChanged(evt);
            }
        });

        corTime1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                
            }
        });

        corDesc2.setFont(new java.awt.Font("Purisa", 0, 15)); 
        corDesc2.setForeground(new java.awt.Color(153, 37, 37));
        corDesc2.setText("Cor do time:");

        nomeDesc2.setFont(new java.awt.Font("Purisa", 0, 15)); 
        nomeDesc2.setForeground(new java.awt.Color(153, 37, 37));
        nomeDesc2.setText("Nome do time:");

        time2Desc.setFont(new java.awt.Font("Purisa", 1, 15)); 
        time2Desc.setForeground(new java.awt.Color(153, 37, 37));
        time2Desc.setText("Time 2");

        nomeTime2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeTime2KeyReleased(evt);
            }
        });

        corTime2.setFont(new java.awt.Font("Purisa", 0, 15));
        corTime2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Blue", "Red", "Green", "Yellow", "White", "Black" }));
        corTime2.addItemListener(new java.awt.event.ItemListener() 
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt) 
            {
                corTime2ItemStateChanged(evt);
            }
        });

        time1Pronto.setFont(new java.awt.Font("Purisa", 0, 15));
        time1Pronto.setText("Time 1 pronto!");
        time1Pronto.setEnabled(false);
        time1Pronto.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                time1ProntoActionPerformed(evt);
            }
        });

        time2Pronto.setFont(new java.awt.Font("Purisa", 0, 15)); 
        time2Pronto.setText("Time 2 pronto!");
        time2Pronto.setEnabled(false);
        time2Pronto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                time2ProntoActionPerformed(evt);
            }
        });

        separador1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        separador2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jogadoresDesc1.setFont(new java.awt.Font("Purisa", 1, 15));
        jogadoresDesc1.setForeground(new java.awt.Color(153, 37, 37));
        jogadoresDesc1.setText("Jogadores Time 1");
        jogadoresDesc1.setEnabled(false);

        nomeJogDesc1.setFont(new java.awt.Font("Purisa", 0, 15));
        nomeJogDesc1.setForeground(new java.awt.Color(153, 37, 37));
        nomeJogDesc1.setText("Nome jogador:");
        nomeJogDesc1.setEnabled(false);

        tipoJogDesc1.setFont(new java.awt.Font("Purisa", 0, 15));
        tipoJogDesc1.setForeground(new java.awt.Color(153, 37, 37));
        tipoJogDesc1.setText("Tipo jogador:");
        tipoJogDesc1.setEnabled(false);

        nomeJog1.setEnabled(false);
        nomeJog1.addKeyListener(new java.awt.event.KeyAdapter() 
        {
            public void keyReleased(java.awt.event.KeyEvent evt) 
            {
                nomeJog1KeyReleased(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Purisa", 0, 15));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------", "Wizard", "Knight", "Thief" }));
        jComboBox3.setEnabled(false);
        jComboBox3.addItemListener(new java.awt.event.ItemListener() 
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt) 
            {
                jComboBox3ItemStateChanged(evt);
            }
        });

        tabelaJog1.setFont(new java.awt.Font("Purisa", 0, 15));
        tabelaJog1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] 
            {
                "Nome do jogador", "Tipo do jogador"
            }
        ));
        
        tabelaJog1.setEnabled(false);
        tabelaJog1.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                tabelaJog1MouseClicked(evt);
            }
            
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                tabelaJog1MouseEntered(evt);
            }
        });
        
        jScrollPane1.setViewportView(tabelaJog1);
        if (tabelaJog1.getColumnModel().getColumnCount() > 0)
        {
            tabelaJog1.getColumnModel().getColumn(0).setResizable(false);
            tabelaJog1.getColumnModel().getColumn(1).setResizable(false);
        }

        jogadoresDesc2.setFont(new java.awt.Font("Purisa", 1, 15));
        jogadoresDesc2.setForeground(new java.awt.Color(153, 37, 37));
        jogadoresDesc2.setText("Jogadores Time 1");
        jogadoresDesc2.setEnabled(false);

        nomeJogDesc2.setFont(new java.awt.Font("Purisa", 0, 15)); 
        nomeJogDesc2.setForeground(new java.awt.Color(153, 37, 37));
        nomeJogDesc2.setText("Nome jogador:");
        nomeJogDesc2.setEnabled(false);

        nomeJog2.setEnabled(false);
        nomeJog2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt) 
            {
                nomeJog2KeyReleased(evt);
            }
        });

        tipoJogDesc2.setFont(new java.awt.Font("Purisa", 0, 15)); 
        tipoJogDesc2.setForeground(new java.awt.Color(153, 37, 37));
        tipoJogDesc2.setText("Tipo jogador:");
        tipoJogDesc2.setEnabled(false);

        jComboBox4.setFont(new java.awt.Font("Purisa", 0, 15)); 
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------", "Wizard", "Knight", "Thief" }));
        jComboBox4.setEnabled(false);
        jComboBox4.addItemListener(new java.awt.event.ItemListener() 
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBox4ItemStateChanged(evt);
            }
        });

        tabelaJog2.setFont(new java.awt.Font("Purisa", 0, 15));
        tabelaJog2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {
                {null, null},
                {null, null},
                {null, null}
            },
            new String []
            {
                "Nome do jogador", "Tipo do jogador"
            }
        ));
        
        tabelaJog2.setEnabled(false);
        tabelaJog2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tabelaJog2MouseClicked(evt);
            }
        });
        
        jScrollPane2.setViewportView(tabelaJog2);
        if (tabelaJog2.getColumnModel().getColumnCount() > 0) 
        {
            tabelaJog2.getColumnModel().getColumn(0).setResizable(false);
            tabelaJog2.getColumnModel().getColumn(1).setResizable(false);
        }

        addTime2.setFont(new java.awt.Font("Purisa", 0, 15));
        addTime2.setText("Adicionar Time 2");
        addTime2.setEnabled(false);
        addTime2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                addTime2ActionPerformed(evt);
            }
        });

        addTime1.setFont(new java.awt.Font("Purisa", 0, 15));
        addTime1.setText("Adicionar Time 1");
        addTime1.setEnabled(false);
        addTime1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addTime1ActionPerformed(evt);
            }
        });

        deletar1.setFont(new java.awt.Font("Purisa", 0, 15));
        deletar1.setText("Deletar 1");
        deletar1.setEnabled(false);
        deletar1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                deletar1ActionPerformed(evt);
            }
        });

        deletar2.setFont(new java.awt.Font("Purisa", 0, 15)); 
        deletar2.setText("Deletar 2");
        deletar2.setEnabled(false);
        deletar2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deletar2ActionPerformed(evt);
            }
        });

        jogadoresPronto1.setFont(new java.awt.Font("Purisa", 0, 15));
        jogadoresPronto1.setText("Time 1 pronto!");
        jogadoresPronto1.setEnabled(false);
        jogadoresPronto1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jogadoresPronto1ActionPerformed(evt);
            }
        });

        jogadoresPronto2.setFont(new java.awt.Font("Purisa", 0, 15));
        jogadoresPronto2.setText("Time 2 pronto!");
        jogadoresPronto2.setEnabled(false);
        jogadoresPronto2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jogadoresPronto2ActionPerformed(evt);
            }
        });

        resultsDesc1.setFont(new java.awt.Font("Purisa", 0, 15));
        resultsDesc1.setForeground(new java.awt.Color(153, 37, 37));
        resultsDesc1.setText("Resultados Time 1:");
        resultsDesc1.setEnabled(false);

        resultsTime1.setColumns(20);
        resultsTime1.setRows(5);
        resultsTime1.setEnabled(false);
        jScrollPane3.setViewportView(resultsTime1);

        resultDesc2.setFont(new java.awt.Font("Purisa", 0, 15));
        resultDesc2.setForeground(new java.awt.Color(153, 37, 37));
        resultDesc2.setText("Resultados Time 2:");
        resultDesc2.setEnabled(false);

        resultsTime2.setColumns(20);
        resultsTime2.setRows(5);
        resultsTime2.setEnabled(false);
        jScrollPane4.setViewportView(resultsTime2);

        vencedorDesc.setFont(new java.awt.Font("Purisa", 0, 15));
        vencedorDesc.setForeground(new java.awt.Color(153, 37, 37));
        vencedorDesc.setText("Time vencedor:");
        vencedorDesc.setEnabled(false);

        timeVencedor.setFont(new java.awt.Font("Purisa", 0, 15));
        timeVencedor.setText("Time vencedor");
        timeVencedor.setEnabled(false);

        jButton1.setText("Novo jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeDesc1)
                            .addComponent(corDesc1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTime1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(corTime1, 0, 1, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(time1Desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeDesc2)
                            .addComponent(corDesc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTime2)
                            .addComponent(corTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(time2Desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time2Pronto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(time1Pronto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addComponent(separador3)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jogadoresDesc1)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(painelPrincipalLayout.createSequentialGroup()
                                    .addComponent(nomeJogDesc1)
                                    .addGap(31, 31, 31)
                                    .addComponent(nomeJog1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                                    .addComponent(tipoJogDesc1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)))
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addComponent(tipoJogDesc2)
                        .addGap(40, 40, 40)
                        .addComponent(jComboBox4, 0, 115, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(nomeJogDesc2)
                        .addGap(31, 31, 31)
                        .addComponent(nomeJog2))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(jogadoresDesc2)
                                .addGap(45, 45, 45))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTime2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletar1)
                    .addComponent(deletar2)
                    .addComponent(jogadoresPronto1)
                    .addComponent(jogadoresPronto2)
                    .addComponent(addTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addComponent(separador4)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultsDesc1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultDesc2))
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vencedorDesc)
                            .addComponent(timeVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(time1Desc)
                                .addGap(9, 9, 9)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomeTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeDesc1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(corDesc1)
                                    .addComponent(corTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(time2Desc)
                                        .addGap(9, 9, 9)
                                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nomeTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nomeDesc2)))
                                    .addComponent(time1Pronto, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(corDesc2)
                                    .addComponent(corTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(time2Pronto)))))
                    .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jogadoresDesc1)
                        .addGap(9, 9, 9)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeJogDesc1)
                            .addComponent(nomeJog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoJogDesc1)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(jogadoresDesc2)
                                .addGap(9, 9, 9)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomeJogDesc2)
                                    .addComponent(nomeJog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tipoJogDesc2)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(addTime1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addTime2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletar1)))
                        .addGap(6, 6, 6)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(deletar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jogadoresPronto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jogadoresPronto2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(resultsDesc1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(resultDesc2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(vencedorDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(195, 171, 171));
        jMenuBar1.setForeground(new java.awt.Color(167, 220, 227));

        jMenu1.setText("Opções");

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuExit.setText("Exit");
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        menuInst.setText("Ajuda");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Instruções");
        menuInst.add(jMenuItem2);

        menuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                menuSobreActionPerformed(evt);
            }
        });
        
        menuInst.add(menuSobre);

        jMenuBar1.add(menuInst);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }                    

    //Evento para quando o botao "Time 1 Pronto" for acionado.
    private void time1ProntoActionPerformed(java.awt.event.ActionEvent evt) {
        String stringAux1 = this.nomeTime1.getText();
        String stringAux2 = this.nomeTime2.getText();
        int selectedColor1 = this.corTime1.getSelectedIndex();
        int selectedColor2 = this.corTime2.getSelectedIndex();
        
        if(this.time1Pronto.isSelected() == true && this.time2Pronto.isSelected() == true)
        {
            team1.setName(stringAux1);
            team2.setName(stringAux2);
            
            switch(selectedColor1)
            {
                case 1:
                    team1.setColor(Color.BLUE);
                    break;
                case 2:
                    team1.setColor(Color.RED);
                    break;
                case 3:
                    team1.setColor(Color.GREEN);
                    break;
                case 4:
                    team1.setColor(Color.YELLOW);
                    break;
                case 5:
                    team1.setColor(Color.WHITE);
                    break;
                case 6:
                    team1.setColor(Color.BLACK);
                    break;
                default:
                    break;
            }
            
            switch(selectedColor2)
            {
                case 1:
                    team2.setColor(Color.BLUE);
                    break;
                case 2:
                    team2.setColor(Color.RED);
                    break;
                case 3:
                    team2.setColor(Color.GREEN);
                    break;
                case 4:
                    team2.setColor(Color.YELLOW);
                    break;
                case 5:
                    team2.setColor(Color.WHITE);
                    break;
                case 6:
                    team2.setColor(Color.BLACK);
                    break;
                default:
                    break;
            }
            
            this.time1Desc.setEnabled(false);
            this.corDesc1.setEnabled(false);
            this.time2Desc.setEnabled(false);
            this.corDesc2.setEnabled(false);
            this.time1Pronto.setEnabled(false);
            this.time2Pronto.setEnabled(false);
            this.nomeTime1.setEnabled(false);
            this.nomeTime2.setEnabled(false);
            this.corTime1.setEnabled(false);
            this.corTime2.setEnabled(false);
            this.nomeDesc1.setEnabled(false);
            this.nomeDesc2.setEnabled(false);
            this.painelPrincipal.setEnabled(false);
            
            this.nomeJogDesc1.setEnabled(true);
            this.nomeJogDesc2.setEnabled(true);
            this.jogadoresDesc1.setEnabled(true);
            this.jogadoresDesc2.setEnabled(true);
            this.tipoJogDesc1.setEnabled(true);
            this.tipoJogDesc2.setEnabled(true);
            this.jComboBox3.setEnabled(true);
            this.jComboBox4.setEnabled(true);
            this.tabelaJog1.setEnabled(true);
            this.tabelaJog2.setEnabled(true);
            this.tabelaJog2.setEnabled(true);
            this.nomeJog1.setEnabled(true);
            this.nomeJog2.setEnabled(true);       
        }
    }

    //Evento para quando o botao "Time 1 Pronto" for acionado.
    private void time2ProntoActionPerformed(java.awt.event.ActionEvent evt) {
        String stringAux1 = this.nomeTime1.getText();
        String stringAux2 = this.nomeTime2.getText();
        int selectedColor1 = this.corTime1.getSelectedIndex();
        int selectedColor2 = this.corTime2.getSelectedIndex();
        
        if(this.time1Pronto.isSelected() == true && this.time2Pronto.isSelected() == true)
        {
            team1.setName(stringAux1);
            team2.setName(stringAux2);
            
            switch(selectedColor1)
            {
                case 1:
                    team1.setColor(Color.BLUE);
                    break;
                case 2:
                    team1.setColor(Color.RED);
                    break;
                case 3:
                    team1.setColor(Color.GREEN);
                    break;
                case 4:
                    team1.setColor(Color.YELLOW);
                    break;
                case 5:
                    team1.setColor(Color.WHITE);
                    break;
                case 6:
                    team1.setColor(Color.BLACK);
                    break;
                default:
                    break;
            }
            
            switch(selectedColor2)
            {
                case 1:
                    team2.setColor(Color.BLUE);
                    break;
                case 2:
                    team2.setColor(Color.RED);
                    break;
                case 3:
                    team2.setColor(Color.GREEN);
                    break;
                case 4:
                    team2.setColor(Color.YELLOW);
                    break;
                case 5:
                    team2.setColor(Color.WHITE);
                    break;
                case 6:
                    team2.setColor(Color.BLACK);
                    break;
                default:
                    break;
            }
            
            this.time1Desc.setEnabled(false);
            this.corDesc1.setEnabled(false);
            this.time2Desc.setEnabled(false);
            this.corDesc2.setEnabled(false);
            this.time1Pronto.setEnabled(false);
            this.time2Pronto.setEnabled(false);
            this.nomeTime1.setEnabled(false);
            this.nomeTime2.setEnabled(false);
            this.corTime1.setEnabled(false);
            this.corTime2.setEnabled(false);
            this.nomeDesc1.setEnabled(false);
            this.nomeDesc2.setEnabled(false);
            this.painelPrincipal.setEnabled(false);
            
            this.nomeJogDesc1.setEnabled(true);
            this.nomeJogDesc2.setEnabled(true);
            this.jogadoresDesc1.setEnabled(true);
            this.jogadoresDesc2.setEnabled(true);
            this.tipoJogDesc1.setEnabled(true);
            this.tipoJogDesc2.setEnabled(true);
            this.jComboBox3.setEnabled(true);
            this.jComboBox4.setEnabled(true);
            this.tabelaJog1.setEnabled(true);
            this.tabelaJog2.setEnabled(true);
            this.tabelaJog2.setEnabled(true);
            this.nomeJog1.setEnabled(true);
            this.nomeJog2.setEnabled(true);       
        }
    }

    //Evento para quando o seletor de texto do nome do time 1 e acionado com uma tecla.
    private void nomeTime1KeyReleased(java.awt.event.KeyEvent evt) 
    {
        if(this.nomeTime1.getText().length() >= 4 && this.corTime1.getSelectedIndex() != 0)
        {
            this.time1Pronto.setEnabled(true);
        }
        
        else
        {
            this.time1Pronto.setEnabled(false);
        }      
    }

    //Evento para quando o estado do ComboBox "Cor do time 1" e modificado.
    private void corTime1ItemStateChanged(java.awt.event.ItemEvent evt) 
    {
        if(this.nomeTime1.getText().length() >= 4 && this.corTime1.getSelectedIndex() != 0)
        {
            this.time1Pronto.setEnabled(true);
        }
        
        else
        {
            this.time1Pronto.setEnabled(false);
        }   
    }

    //Evento para quando o seletor de texto do nome do time 2 e acionado com uma tecla.
    private void nomeTime2KeyReleased(java.awt.event.KeyEvent evt) 
    {
        if(this.nomeTime2.getText().length() >= 4 && this.corTime2.getSelectedIndex() != 0)
        {
            this.time2Pronto.setEnabled(true);
        }
        
        else
        {
            this.time2Pronto.setEnabled(false);
        }   
    }

    //Evento para quando o estado do ComboBox "Cor do time 1" e modificado.
    private void corTime2ItemStateChanged(java.awt.event.ItemEvent evt) 
    {
        if(this.nomeTime2.getText().length() >= 4 && this.corTime2.getSelectedIndex() != 0)
        {
            this.time2Pronto.setEnabled(true);
        }
        
        else
        {
            this.time2Pronto.setEnabled(false);
        }   
    }
 
    private void nomeJog2KeyReleased(java.awt.event.KeyEvent evt) 
    {
        if(this.nomeJog2.getText().length() >= 4 && this.jComboBox4.getSelectedIndex() != 0 && team2.getList().size() < 2)
        {
           this.addTime2.setEnabled(true);
        }
        
        else
        {
            this.addTime2.setEnabled(false);
        }
    }

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) 
    {
        if(this.nomeJog2.getText().length() >= 4 && this.jComboBox4.getSelectedIndex() != 0 && team2.getList().size() < 3)
        {
           this.addTime2.setEnabled(true);
        }
        
        else
        {
            this.addTime2.setEnabled(false);
        }
    }

    private void addTime1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        String nameAux = this.nomeJog1.getText();
        Random random = new Random();
        
        switch(this.jComboBox3.getSelectedIndex())
        {
            case 1:
                Wizard wizard = new Wizard(nameAux, random.nextInt(11));
                wizard.setConstitution((random.nextInt(20) + 1));
                wizard.setDexterity((random.nextInt(30) + 1));
                wizard.setSpeed((random.nextInt(30) + 1));
                wizard.setStrenght((random.nextInt(15) + 1));
                wizard.setXP((random.nextInt(100) + 1));
                wizard.setHP(100);
                
                Armor a1 = new Armor("Wizard Armor", 10, random.nextInt(21), (random.nextDouble() * 20), true);
                Weapon w1 = new Weapon("Wizard Weapon", 10, random.nextInt(10), (random.nextDouble() * 10), true);
                ManaPotion mp1 = new ManaPotion("Wizard Mana Potion", 10, random.nextInt(10));
                
                wizard.getMyitems().setSpaces(3);
                wizard.getMyitems().insertItem(a1, true);
                wizard.getMyitems().insertItem(w1, true);
                wizard.getMyitems().insertItem(mp1, true);
                
                team1.addChar(wizard);
              
                break;
            case 2:
                Knight knight = new Knight(nameAux, random.nextInt(11));
                knight.setConstitution((random.nextInt(45) + 1));
                knight.setDexterity((random.nextInt(15) + 1));
                knight.setSpeed((random.nextInt(10) + 1));
                knight.setStrenght((random.nextInt(25) + 1));
                knight.setXP((random.nextInt(100) + 1));
                knight.setHP(100);
                
                Armor a2 = new Armor("Knight Armor", 10, random.nextInt(21), (random.nextDouble() * 20), true);
                Weapon w2 = new Weapon("Knight Weapon", 10, random.nextInt(10), (random.nextDouble() * 10), true);
                HealthPotion hp1 = new HealthPotion("Knight Health Potion", 10, random.nextInt(10));
                
                knight.getMyitems().setSpaces(3);
                knight.getMyitems().insertItem(a2, true);
                knight.getMyitems().insertItem(w2, true);
                knight.getMyitems().insertItem(hp1, true);
                
                team1.addChar(knight);
                
                break;
            case 3:
                Thief thief = new Thief(nameAux, random.nextInt(11));
                thief.setConstitution((random.nextInt(10) + 1));
                thief.setDexterity((random.nextInt(45) + 1));
                thief.setSpeed((random.nextInt(30) + 1));
                thief.setStrenght((random.nextInt(15) + 1));
                thief.setXP((random.nextInt(100) + 1));
                thief.setHP(100);
                
                Armor a3 = new Armor("Thief Armor", 10, random.nextInt(21), (random.nextDouble() * 20), true);
                Weapon w3 = new Weapon("Thief Weapon", 10, random.nextInt(10), (random.nextDouble() * 10), true);
                HealthPotion hp2 = new HealthPotion("Thief Health Potion", 10, random.nextInt(10));
                
                thief.getMyitems().setSpaces(3);
                thief.getMyitems().insertItem(a3, true);
                thief.getMyitems().insertItem(w3, true);
                thief.getMyitems().insertItem(hp2, true);
                
                team1.addChar(thief);
                
                break;
        }
        
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Character name");
        table.addColumn("Character type");
        
        for(int i = 0; i < team1.getList().size(); i++)
        {
            table.addRow(new Object[]{team1.getList().get(i).getName(), team1.getList().get(i).getClass().toString()});
        }
        
        this.tabelaJog1.setModel(table);
        
        this.nomeJog1.setText("");
        this.jComboBox3.setSelectedIndex(0);
        this.addTime1.setEnabled(false);
        
        if(team1.getList().size() == 3)
        {
            this.jogadoresPronto1.setEnabled(true);
        }
    }

    private void jogadoresPronto1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if(this.jogadoresPronto1.isSelected() == true && this.jogadoresPronto2.isSelected() == true && team1.getList().size() == 3)
        {
            this.nomeJogDesc1.setEnabled(false);
            this.nomeJogDesc2.setEnabled(false);
            this.jogadoresDesc1.setEnabled(false);
            this.jogadoresDesc2.setEnabled(false);
            this.tipoJogDesc1.setEnabled(false);
            this.tipoJogDesc2.setEnabled(false);
            this.jComboBox3.setEnabled(false);
            this.jComboBox4.setEnabled(false);
            this.tabelaJog1.setEnabled(false);
            this.tabelaJog2.setEnabled(false);
            this.tabelaJog2.setEnabled(false);
            this.nomeJog1.setEnabled(false);
            this.nomeJog2.setEnabled(false);
            this.addTime1.setEnabled(false);
            this.addTime2.setEnabled(false);
            this.deletar1.setEnabled(false);
            this.deletar2.setEnabled(false);
            this.jogadoresPronto1.setEnabled(false);
            this.jogadoresPronto2.setEnabled(false);
            
            this.resultsDesc1.setEnabled(true);
            this.resultDesc2.setEnabled(true);
            this.resultsTime1.setEnabled(true);
            this.resultsTime2.setEnabled(true);
            this.vencedorDesc.setEnabled(true);
            this.timeVencedor.setEnabled(true);
            
            team1.getList().get(0).attack(team2.getList().get(2));
            team1.getList().get(2).attack(team2.getList().get(1));
            team1.getList().get(1).attack(team2.getList().get(0));
            
            team1.resolveBattle(team2);
            this.resultsTime1.setText(this.team1.toString() + "\n\n" + this.team1.getResults());
            
            for(int j = 0; j < 3; j++)
            {
                team1.getList().get(j).setHP(100);
                team2.getList().get(j).setHP(100);
            }
            
            team2.getList().get(0).attack(team2.getList().get(2));
            team2.getList().get(2).attack(team2.getList().get(1));
            team2.getList().get(1).attack(team2.getList().get(0));
            
            team2.resolveBattle(team1);
            this.resultsTime2.setText(this.team2.toString() + "\n\n" + this.team2.getResults());
            
            if(team1.getWin() > team2.getWin())
            {
                this.timeVencedor.setText("Time " + team1.getName());
            }
            
            if(team1.getWin() == team2.getWin())
            {
                if(team1.getDraw() > team2.getDraw())
                {
                    this.timeVencedor.setText("Time " + team1.getName());
                }
                
                if(team1.getDraw() == team2.getDraw())
                {
                    this.timeVencedor.setText("Empate");
                }
                
                if(team1.getDraw() < team2.getDraw())
                {
                    this.timeVencedor.setText("Time " + team2.getName());
                }   
            }
            
            if(team1.getWin() < team2.getWin())
            {
                this.timeVencedor.setText("Time " + team2.getName());
            }
        }
    }

    private void jogadoresPronto2ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if(this.jogadoresPronto2.isSelected() == true && this.jogadoresPronto1.isSelected() == true && team2.getList().size() == 3)
        {
            this.nomeJogDesc1.setEnabled(false);
            this.nomeJogDesc2.setEnabled(false);
            this.jogadoresDesc1.setEnabled(false);
            this.jogadoresDesc2.setEnabled(false);
            this.tipoJogDesc1.setEnabled(false);
            this.tipoJogDesc2.setEnabled(false);
            this.jComboBox3.setEnabled(false);
            this.jComboBox4.setEnabled(false);
            this.tabelaJog1.setEnabled(false);
            this.tabelaJog2.setEnabled(false);
            this.tabelaJog2.setEnabled(false);
            this.nomeJog1.setEnabled(false);
            this.nomeJog2.setEnabled(false);
            this.addTime1.setEnabled(false);
            this.addTime2.setEnabled(false);
            this.deletar1.setEnabled(false);
            this.deletar2.setEnabled(false);
            this.jogadoresPronto1.setEnabled(false);
            this.jogadoresPronto2.setEnabled(false);

            this.resultsDesc1.setEnabled(true);
            this.resultDesc2.setEnabled(true);
            this.resultsTime1.setEnabled(true);
            this.resultsTime2.setEnabled(true);
            this.vencedorDesc.setEnabled(true);
            this.timeVencedor.setEnabled(true);    
            
            team1.getList().get(0).attack(team2.getList().get(2));
            team1.getList().get(2).attack(team2.getList().get(1));
            team1.getList().get(1).attack(team2.getList().get(0));
            
            team1.resolveBattle(team2);
            this.resultsTime1.setText(this.team1.toString() + "\n\n" + this.team1.getResults());
            
            for(int j = 0; j < 3; j++)
            {
                team1.getList().get(j).setHP(100);
                team2.getList().get(j).setHP(100);
            }
            
            team2.getList().get(0).attack(team2.getList().get(2));
            team2.getList().get(2).attack(team2.getList().get(1));
            team2.getList().get(1).attack(team2.getList().get(0));
            
            team2.resolveBattle(team1);
            this.resultsTime2.setText(this.team2.toString() + "\n\n" + this.team2.getResults());
            
            if(team1.getWin() > team2.getWin())
            {
                this.timeVencedor.setText("Time " + team1.getName());
            }
            
            if(team1.getWin() == team2.getWin())
            {
                if(team1.getDraw() > team2.getDraw())
                {
                    this.timeVencedor.setText("Time " + team1.getName());
                }
                
                if(team1.getDraw() == team2.getDraw())
                {
                    this.timeVencedor.setText("Empate");
                }
                
                if(team1.getDraw() < team2.getDraw())
                {
                    this.timeVencedor.setText("Time " + team2.getName());
                }   
            }
            
            if(team1.getWin() < team2.getWin())
            {
                this.timeVencedor.setText("Time " + team2.getName());
            }
        }
    }

    private void addTime2ActionPerformed(java.awt.event.ActionEvent evt) 
    {
       String nameAux = this.nomeJog2.getText();
        Random random = new Random();
        
        switch(this.jComboBox4.getSelectedIndex())
        {
            case 1:
                Wizard wizard = new Wizard(nameAux, random.nextInt(11));
                wizard.setConstitution((random.nextInt(20) + 1));
                wizard.setDexterity((random.nextInt(30) + 1));
                wizard.setSpeed((random.nextInt(30) + 1));
                wizard.setStrenght((random.nextInt(15) + 1));
                wizard.setXP((random.nextInt(100) + 1));
                wizard.setHP(100);
                
                Armor a1 = new Armor("Wizard Armor", 10, random.nextInt(21), (random.nextDouble() * 20), true);
                Weapon w1 = new Weapon("Wizard Weapon", 10, random.nextInt(10), (random.nextDouble() * 10), true);
                ManaPotion mp1 = new ManaPotion("Wizard Mana Potion", 10, random.nextInt(10));
                
                wizard.getMyitems().setSpaces(3);
                wizard.getMyitems().insertItem(a1, true);
                wizard.getMyitems().insertItem(w1, true);
                wizard.getMyitems().insertItem(mp1, true);
                
                team2.addChar(wizard);
              
                break;
            case 2:
                Knight knight = new Knight(nameAux, random.nextInt(11));
                knight.setConstitution((random.nextInt(45) + 1));
                knight.setDexterity((random.nextInt(15) + 1));
                knight.setSpeed((random.nextInt(10) + 1));
                knight.setStrenght((random.nextInt(25) + 1));
                knight.setXP((random.nextInt(100) + 1));
                knight.setHP(100);
                
                Armor a2 = new Armor("Knight Armor", 10, random.nextInt(21), (random.nextDouble() * 20), true);
                Weapon w2 = new Weapon("Knight Weapon", 10, random.nextInt(10), (random.nextDouble() * 10), true);
                HealthPotion hp1 = new HealthPotion("Knight Health Potion", 10, random.nextInt(10));
                
                knight.getMyitems().setSpaces(3);
                knight.getMyitems().insertItem(a2, true);
                knight.getMyitems().insertItem(w2, true);
                knight.getMyitems().insertItem(hp1, true);
                
                team2.addChar(knight);
                
                break;
            case 3:
                Thief thief = new Thief(nameAux, random.nextInt(11));
                thief.setConstitution((random.nextInt(10) + 1));
                thief.setDexterity((random.nextInt(45) + 1));
                thief.setSpeed((random.nextInt(30) + 1));
                thief.setStrenght((random.nextInt(15) + 1));
                thief.setXP((random.nextInt(100) + 1));
                thief.setHP(10);
                
                Armor a3 = new Armor("Thief Armor", 10, random.nextInt(21), (random.nextDouble() * 20), true);
                Weapon w3 = new Weapon("Thief Weapon", 10, random.nextInt(10), (random.nextDouble() * 10), true);
                HealthPotion hp2 = new HealthPotion("Thief Health Potion", 10, random.nextInt(10));
                
                thief.getMyitems().setSpaces(3);
                thief.getMyitems().insertItem(a3, true);
                thief.getMyitems().insertItem(w3, true);
                thief.getMyitems().insertItem(hp2, true);
                
                team2.addChar(thief);
                
                break;
        }
        
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Nome do jogador");
        table.addColumn("Tipo do jogador");
        
        for(int i = 0; i < team2.getList().size(); i++)
        {
            table.addRow(new Object[]{team2.getList().get(i).getName(), team2.getList().get(i).getClass().toString()});
        }
        
        this.tabelaJog2.setModel(table);
        
        this.nomeJog2.setText("");
        this.jComboBox4.setSelectedIndex(0);
        this.addTime2.setEnabled(false);
        
        if(team2.getList().size() == 3)
        {
            this.jogadoresPronto2.setEnabled(true);
        }
    }

    private void tabelaJog1MouseClicked(java.awt.event.MouseEvent evt)
    {
        if(this.tabelaJog1.getRowSelectionAllowed() == true)
        {
            this.deletar1.setEnabled(true);
        }
        
        else
        {
            this.deletar1.setEnabled(false);
        }
    }

    private void tabelaJog2MouseClicked(java.awt.event.MouseEvent evt)
     {
        if(this.tabelaJog2.getSelectedRow() >= 0)
        {
            this.deletar2.setEnabled(true);
        }
        
        else
        {
            this.deletar2.setEnabled(false);
        }
    }

    private void tabelaJog1MouseEntered(java.awt.event.MouseEvent evt) 
    {
        if(this.tabelaJog1.getSelectedRow() >= 0)
        {
            this.deletar1.setEnabled(true);
        }
        
        else
        {
            this.deletar1.setEnabled(false);
        }
    }

    private void deletar1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if(this.tabelaJog1.getSelectedRow() >= 0)
        {
            team1.removeChar(this.tabelaJog1.getSelectedRow());
            this.deletar1.setEnabled(false); 
        }

        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Character name");
        table.addColumn("Character type");
        
        for(int i = 0; i < team1.getList().size(); i++)
        {
            table.addRow(new Object[]{team1.getList().get(i).getName(), team1.getList().get(i).getClass().toString()});
        }
        
        this.tabelaJog1.setModel(table);
    }

    private void deletar2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(this.tabelaJog2.getSelectedRow() >= 0)
        {
            team2.removeChar(this.tabelaJog2.getSelectedRow());
            this.deletar2.setEnabled(false); 
        }
        
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Character name");
        table.addColumn("Character type");
        
        for(int i = 0; i < team2.getList().size(); i++)
        {
            table.addRow(new Object[]{team2.getList().get(i).getName(), team2.getList().get(i).getClass().toString()});
        }
        
        this.tabelaJog2.setModel(table);
    }

    private void nomeJog1KeyReleased(java.awt.event.KeyEvent evt) 
    {
        if(this.nomeJog1.getText().length() >= 4 && this.jComboBox3.getSelectedIndex() != 0 && team1.getList().size() < 3)
        {
            this.addTime1.setEnabled(true);
        }

        else
        {
            this.addTime1.setEnabled(false);
        }
    }

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) 
    {
        if(this.nomeJog1.getText().length() >= 4 && this.jComboBox3.getSelectedIndex() != 0 && team1.getList().size() < 3)
        {
            this.addTime1.setEnabled(true);
        }

        else
        {
            this.addTime1.setEnabled(false);
        }
    }

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) 
    {
        About_Window.getInstance().setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        for(int j = 0; j < 3; j++)
        {
            team1.getList().get(j).setHP(100);
            team2.getList().get(j).setHP(100);
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                team1.getList().get(i).attack(team2.getList().get(i));
            }
        }
        
        team1.resolveBattle(team2);
        this.resultsTime1.setText(this.team1.toString() + "\n\n" + this.team1.getResults());
        
        for(int j = 0; j < 3; j++)
        {
            team1.getList().get(j).setHP(100);
            team2.getList().get(j).setHP(100);
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                team2.getList().get(i).attack(team1.getList().get(i));
            }
        }
            
        team2.resolveBattle(team1);
        this.resultsTime2.setText(this.team2.toString() + "\n\n" + this.team2.getResults());
        
        if(team1.getWin() > team2.getWin())
            {
                this.timeVencedor.setText("Time " + team1.getName());
            }
            
            if(team1.getWin() == team2.getWin())
            {
                if(team1.getDraw() > team2.getDraw())
                {
                    this.timeVencedor.setText("Time " + team1.getName());
                }
                
                if(team1.getDraw() == team2.getDraw())
                {
                    this.timeVencedor.setText("Empate");
                }
                
                if(team1.getDraw() < team2.getDraw())
                {
                    this.timeVencedor.setText("Time " + team2.getName());
                }   
            }
            
            if(team1.getWin() < team2.getWin())
            {
                this.timeVencedor.setText("Time " + team2.getName());
            }
        
        
    }

    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }

        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(Game_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Game_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Game_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Game_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Game_Window().setVisible(true);
            }
        });
    }

    private javax.swing.JButton addTime1;
    private javax.swing.JButton addTime2;
    private javax.swing.JLabel corDesc1;
    private javax.swing.JLabel corDesc2;
    private javax.swing.JComboBox corTime1;
    private javax.swing.JComboBox corTime2;
    private javax.swing.JButton deletar1;
    private javax.swing.JButton deletar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jogadoresDesc1;
    private javax.swing.JLabel jogadoresDesc2;
    private javax.swing.JToggleButton jogadoresPronto1;
    private javax.swing.JToggleButton jogadoresPronto2;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuInst;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JLabel nomeDesc1;
    private javax.swing.JLabel nomeDesc2;
    private javax.swing.JTextField nomeJog1;
    private javax.swing.JTextField nomeJog2;
    private javax.swing.JLabel nomeJogDesc1;
    private javax.swing.JLabel nomeJogDesc2;
    private javax.swing.JTextField nomeTime1;
    private javax.swing.JTextField nomeTime2;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JLabel resultDesc2;
    private javax.swing.JLabel resultsDesc1;
    private javax.swing.JTextArea resultsTime1;
    private javax.swing.JTextArea resultsTime2;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JTable tabelaJog1;
    private javax.swing.JTable tabelaJog2;
    private javax.swing.JLabel time1Desc;
    private javax.swing.JToggleButton time1Pronto;
    private javax.swing.JLabel time2Desc;
    private javax.swing.JToggleButton time2Pronto;
    private javax.swing.JTextField timeVencedor;
    private javax.swing.JLabel tipoJogDesc1;
    private javax.swing.JLabel tipoJogDesc2;
    private javax.swing.JLabel vencedorDesc;
}