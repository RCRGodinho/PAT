/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gestão.de.stock.pkgfinal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PAT
 */
public class Consumivel extends javax.swing.JInternalFrame {

    //Inicializar os contrutores
    Conexao c = new Conexao();
    
    public Consumivel() throws Exception {
        initComponents();
        setPainelFixo();
        tabelaConsumivel();
        comboOracle();
    }
    
    private void setPainelFixo(){
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();  
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        busca = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboBusca = new javax.swing.JComboBox<>();
        buscatxt = new javax.swing.JTextField();
        dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nna = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        umc = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        referencia = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        comboImpressora = new javax.swing.JComboBox<>();
        butoes = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 236, 244));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1070, 610));

        tabela.setBackground(getBackground());
        tabela.setForeground(new java.awt.Color(0, 0, 0));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NNA", "NOME", "UMC", "PRECO", "REFERENCIA", "IMPRESSORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela.setRowHeight(25);
        tabela.setRowMargin(5);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setShowGrid(true);
        tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaFocusLost(evt);
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        busca.setPreferredSize(new java.awt.Dimension(0, 50));

        jLabel7.setText("Pesquisar por:");

        comboBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buscatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscatxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout buscaLayout = new javax.swing.GroupLayout(busca);
        busca.setLayout(buscaLayout);
        buscaLayout.setHorizontalGroup(
            buscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buscaLayout.setVerticalGroup(
            buscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7))
            .addComponent(comboBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(buscatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setLabelFor(nna);
        jLabel1.setText("NNA");

        nna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nnaKeyTyped(evt);
            }
        });

        jLabel2.setText("NOME");

        jLabel3.setText("UMC");

        umc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                umcKeyTyped(evt);
            }
        });

        jLabel4.setText("PREÇO");

        jLabel5.setText("REFERENCIA");

        referencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                referenciaKeyTyped(evt);
            }
        });

        jLabel6.setText("IMPRESSORA");

        comboImpressora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nna))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preco))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboImpressora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(umc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(referencia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(umc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout butoesLayout = new javax.swing.GroupLayout(butoes);
        butoes.setLayout(butoesLayout);
        butoesLayout.setHorizontalGroup(
            butoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(butoesLayout.createSequentialGroup()
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        butoesLayout.setVerticalGroup(
            butoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butoesLayout.createSequentialGroup()
                .addGroup(butoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabelaConsumivel() throws Exception{
        
         try{
             //definir a tabela
             DefaultTableModel table = (DefaultTableModel) tabela.getModel();
             table.setRowCount(0);
         
             //criar uma query e executar
         Statement stm = c.fazerConexao().createStatement();
         ResultSet rs = stm.executeQuery("SELECT ID_CONSUMIVEL, NNA, NOME, UMC, PRECO, REFERENCIA, (MARCA || '_' || MODELO) AS IMPRESSORA FROM CONSUMIVEL a, IMPRESSORA b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA");
             
           while(rs.next())
           {
               //passar os dados da BD para um object
               Object o[] = {rs.getInt("ID_CONSUMIVEL"),rs.getString("NNA"), rs.getString("NOME"),
               rs.getString("UMC"), rs.getDouble("PRECO"), rs.getString("REFERENCIA"), rs.getString("IMPRESSORA")};
               //Adicionar os dados à tabela
               table.addRow(o);
       }
         }
       catch(Exception exp)
       {
           throw new Exception (exp.getMessage());
       }

     }
    
    
    public void limparCampos(){
        
        nna.setText("");
        nome.setText("");
        umc.setText("");
        preco.setText("");
        referencia.setText("");
    }
    
    void buscarDados(){
        
        if(tabela.getSelectedRow() == -1)
         {
           JOptionPane.showMessageDialog(rootPane, "Selecione um dado para editar!");
         }else{
            int row = tabela.getSelectedRow();
            
            nna.setText(tabela.getModel().getValueAt(row, 1).toString());
            nome.setText(tabela.getModel().getValueAt(row, 2).toString());
            umc.setText(tabela.getModel().getValueAt(row, 3).toString());
            preco.setText(tabela.getModel().getValueAt(row, 4).toString());
            referencia.setText(tabela.getModel().getValueAt(row, 5).toString());
            comboImpressora.setSelectedItem(tabela.getValueAt(row, 6).toString());
        }
    }
    
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
        
        if(nna.getText().isEmpty() || nome.getText().isEmpty() || umc.getText().isEmpty() || preco.getText().isEmpty() || referencia.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        }else{
            //Verificar se todos têm o mesmo tamanho.
            if(nna.getText().length()<13 || umc.getText().length()<8 || referencia.getText().length()<8){
             JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente");
            }
            else{
        
        int row = tabela.getSelectedRow();
               String value = tabela.getModel().getValueAt(row, 0).toString();
        
        try{
            Statement stm = c.fazerConexao().createStatement();
             stm = c.fazerConexao().createStatement();
             
             
        stm.executeUpdate("UPDATE Consumivel SET NNA = '"+nna.getText().toUpperCase()+"' ,NOME = '"+nome.getText().toUpperCase()+"' , UMC = "+Integer.parseInt(umc.getText())+" , PRECO = "+Float.parseFloat(preco.getText())+" , REFERENCIA = "+Integer.parseInt(referencia.getText())+" , ID_IMPRESSORA ="+comboSplit()+" WHERE ID_CONSUMIVEL = "+Integer.parseInt(value)+"");
             
             
             JOptionPane.showMessageDialog(rootPane, "Dado editado com sucesso!");
                
             tabela.clearSelection();
             limparCampos();
             tabelaConsumivel();
        } catch (ClassNotFoundException| SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!");
            
        } catch (Exception ex) {
            Logger.getLogger(Consumivel.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }
        }
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked
        // TODO add your handling code here:
        
        //verificar se o user selecionou algum dado
        if(tabela.getSelectedRow() == -1)
         {
           //   JOptionPane.showMessageDialog(rootPane, "Selecione um dado para apagar!");
         }else{
            //buscar o valor do ID no dado selecionado 
            
            int row = tabela.getSelectedRow();
               String value = tabela.getModel().getValueAt(row, 0).toString();
                
             Statement stm;
             try {
                 stm = c.fazerConexao().createStatement();
                int op = JOptionPane.showConfirmDialog(rootPane, "Tem a certeza?");
                 if(op == 0)
                 {
                     ResultSet rs = stm.executeQuery("DELETE FROM Consumivel WHERE ID_CONSUMIVEL = "+Integer.parseInt(value));
                     JOptionPane.showMessageDialog(rootPane, "Dado apagado com sucesso!");
                     tabelaConsumivel();
                     tabela.clearSelection();
                     limparCampos();
                 }
                 
             } catch (SQLException | ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(rootPane, "ERRO!");
             } catch (Exception ex) {
                Logger.getLogger(Consumivel.class.getName()).log(Level.SEVERE, null, ex);
            }
             
         }

    }//GEN-LAST:event_btnApagarMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        buscarDados();
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void nnaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nnaKeyTyped
        // TODO add your handling code here:
        if(nna.getText().length()>=13)
    {
        //nna.setText(nna.getText().substring(0, 13));
    }
    }//GEN-LAST:event_nnaKeyTyped

     
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        
        //Verificar se os campos estão vazios.
        if(nna.getText().isEmpty() || nome.getText().isEmpty() || umc.getText().isEmpty() || preco.getText().isEmpty() || referencia.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        }else{
            //Verificar se todos têm o mesmo tamanho.
            if(nna.getText().length()<12 || umc.getText().length()<7 || referencia.getText().length()<7){
             JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente");
            }
            else{
            
        
        try {
            Statement stm = c.fazerConexao().createStatement();
             
             stm.executeUpdate("INSERT INTO Consumivel(NNA,NOME,UMC,Preco,Referencia,ID_Impressora) VALUES('"+nna.getText().toUpperCase()+"' , '"+nome.getText().toUpperCase()+"' , "+Integer.parseInt(umc.getText())+" , "+Float.parseFloat(preco.getText())+" , "+Integer.parseInt(referencia.getText())+" , "+comboSplit()+")");
             
             
             JOptionPane.showMessageDialog(rootPane, "Dado inserido com sucesso!");
    
                    limparCampos();
                    tabelaConsumivel();
             
        } catch (SQLException | ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO!");
        }
        }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tabelaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusLost
        // TODO add your handling code here:
        //tabela.getSelectionModel().clearSelection();
        btnAdicionar.setEnabled(true);
        
    }//GEN-LAST:event_tabelaFocusLost

    private void buscatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscatxtKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buscatxtKeyReleased

    private void umcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_umcKeyTyped
        // TODO add your handling code here:
        if(umc.getText().length()>=8)
    {
       // umc.setText(umc.getText().substring(0, 8));
    }
    }//GEN-LAST:event_umcKeyTyped

    private void referenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_referenciaKeyTyped
        // TODO add your handling code here:
        if(referencia.getText().length()>=8)
    {
        //referencia.setText(referencia.getText().substring(0, 8));
    }
    }//GEN-LAST:event_referenciaKeyTyped

    public ArrayList listaImpressora() throws Exception{
        ArrayList list = new ArrayList<>();
        
        try{
            Statement stm = c.fazerConexao().createStatement();
            
            ResultSet rs = stm.executeQuery("SELECT (MARCA || '_' || MODELO) AS IMPRESSORA FROM IMPRESSORA");

            while(rs.next())
            {
                list.add(rs.getString("IMPRESSORA"));
            }
            
            
        }catch(ClassNotFoundException | SQLException exp){
            throw new Exception (exp.getMessage());
        }
        
        return list;
    }
    
    private void comboOracle() throws SQLException, ClassNotFoundException, Exception{
        
        comboImpressora.removeAllItems();
        Iterable<String> lista = listaImpressora();
        
        for(String impressora : lista)
        {
            comboImpressora.addItem(impressora);
        }
    }
    
    private int comboSplit(){
        
        String[] result =comboImpressora.getSelectedItem().toString().split("_");
            String marca = result[0];
            String modelo = result[1];
        
        try{
            Statement stm = c.fazerConexao().createStatement();
             ResultSet rs;
             int id = 0;
             rs = stm.executeQuery("SELECT ID_Impressora FROM IMPRESSORA WHERE IMPRESSORA.MARCA = '"+marca+"' AND IMPRESSORA.Modelo = '"+modelo+"'");
             while(rs.next())
             {
                id = rs.getInt(1);
             }
             return id;
             
        }catch(Exception exp){
            return 0;
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel busca;
    private javax.swing.JTextField buscatxt;
    private javax.swing.JPanel butoes;
    private javax.swing.JComboBox<String> comboBusca;
    private javax.swing.JComboBox<String> comboImpressora;
    private javax.swing.JPanel dados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nna;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField referencia;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField umc;
    // End of variables declaration//GEN-END:variables
}
