/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class JuegoAhorcado implements Serializable {
    private String palabraAdivinar;
    private int intentos;
    private String imagen;
    private char[] palabraAhorcado;

    public JuegoAhorcado() {
        palabraAdivinar="";
        intentos = 5; 
        palabraAhorcado = new char[10];
    }

    public JuegoAhorcado(String palabraAdivinar, int intentos, char[] palabraAhorcado) {
        this.palabraAdivinar = palabraAdivinar;
        this.intentos = intentos;
        this.palabraAhorcado = palabraAhorcado;
    }
    public void empezarJuego (String palabra){
        setPalabraAdivinar(palabra);
    }
    
    public ArrayList<String> getPalabraAhorcadoFOrmat(){
        ArrayList<String> caracteresPalabra=new ArrayList();
        for(int i = 0;i < palabraAdivinar.length();i++){
            caracteresPalabra.add(String.valueOf(palabraAhorcado[i]));
        }
        return caracteresPalabra;
    }
    public boolean buscarLetra(char letra){
    boolean encontro=false;
    for (int i=0;i<palabraAdivinar.length();i++){
        if (palabraAdivinar.charAt(i)==letra){
            palabraAhorcado[i]=letra;
            encontro=true;
        }
    }
    if (encontro==false){
        setIntentos(getIntentos()-1);
        switch (getIntentos()){
            case 4:
                setImagen("/images/imagen1.jpg");
                break;
            case 3:
                setImagen ("/images/imagen2.jpg");
                break;
            case 2:
                setImagen ("/images/imagen3.jpg");
            break;
            case 1:
                setImagen ("/images/imagen4.jpg");
            break;
            case 0:
                setImagen ("/images/imagen5.jpg");
            break;
        }
        return false;
    }
    else{
        return true;}
    }

    public boolean juegoGanado (){
        boolean ganador = true;
        for (int i = 0; i < palabraAdivinar.length();i++){
            if (palabraAdivinar.charAt(i)!=palabraAhorcado[i]){
                ganador=false;
            }
        }
        return ganador;
    }
public void nuevoJuego (String palabra){
    setPalabraAdivinar(palabra);
    palabraAdivinar="";
    intentos=5;
}
    /**
     * @return the palabraAdivinar
     */
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    /**
     * @param palabraAdivinar the palabraAdivinar to set
     */
    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the palabraAhorcado
     */
    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    /**
     * @param palabraAhorcado the palabraAhorcado to set
     */
    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}