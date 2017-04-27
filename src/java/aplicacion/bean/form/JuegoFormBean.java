/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.JuegoAhorcado;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class JuegoFormBean implements Serializable {
private boolean componenteDeshabilitado;
private JuegoAhorcado juegoAhorcado;
private String palabraIngresada;
private char letraIngresada;

    /**
     * Creates a new instance of JuegoFormBean
     */
    public JuegoFormBean() {
        juegoAhorcado = new JuegoAhorcado();
        componenteDeshabilitado = false;
    }
public void empezarJuego(){
    juegoAhorcado.empezarJuego(getPalabraIngresada());
    setComponenteDeshabilitado(true);
    FacesContext context = FacesContext.getCurrentInstance();
    context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Juego Iniciado", "Que tengas suerte"));
    
}
public void nuevo(){
    getJuegoAhorcado().nuevoJuego(getPalabraIngresada());
    setComponenteDeshabilitado(false);
    FacesContext context = FacesContext.getCurrentInstance();
}

public void controlarLetra() throws InterruptedException{
    boolean esLetraEncontrada=juegoAhorcado.buscarLetra(getLetraIngresada());
    if(esLetraEncontrada==true){
        if (juegoAhorcado.juegoGanado()==true){
            FacesContext context = FacesContext.getCurrentInstance();
            setComponenteDeshabilitado(false);
            setPalabraIngresada(new String ());
            setJuegoAhorcado(new JuegoAhorcado());
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"WINNER!","Usted ganó el Juego!"));
            
        }
    }
    else{
        if(juegoAhorcado.getIntentos() == 0){
            FacesContext context = FacesContext.getCurrentInstance();
            setComponenteDeshabilitado(false);
            setJuegoAhorcado(new JuegoAhorcado());
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"GAME OVER","Usted perdió el Juego!"));
            
        }
    }
}
    /**
     * @return the juegoAhorcado
     */
    public JuegoAhorcado getJuegoAhorcado() {
        return juegoAhorcado;
    }

    /**
     * @param juegoAhorcado the juegoAhorcado to set
     */
    public void setJuegoAhorcado(JuegoAhorcado juegoAhorcado) {
        this.juegoAhorcado = juegoAhorcado;
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    /**
     * @return the componenteDeshabilitado
     */
    public boolean isComponenteDeshabilitado() {
        return componenteDeshabilitado;
    }

    /**
     * @param componenteDeshabilitado the componenteDeshabilitado to set
     */
    public void setComponenteDeshabilitado(boolean componenteDeshabilitado) {
        this.componenteDeshabilitado = componenteDeshabilitado;
    }
    
}
