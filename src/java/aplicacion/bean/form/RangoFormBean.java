/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.Rango;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class RangoFormBean {
    private int inicio;
    private int fin;
    
    /**
     * Creates a new instance of RangoFormBean
     */
    public RangoFormBean() {
    }
    
public int calcularPares(){
    Rango par= new Rango();
    return par.obtenerPares(getInicio(), getFin());
}

public int calcularImpares(){
    Rango impar= new Rango();
    return impar.obtenerImpares(getInicio(), getFin()) ;
}

public int calcularPrimos(){
    Rango primo= new Rango();
    return primo.obtenerPrimos(getInicio(), getFin());
}

    /**
     * @return the inicio
     */
    public int getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public int getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
 
}
