/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TodoApp.views;

import TodoApp.controles.ProjectController;
import TodoApp.controles.TaksController;
import TodoApp.moldes.Project;
import TodoApp.moldes.Taks;
import TodoApp.util.ButtonCollumRender;
import TodoApp.util.DeadlineTablecolumncell;
import TodoApp.util.TaskTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author angel
 */
public class mainSrenn extends javax.swing.JFrame {

    //criando instancias para EXECUTAR A TAREFA
    ProjectController projectcontroller;
    TaksController takscontroller;
    //linha responsavel por mostra os componentes graficos (project,task,e todos componentes)
    //o metodo defaultlistmodel  esta vinculado com jlist e serve para mostra as lista
    DefaultListModel projectsModel;
    TaskTableModel taskModel;
    //metodo construtor
    public mainSrenn() {
    //inicializando os componentes   
        
        initComponents();
        initDataController();
       
        initComponetsModel();
        decorateTableTask();
    //decoração da table tasks. obs temos que mudar a ordem ou seja inicia primeiro os componentes depois carrega a decoração      
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jColorChooser1 = new javax.swing.JColorChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1Tasks = new javax.swing.JScrollPane();
        jTable1Tasks = new javax.swing.JTable();
        jLabel1Toonbar = new javax.swing.JPanel();
        jLabel1ToonbarTitle = new javax.swing.JLabel();
        jLabel2TonnbarSubtitle = new javax.swing.JLabel();
        jPanel7Projects = new javax.swing.JPanel();
        jLabel3ProjectsTitle = new javax.swing.JLabel();
        jLabel5Projectsadd = new javax.swing.JLabel();
        jPanel2Taks = new javax.swing.JPanel();
        jLabel4TaksTitle = new javax.swing.JLabel();
        jLabel6Taksadd = new javax.swing.JLabel();
        jPanel3ProjectList = new javax.swing.JPanel();
        jScrollPane1Projects = new javax.swing.JScrollPane();
        jList1Projects = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabel7EmptyListicon = new javax.swing.JLabel();
        jLabel8EmptyListTitle = new javax.swing.JLabel();
        jLabel9EmptyListSubtitle = new javax.swing.JLabel();

        jToolBar1.setForeground(new java.awt.Color(0, 204, 255));
        jToolBar1.setRollover(true);

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1Tasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1Tasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "prazo", "Tarefa concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1Tasks.setCellSelectionEnabled(true);
        jTable1Tasks.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1Tasks.setRequestFocusEnabled(false);
        jTable1Tasks.setRowHeight(50);
        jTable1Tasks.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jTable1Tasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1Tasks.setShowGrid(true);
        jTable1Tasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1TasksMouseClicked(evt);
            }
        });
        jScrollPane1Tasks.setViewportView(jTable1Tasks);
        jTable1Tasks.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1Toonbar.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1ToonbarTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1ToonbarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1ToonbarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1ToonbarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        jLabel1ToonbarTitle.setText(" TODO APP");

        jLabel2TonnbarSubtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2TonnbarSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2TonnbarSubtitle.setText("ANOTE TUDO É NÃO ESQUEÇA NADA");

        javax.swing.GroupLayout jLabel1ToonbarLayout = new javax.swing.GroupLayout(jLabel1Toonbar);
        jLabel1Toonbar.setLayout(jLabel1ToonbarLayout);
        jLabel1ToonbarLayout.setHorizontalGroup(
            jLabel1ToonbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabel1ToonbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1ToonbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLabel1ToonbarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2TonnbarSubtitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLabel1ToonbarLayout.setVerticalGroup(
            jLabel1ToonbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabel1ToonbarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1ToonbarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2TonnbarSubtitle)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel7Projects.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7Projects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3ProjectsTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3ProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3ProjectsTitle.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3ProjectsTitle.setText("Projetos");

        jLabel5Projectsadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabel5Projectsadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5ProjectsaddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7ProjectsLayout = new javax.swing.GroupLayout(jPanel7Projects);
        jPanel7Projects.setLayout(jPanel7ProjectsLayout);
        jPanel7ProjectsLayout.setHorizontalGroup(
            jPanel7ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3ProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5Projectsadd)
                .addContainerGap())
        );
        jPanel7ProjectsLayout.setVerticalGroup(
            jPanel7ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5Projectsadd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3ProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2Taks.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2Taks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4TaksTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4TaksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4TaksTitle.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4TaksTitle.setText("Tarefas");

        jLabel6Taksadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabel6Taksadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6TaksaddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2TaksLayout = new javax.swing.GroupLayout(jPanel2Taks);
        jPanel2Taks.setLayout(jPanel2TaksLayout);
        jPanel2TaksLayout.setHorizontalGroup(
            jPanel2TaksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2TaksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4TaksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6Taksadd)
                .addContainerGap())
        );
        jPanel2TaksLayout.setVerticalGroup(
            jPanel2TaksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6Taksadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2TaksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4TaksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3ProjectList.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3ProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1Projects.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jList1Projects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1Projects.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jList1Projects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1ProjectsMouseClicked(evt);
            }
        });
        jScrollPane1Projects.setViewportView(jList1Projects);

        javax.swing.GroupLayout jPanel3ProjectListLayout = new javax.swing.GroupLayout(jPanel3ProjectList);
        jPanel3ProjectList.setLayout(jPanel3ProjectListLayout);
        jPanel3ProjectListLayout.setHorizontalGroup(
            jPanel3ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3ProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1Projects)
                .addContainerGap())
        );
        jPanel3ProjectListLayout.setVerticalGroup(
            jPanel3ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3ProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1Projects)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmptyList.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7EmptyListicon.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jLabel7EmptyListicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7EmptyListicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        jLabel8EmptyListTitle.setBackground(new java.awt.Color(0, 204, 255));
        jLabel8EmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8EmptyListTitle.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8EmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8EmptyListTitle.setText("Nenhuma tarefa por aqui");

        jLabel9EmptyListSubtitle.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9EmptyListSubtitle.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9EmptyListSubtitle.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9EmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9EmptyListSubtitle.setText("Clique no botão \" + \" para adicionar uma tarefa");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8EmptyListTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9EmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7EmptyListicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmptyListLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel7EmptyListicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8EmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9EmptyListSubtitle)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jPanel4.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1Toonbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2Taks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1Toonbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2Taks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5ProjectsaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5ProjectsaddMouseClicked
        // TODO add your handling code here:
        //criação de tela de dialogo
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        projectDialogScreen.addWindowListener(new WindowAdapter() {
            //colocando um ouvinte, objeto avisar quanda a janela for fechada
            public void windowClosed(WindowEvent e){
               
                loadProjecs();
            }
        });
        
    }//GEN-LAST:event_jLabel5ProjectsaddMouseClicked

    private void jLabel6TaksaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6TaksaddMouseClicked
        // criamos uma nova tela taks e mostramos para o usuario
        TaksDialogScrenn taksDialogScrenn = new TaksDialogScrenn(this, rootPaneCheckingEnabled);
        //passamos a qual projeto a tarefa pertence
        //linha responsavel por mostrar o index selecionado
        int projectIndex = jList1Projects.getSelectedIndex();
        Project project = (Project)projectsModel.get(projectIndex);
        taksDialogScrenn.setProject(project);
        //taksDialogScrenn.setProject(null);
        taksDialogScrenn.setVisible(true);
        
        taksDialogScrenn.addWindowStateListener(new WindowAdapter (){
        //quando a tela de cadrato for fechado mostrara a lista de projetos
            public void windowsClosed(WindowEvent e){
                int projectIndex = jList1Projects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTaks(project.getId());
                
            }
        });
        
    }//GEN-LAST:event_jLabel6TaksaddMouseClicked

    private void jTable1TasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1TasksMouseClicked

        //salvando a informação de check (tarefa concluida) no banco de dados este trecho de codigo e responsavel por indicar que a tarefa foi concluida ou não
        int rowIndex = jTable1Tasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTable1Tasks.columnAtPoint(evt.getPoint());
        Taks task = taskModel.getTakss().get(rowIndex);
        
        switch(columnIndex){
          
            case 3:
                
               takscontroller.update(task);
                break;
            case 4:
                //linha de coddigo responsavel por editar a tarefas                

               
               break;
            case 5: 
                //linha de codigo responsavel por excluir tarefas do projeto
                takscontroller.removeByid(task.getId());
                taskModel.getTakss().remove(task);
                // linha responsavel pela atualização da tarefas
                int projectIndex = jList1Projects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTaks(project.getId());
                break;
                
                
            
            
        }
    }//GEN-LAST:event_jTable1TasksMouseClicked

    private void jList1ProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1ProjectsMouseClicked
        // carregando a lista de tarefas do project selecionado
        
        //retorna o index do projeto clicado
        int projectIndex = jList1Projects.getSelectedIndex();
        //dentro do projectModel estão os trabalho para serem recarregados 
        Project project = (Project)projectsModel.get(projectIndex);
        loadTaks(project.getId());
    }//GEN-LAST:event_jList1ProjectsMouseClicked

    
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
                if ("java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainSrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainSrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainSrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainSrenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new mainSrenn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jLabel1Toonbar;
    private javax.swing.JLabel jLabel1ToonbarTitle;
    private javax.swing.JLabel jLabel2TonnbarSubtitle;
    private javax.swing.JLabel jLabel3ProjectsTitle;
    private javax.swing.JLabel jLabel4TaksTitle;
    private javax.swing.JLabel jLabel5Projectsadd;
    private javax.swing.JLabel jLabel6Taksadd;
    private javax.swing.JLabel jLabel7EmptyListicon;
    private javax.swing.JLabel jLabel8EmptyListTitle;
    private javax.swing.JLabel jLabel9EmptyListSubtitle;
    private javax.swing.JList<String> jList1Projects;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2Taks;
    private javax.swing.JPanel jPanel3ProjectList;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7Projects;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JScrollPane jScrollPane1Projects;
    private javax.swing.JScrollPane jScrollPane1Tasks;
    private javax.swing.JTable jTable1Tasks;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    public void decorateTableTask(){
        //customizando o header na table da tarefa
        jTable1Tasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,14));
        jTable1Tasks.getTableHeader().setBackground(new Color(52,153,255));
        jTable1Tasks.getTableHeader().setForeground(new Color(255, 255, 255));
        
        // criando um sort automatico para as colunas na table
        jTable1Tasks.setAutoCreateRowSorter(false);
        //linha responsavel por mudar a cor da celula da data de concluido. obs mudar a ordem colocar o decorate por ultimo 
        jTable1Tasks.getColumnModel().getColumn(2)
                .setCellRenderer(new DeadlineTablecolumncell());
        //linha responsavel por adicionar as funcionabilidades do botão 
       jTable1Tasks.getColumnModel().getColumn(4)
               .setCellRenderer(new ButtonCollumRender("edit"));
       jTable1Tasks.getColumnModel().getColumn(5)
                .setCellRenderer(new ButtonCollumRender("delete"));
        
    }
    
    public void initDataController(){
        projectcontroller = new ProjectController();
        takscontroller = new TaksController();
    }
    //carregando os projetos
    public void initComponetsModel(){
        projectsModel = new DefaultListModel();
        loadProjecs();
        
        taskModel = new TaskTableModel();
        jTable1Tasks.setModel(taskModel);
       
        //esta linha do codigo e responsavel por mostra forçadamente o primeiro item da lista de projetos , apos isso carregar as tarefas do projeto
        if(!projectsModel.isEmpty());{
        jList1Projects.setSelectedIndex(0);
        Project project = (Project) projectsModel.get(0);
        loadTaks(project.getId());
    }
        
    }
    
    //carregando tarefas do banco de dados
    public void loadTaks(int idProject){
        List<Taks> taks = takscontroller.getAll(idProject);
        taskModel.setTakss(taks);
        
       //responsavel por mostra se não tem tarefas, caso tenha mostra as tarefas caso não mostra a imagem para adicionar
        showTableTaks(! taks.isEmpty());
    }
    
    //metodo responsavel por mostrar a lista de tarefas do projeto
    private void showTableTaks(boolean hasTaks){
        //se exitem tarefas faça
        
        if(hasTaks) {
            
            if(jPanelEmptyList.isVisible()){  //a msg de lista vazia esta visivel 
                jPanelEmptyList.setVisible(false);   //se estiver, esconde a lista
                jPanel4.remove(jPanelEmptyList); //remove a lista escondida (remova )
            }
            
            jPanel4.add(jScrollPane1Tasks);  //adicionando scrool panel ao jpanel 7
            jScrollPane1Tasks.setVisible(true); //(mostrando tarefas e)
            jScrollPane1Tasks.setSize(jPanel4.getWidth(), jPanel4.getHeight());//ajustando na tela
            
        } else {
            if (jScrollPane1Tasks.isVisible()) { //a lista não esta vazia
                jScrollPane1Tasks.setVisible(false);//se estiver, mostre a lista
                jPanel4.remove(jScrollPane1Tasks); //
            }
            
            jPanel4.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanel4.getWidth(), jPanel4.getHeight());
        }
    }
    
    //linha responsavel pelo carregamento as informaçoões e carrega no projectmodel
    public void loadProjecs(){
        //carregando os projetos
        List<Project> projects = projectcontroller.getall();
        //linha responsavel por limpar a lista caso haja algum dados seja removido
        projectsModel.clear();
        
        for (int i = 0; i < projects.size(); i++){
            Project project = projects.get(i);
            projectsModel.addElement(project);
        }
        //mostrando as informações na jlist
        jList1Projects.setModel(projectsModel);
    }

  

    

}

