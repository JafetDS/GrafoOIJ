/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author User
 */
public class Arista {
    private int id;
    private Vertice V1;
    private Vertice V2;
    private int  peso;

    public Arista(int id, Vertice V1, Vertice V2) {
        this.id = id;
        this.V1 = V1;
        this.V2 = V2;
        this.V1.setN_out();
        this.V2.setN_in();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vertice getV1() {
        return V1;
    }

    public void setV1(Vertice V1) {
        this.V1 = V1;
    }

    public Vertice getV2() {
        return V2;
    }

    public void setV2(Vertice V2) {
        this.V2 = V2;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void delete(){
        this.V1.skipN_out();
        this.V2.skipN_out();
        this.id=-1;
    }



    
    
}
