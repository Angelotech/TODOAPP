/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package TodoApp.views;

import TodoApp.controles.ProjectController;
import TodoApp.moldes.Project;
import java.awt.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class ProjectDialogScreen extends javax.swing.JDialog {
    // variavel para acessar as informações do projeto inclusive para realizar update, salve
    ProjectController controller;

    /**
     * Criação de uma variavel, para fazer o controle 
     */
    public ProjectDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //inicialição dos componenentes
        initComponents();
        controller = new ProjectController();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToonBar = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelToonBarsave = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabel3Name = new javax.swing.JLabel();
        jLabel4Description = new javax.swing.JLabel();
        jScrollPane1Description = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelToonBar.setBackground(new java.awt.Color(51, 153, 255));

        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTitleMouseSaveClicked(evt);
            }
        });

        jLabelToonBarsave.setBackground(new java.awt.Color(255, 255, 255));
        jLabelToonBarsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToonBarsave.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToonBarsave.setText("Projetos");

        javax.swing.GroupLayout jPanelToonBarLayout = new javax.swing.GroupLayout(jPanelToonBar);
        jPanelToonBar.setLayout(jPanelToonBarLayout);
        jPanelToonBarLayout.setHorizontalGroup(
            jPanelToonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToonBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToonBarsave, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanelToonBarLayout.setVerticalGroup(
            jPanelToonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToonBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToonBarsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3Name.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel3Name.setText("Nome");

        jLabel4Description.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel4Description.setText("Descrição");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1Description.setViewportView(jTextArea1);

        jTextField2Name.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2Name)
                    .addComponent(jLabel3Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4Description, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1Description, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3Name)
                .addGap(12, 12, 12)
                .addComponent(jTextField2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4Description, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1Description, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToonBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToonBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTitleMouseSaveClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTitleMouseSaveClicked
       //usando try catch para tratamento de erros, caso ocorra mostrara para o usuario a msg de erro
        try {
            
//validação da informações. objetivo ( mostra a msg caso o campo necessarios de prenchimento não tenham cido preenchidos )
             if (!jTextField2Name.getText().equals("")) {
 // salvando informações setando as informações para salva no banco de dados
//uma criação de um projeto e o controller para salva
            Project project = new Project ();
//pegando o texto que esta dentro do componente
            project.setName(jTextField2Name.getText());
            project.setDescription(jTextArea1.getText());
            controller.save(project);
            JOptionPane.showMessageDialog(jPanelToonBar,"o projeto salvo com sucesso");  
// função para mostrar a mensagem
            this.dispose();
//função para clicar e fecha o projeto
            } else {
                JOptionPane.showMessageDialog(jPanelToonBar,"o projeto não foi salvo, pois o campo nome não foi preenchido ");
            }
        
        //função para clicar e fecha o projeto
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_jLabelTitleMouseSaveClicked

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
                //mudança de templates de nimbus para java swing
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProjectDialogScreen dialog = new ProjectDialogScreen(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel3Name;
    private javax.swing.JLabel jLabel4Description;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelToonBarsave;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelToonBar;
    private javax.swing.JScrollPane jScrollPane1Description;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2Name;
    // End of variables declaration//GEN-END:variables
}
