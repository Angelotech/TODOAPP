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
public class Taks {
    private int id;
    private int idproject;
    private String name;
    private String description;
    private boolean cpmpletada;
    private String nodes;
    private Date deadline;
    private Date creadAT;
    private Date updateAT;

    public Taks(int id, int idproject, String name, String description, boolean cpmpletada, String nodes, Date deadline, Date creadAT, Date updateAT) {
        this.id = id;
        this.idproject = idproject;
        this.name = name;
        this.description = description;
        this.cpmpletada = cpmpletada;
        this.nodes = nodes;
        this.deadline = deadline;
        this.creadAT = creadAT;
        this.updateAT = updateAT;
    }
    
    public Taks(){
        this.creadAT = new Date();
        this.updateAT = new Date();
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdproject() {
        return idproject;
    }

    public void setIdproject(int idproject) {
        this.idproject = idproject;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCpmpletada() {
        return cpmpletada;
    }

    public void setCpmpletada(Boolean cpmpletada) {
        this.cpmpletada = cpmpletada;
    }

    public String getNodes() {
        return nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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

    public void setUpdateAt(Date updateAT) {
        this.updateAT = updateAT;
    }

    @Override
    public String toString() {
        return "tarefas{" + "id=" + id + ", idproject=" + idproject + ", name=" + name + ", description=" + description + ", cpmpletada=" + cpmpletada + ", nodes=" + nodes + ", deadline=" + deadline + ", creadAT=" + creadAT + ", updateAT=" + updateAT + '}';
    }

   
    

   

   
    
}

