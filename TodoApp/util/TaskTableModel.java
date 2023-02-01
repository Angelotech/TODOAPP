/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoApp.util;

import TodoApp.moldes.Taks;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author angel
 */

//A classe TasktableModel é a classe responsavel por mostrar quais dados devem ser exibidos pelo jTable
public class TaskTableModel extends AbstractTableModel{
    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa concluída", "Editar", "Excluir"};
    List<Taks> takss = new ArrayList();

    @Override
    //informa quantas linhas a tarefa tem
    public int getRowCount() {
        return takss.size();
    }

    @Override
    //informa a quantidade de colunas
    public int getColumnCount() {
        return columns.length;
    }
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];  
    }
    //habilitando a edição da tela do pj, (marcaçao do pj ) e bloquenado as outras
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex == 3;
    }
    //retorna a informação domdados da coluna
   
    @Override
    //metodo que mostra a marcação na coluna
    public Class<?> getColumnClass(int columnIndex){
        if(takss.isEmpty()){
            return Object.class;
        }
        
        return this.getValueAt(0, columnIndex).getClass();
    }
    

    @Override
    //informa o valor que tem cada linha e coluna
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return takss.get(rowIndex).getName();
               
            case 1:
                return takss.get(rowIndex).getDescription();
            case 2:
                //alteração para data brasileira
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(takss.get(rowIndex).getDeadline());
            case 3:
                return takss.get(rowIndex).getCpmpletada();
            case 4:
                
                return "";
            case 5:
                return "";
            default:
                return "dados não encontrados";
                
        }
        
    }
    @Override
    //recebendo o valor setado da tabela ( marcado)
    //conversão de valores (recebendo um objeto) da interface grafica
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // quest retornando de objeto para boolean
        takss.get(rowIndex).setCpmpletada((boolean) aValue);
    }
   
    public String[] getColumns() {
        return columns;
    }

    public List<Taks> getTakss() {
        return takss;
    }

    public void setTakss(List<Taks> takss) {
        this.takss = takss;
    }
    
    
    
    
    
}
