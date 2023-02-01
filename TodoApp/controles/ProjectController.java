/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoApp.controles;
import TodoApp.moldes.Project;
import TodoApp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//trouxemos a informaçao , e populamos o banco de dados com as tarefas

/**
 *
 * @author angel
 */
public class ProjectController {

    
    public void save (Project project){
        String sql = "INSERT INTO project ( name, "
            + "description, "
            + "creadAT, " 
            + "updateAT)"
            + "VALUES(?, ?, ?, ?)";
        //sempre que estiver que incluir um valor num sql inclua uma interrogação
        Connection connection = null;
         //estabelecendo a conexão com o banco de dados
        PreparedStatement statement = null;
        //preparando a query
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreadAT().getTime()));
            statement.setDate(4, new Date(project.getUpdateAT().getTime()));
            statement.execute();
            //Setando os valores do statement
            
         
        } catch (SQLException ex) {
            throw new RuntimeException("erro ao salvar o projeto "+  ex.getMessage(),  ex);

        }
        finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(Project project){
        
        String sql = "UPDATE project SET name = ?,"+ "description = ?,"+ "creadAT = ?,"+ "updateAT = ? WHERE id=?";
        
        
        Connection connection = null;
         //estabelecendo a conexão com o banco de dados
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreadAT().getTime()));
            statement.setDate(4, new Date(project.getUpdateAT().getTime()));
            statement.setInt(5, project.getId());
            //Setando os valores do statement

            statement.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("erro ao atualizar o projeto ", ex);     
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
        
    public List<Project> getall(){
        String sql = "SELECT * FROM project";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Project> projectt = new ArrayList<>();
           
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while (resultSet.next ()){   
                Project project = new Project();
                
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreadAT(resultSet.getDate("creadAT"));
                project.setUpdateAT(resultSet.getDate("updateAT"));
                projectt.add(project);
                
                
            }
            
        } catch (SQLException ex){
            throw new RuntimeException("erro ao buscar a tarefa", ex);  
        }finally{
            ConnectionFactory.closeConnection(connection,statement, resultSet);
        }
        return projectt;  
    }
    
    public void removeById(int idProject){
        String sql = " DELETE FROM project WHERE id = ? ";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("erro ao deletar o projeto", ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }    
}
        
    
    

