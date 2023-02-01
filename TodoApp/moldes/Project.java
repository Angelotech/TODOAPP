/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoApp.moldes;
import java.util.Date;

/**
 *
 * @author angel
 */
//ATRIBUTOS DO BANCO DE DADOS
public class Project {
    private int id;
    private String name;
    private String description;
    private Date creadAT;
    private Date updateAT;

    public Project(int id, String name, String Description, Date creadAT, Date UpdateAT) {
        
        this.id = id;
        this.name = name;
        this.description = Description;
        this.creadAT= creadAT;
        this.updateAT = UpdateAT;
    }
    //METODO CONSTRUTOR PARA RECEBER A HORA E A DATA
    public Project(){
        this.creadAT = new Date();
        this.updateAT = new Date();
        
    }
    public int getId(){
        return id;
        
    }
    public void setId(int id){
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public Date getCreadAT() {
        return creadAT;
    }

    public void setCreadAT(Date creadAT) {
        this.creadAT = creadAT;
    }

    public Date getUpdateAT() {
        return updateAT;
    }

    public void setUpdateAT(Date updateAT) {
        this.updateAT = updateAT;
    }
    //metodo TO STRING retorna como string
    @Override
    public String toString() {
        return this.name;
    }

    
    
    
    
}

