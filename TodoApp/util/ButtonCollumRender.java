/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoApp.util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author angel
 */
//linha de codigo defaulttablecellrenderer ou seja, funçoes do referencia padrao
public class ButtonCollumRender extends DefaultTableCellRenderer{
    
    private String buttontype;
//metodo construtor
    public ButtonCollumRender(String buttonType){
        this.buttontype = buttonType;
    }
    
    public String getButtontype() {
        return buttontype;
    }
            
            
    public void setButtontype(String buttontype) {
        this.buttontype = buttontype;
    }
    @Override
//linha de codigo responsavel por customização da tela de tarefas Jlabel, linha responsavel pelas funções dop botão
      public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {
//linha responsavel pela customização do  botão 
        JLabel label = (JLabel) super.getTableCellRendererComponent(table,
                value, isSelected, hasFocus, row, col);
        
        label.setHorizontalAlignment(JLabel.CENTER);
        
 //linha responsavel por adicionar o icone do botão
        label.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/" + buttontype + ".png")));

        
        return label;
        
     

      }
    
    
   
    
}
