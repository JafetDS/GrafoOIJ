/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author Jafet
 *@ param id Número único asignado para identificar el grafo.
 *nodes lista de objetos tipo Node.
 *edges lista de objetos tipo Edge.
 * 
 * 
 */
public class Grafo {
    private int id;
    private Lista<Vertice>Vertices;
    private Lista<Arista>Aristas;
  

    public Grafo(int id) {
        this.id = id;
        this.Aristas=new Lista<>();
        this.Vertices=new Lista<>();
    }
    


    
    
//_______________Geters y Seters______________
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lista<Vertice> getVertices() {
        return Vertices;
    }

    public void setVertices(Lista<Vertice> Vertices) {
        this.Vertices = Vertices;
    }

    public Lista<Arista> getAristas() {
        return Aristas;
    }

    public void setAristas(Lista<Arista> Aristas) {
        this.Aristas = Aristas;
    }
    
    
    //_______________________Ordenar Lista Arista___________
    
    
    
    
    
    
}
