/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoApp.controles;

import TodoApp.moldes.Taks;
import TodoApp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//trouxemos a informaçao , e populamos o banco de dados com as tarefas


public class TaksController {
    public void save (Taks taks){
        String sql = "INSERT INTO taks ( idproject, "
            + "name, "
            + "description, "
            + "cpmpletada, " 
            + "nodes, "
            + "deadline, "
            + "creadAT, "
            + "updateAT) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        //fazendo conexão
        Connection connection = null;
        //preparando a statemente
        PreparedStatement statement = null;
        
        //um bloco try, catch caso a operção apresenter erros
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, taks.getIdproject());
            statement.setString(2, taks.getName());
            statement.setString(3, taks.getDescription());
            statement.setBoolean(4, taks.getCpmpletada());
            statement.setString(5, taks.getNodes());
            statement.setDate(6, new Date(taks.getDeadline().getTime()));
            statement.setDate(7, new Date(taks.getCreadAT().getTime()));
            statement.setDate(8, new Date(taks.getUpdateAT().getTime()));
            //executando a query, quando a linha abaixo for executada iremos inserir as informações na tarefa
            statement.execute();  
        } catch (SQLException ex) {
            throw new RuntimeException("erro de conexão" + ex.getMessage(), ex);
        //fechando a conexão
            
        }finally{ 
            ConnectionFactory.closeConnection(connection, statement);
        }
        
      
    }
    // OBS: a falta de uso de virgulas para separar itens apos ( ? ) gera erro de sintaxe no banco de dados
    public void update(Taks taks){
        String sql = "UPDATE taks SET "
                +"idproject = ?,"
                +"name = ?,"
                +"description = ?," 
                +"cpmpletada = ?," 
                +"nodes = ?," 
                +"deadline = ?," 
                +"creadAT = ?," 
                +"updateAT= ?" 
                +"WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //preparando a query
            statement = connection.prepareStatement(sql);
           
            statement.setInt(1, taks.getIdproject());
            statement.setString(2, taks.getName());
            statement.setString(3, taks.getDescription());
            statement.setBoolean(4, taks.getCpmpletada());
            statement.setString(5, taks.getNodes());
            statement.setDate(6, new Date(taks.getDeadline().getTime()));
            statement.setDate(7, new Date(taks.getCreadAT().getTime()));
            statement.setDate(8, new Date(taks.getUpdateAT().getTime()));
            statement.setInt(9, taks.getId());
             //executando a query, quando a linha abaixo for executada iremos inserir as informações na tarefa
            statement.execute();
            
        } catch (Exception ex) {
           throw new RuntimeException("erro ao atualizar a tarefa " + ex.getMessage(), ex);    
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        
        
    }
    public void removeByid(int taksId){
        
        String sql = "DELETE FROM taks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //criando conexão com banco de dados
            connection = ConnectionFactory.getConnection();
            
            //preparando a query
            statement = connection.prepareStatement(sql);
            
            //setando os valores
            statement.setInt(1, taksId);
            //executando a query
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("erro ao deletar a tarefa tarefa");
            
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public List<Taks> getAll(int idproject){
        String sql = "SELECT * FROM taks WHERE idproject = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        //lista de tarefas que sera devolvida quando a chamada do metodo acontecer
        List <Taks> takss = new ArrayList<Taks>();
        
        try {
            //criando conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            //setando o valor que corresponde ao filtro de buscar 
            statement.setInt(1, idproject);
            
            resultSet = statement.executeQuery();
            //valor retornado da query
            
           
            while(resultSet.next()){
                Taks taks = new Taks();
                taks.setId(resultSet.getInt("id"));
                taks.setIdproject(resultSet.getInt("idproject"));
                taks.setName(resultSet.getString("name"));
                taks.setDescription(resultSet.getString("description"));
                taks.setCpmpletada(resultSet.getBoolean("cpmpletada"));
                taks.setNodes(resultSet.getString("id"));
                taks.setDeadline(resultSet.getDate("deadline"));
                taks.setCreadAT(resultSet.getDate("creadAT"));
                taks.setUpdateAt(resultSet.getDate("updateAT"));
             ////enquanto houverem valores a serem percorridos no meu resultset
                takss.add(taks);  
            }
                  
        } catch (Exception ex) {
           throw new RuntimeException("erro ao inseri a tarefa" + ex.getMessage(), ex);  
        }finally{
            ConnectionFactory.closeConnection(connection,statement, resultSet);
        }
        //lista de tarefas que foi criada e carregada no banco de dados
        return takss;
    }

   
}
