/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author User
 *@param: id  //Número único asignado al nodo.
 *@param: inDegree //Entero que indica el grado entrante
 *@param: outDegree //Entero que indica el grado saliente
 *@param: entity //Objeto JSON que contiene el dato de la entidad almacenada
 */
public class Vertice {
    private int id;
    private int N_in;
    private int N_out;
    private String JSON;

    public Vertice(int id, String JSON) {
        this.id = id;
        this.JSON = JSON;
    }
    
    //_______________________IN________________

    public int getN_in() {
        return N_in;
    }

    public void setN_in() {
        this.N_in++;
    }
    
    public void skipN_in() {
        this.N_out--;
    }
    //_________________________OUT_________________

    public int getN_out() {
        return N_out;
    }

    public void setN_out() {
        this.N_out++;
    }
    
    public void skipN_out() {
        this.N_out--;
    }
    //_____________________JSON_____________________

    public String getJSON() {
        return JSON;
    }

    public void setJSON(String JSON) {
        this.JSON = JSON;
    }
    
    
    
    
    
}
