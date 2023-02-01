/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package TodoApp.views;

import TodoApp.controles.TaksController;
import TodoApp.moldes.Project;
import TodoApp.moldes.Taks;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class TaksDialogScrenn extends javax.swing.JDialog {
    // variavel para acessar as informações do projeto inclusive para realizar update, salve
    TaksController controller;
    Project project;

    public TaksDialogScrenn(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        //inicialização dos componentes 
        initComponents();
        controller = new TaksController();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Toonbar = new javax.swing.JPanel();
        jLabel1ToonbarTitle = new javax.swing.JLabel();
        jLabel2ToonbarSave = new javax.swing.JLabel();
        jPanel2Toonbartarefas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Descrição = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1Prazo = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2Notas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1Toonbar.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1ToonbarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1ToonbarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1ToonbarTitle.setText("Tarefas");

        jLabel2ToonbarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabel2ToonbarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2ToonbarSaveMouseSaveClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1ToonbarLayout = new javax.swing.GroupLayout(jPanel1Toonbar);
        jPanel1Toonbar.setLayout(jPanel1ToonbarLayout);
        jPanel1ToonbarLayout.setHorizontalGroup(
            jPanel1ToonbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1ToonbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1ToonbarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2ToonbarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1ToonbarLayout.setVerticalGroup(
            jPanel1ToonbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ToonbarLayout.createSequentialGroup()
                .addGroup(jPanel1ToonbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1ToonbarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2ToonbarSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1ToonbarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1ToonbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Toonbartarefas.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2Toonbartarefas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        jTextField1Nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Descrição");

        jTextArea1Descrição.setColumns(20);
        jTextArea1Descrição.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Descrição);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Prazo");

        jFormattedTextField1Prazo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextField1Prazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1Prazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1PrazoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("Notas");

        jTextArea2Notas.setColumns(20);
        jTextArea2Notas.setRows(5);
        jScrollPane2.setViewportView(jTextArea2Notas);

        javax.swing.GroupLayout jPanel2ToonbartarefasLayout = new javax.swing.GroupLayout(jPanel2Toonbartarefas);
        jPanel2Toonbartarefas.setLayout(jPanel2ToonbartarefasLayout);
        jPanel2ToonbartarefasLayout.setHorizontalGroup(
            jPanel2ToonbartarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2ToonbartarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2ToonbartarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1Prazo)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1Nome)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2ToonbartarefasLayout.setVerticalGroup(
            jPanel2ToonbartarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2ToonbartarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1Prazo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1Toonbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2Toonbartarefas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1Toonbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2Toonbartarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2ToonbarSaveMouseSaveClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2ToonbarSaveMouseSaveClicked
        //para colocar o nome salve temos que editar o codigo em propriedades
        //usando try catch para tratamento de erros, caso ocorra mostrara para o usuario a msg de erro
        try {
            if (!jTextField1Nome.getText().isEmpty() && !jFormattedTextField1Prazo.getText().isEmpty()) {
// salvando informações setando as informações para salva no banco de dados
//uma criação de um projeto e o controller para salva
            Taks taks = new Taks();
//taks.setIdproject(project.getId());
            taks.setIdproject(project.getId());
            
//pegando o texto que esta dentro do componente
            taks.setName(jTextField1Nome.getText());
            taks.setDescription(jTextArea1Descrição.getText());
            taks.setCpmpletada(false);
            taks.setNodes(jTextArea2Notas.getText());
            
//transformando string para data, dentro dos parentes o formato da data que desejar
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline = null;
            deadline = dateFormat.parse(jFormattedTextField1Prazo.getText());
            taks.setDeadline(deadline);
            controller.save(taks);
            
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso");
              this.dispose();   
            } else {
             JOptionPane.showMessageDialog(rootPane, "A Tarefa não foi salva, pois exitem campos a serem preenchidos");

            }
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage ());
        }
        
    }//GEN-LAST:event_jLabel2ToonbarSaveMouseSaveClicked

    private void jTextField1NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NomeActionPerformed

    private void jFormattedTextField1PrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1PrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1PrazoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaksDialogScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaksDialogScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaksDialogScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaksDialogScrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaksDialogScrenn dialog = new TaksDialogScrenn(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1Prazo;
    private javax.swing.JLabel jLabel1ToonbarTitle;
    private javax.swing.JLabel jLabel2ToonbarSave;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1Toonbar;
    private javax.swing.JPanel jPanel2Toonbartarefas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1Descrição;
    private javax.swing.JTextArea jTextArea2Notas;
    private javax.swing.JTextField jTextField1Nome;
    // End of variables declaration//GEN-END:variables
    //como esse metodo imforma a tarefa que o projeto pertence
    public void setProject(Project project) {
        this.project = project;
    }
     


}

