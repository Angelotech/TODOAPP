/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoApp.util;

import TodoApp.moldes.Taks;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


    //linha de codigo defaulttablecellrenderer ou seja, funçoes do referencia padrao usado para customizar a render
public class DeadlineTablecolumncell extends DefaultTableCellRenderer{
    @Override
      //linha de codigo responsavel por customização da tela de tarefas Jlabel, utilizando o metodo getTable
      public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {
        //linha responsavel por centralizar o texto da jlabel 
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table,
                value, isSelected, hasFocus, row, col);
        // linha responsavel por centralizar o texto da jlabel 
        label.setHorizontalAlignment(CENTER);
        label.setForeground(Color.WHITE);
 
        TaskTableModel taksModel = (TaskTableModel) table.getModel();
        Taks taks = taksModel.getTakss().get(row);
      
    //linha responsavel por mostra se tarefa passou do prazo ou não, o taks deadiline mostra a tarefa dessa linha. o after(new Date) mostra se a tarefa estar no prazo ou não   
        if (taks.getDeadline().equals(new Date())) {
            label.setBackground(Color.YELLOW);
            
       } else {
            if (taks.getDeadline().after(new Date())){
                label.setBackground(Color.BLUE);
            }else    
                label.setBackground(Color.RED);
            }
        
        return label;
       
        }
   
}

//obs: o JAVA POR SE SÓ VEM COM RENDERIZADOR PADRÃO PARA CADA CELULA, POREM QUANDO QUEREMOS FAZER UMA CUSTOMIZAÇÂO ESPECIFICA, APROVEITANDO O RENDERIZADOR PADRÃO