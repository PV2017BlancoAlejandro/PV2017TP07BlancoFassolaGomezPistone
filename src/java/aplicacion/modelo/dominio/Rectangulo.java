/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Rectangulo {
    public double baseRec;
    public double alturaRec;
    private Punto puntoOrigen;
    private Punto puntoB;
    private Punto puntoC;
    private Punto puntoD;
  
    public Rectangulo() {
    }
  
    
    public double obtenerSuperficie(double base, double alt){
        double superficie;
        setBaseRec(base);
        setAlturaRec(alt);
        superficie=base*alt;
        return superficie;
    }
    
     public double obtenerPerimetro(double base, double alt){
        double perimetro;
        setBaseRec(base);
        setAlturaRec(alt);
        perimetro=((base*2)+(alt*2));
        return perimetro;
    }
    public Rectangulo(Punto puntoOrigen, Punto puntoB, Punto puntoC, Punto puntoD) {
        this.puntoOrigen = puntoOrigen;
        this.puntoB = puntoB;
        this.puntoC = puntoC;
        this.puntoD = puntoD;
    }

    public ArrayList<Punto> encontrarNuevoPunto (Punto A, double base, double alt){
        setPuntoOrigen(A);
        setBaseRec(base);
        setAlturaRec(alt);
        

        ArrayList<Punto> puntos = new ArrayList();
        
        setPuntoB(new Punto
        (getPuntoOrigen().getX()+getBaseRec(),getPuntoOrigen().getY()));
        setPuntoC(new Punto
        (getPuntoOrigen().getX()+getBaseRec(),getPuntoOrigen().getY()+getAlturaRec()));
        setPuntoD (new Punto
        (getPuntoOrigen().getX(),getPuntoOrigen().getY()+getAlturaRec()));
        
        puntos.add(puntoOrigen);
        puntos.add(puntoB);
        puntos.add(puntoC);
        puntos.add(puntoD);
        
        return puntos;
    }
   
    /**
     * @return the baseRec
     */
    public double getBaseRec() {
        return baseRec;
    }

    /**
     * @param baseRec the baseRec to set
     */
    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    /**
     * @return the alturaRec
     */
    public double getAlturaRec() {
        return alturaRec;
    }

    /**
     * @param alturaRec the alturaRec to set
     */
    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    /**
     * @return the puntoOrigen
     */
    public Punto getPuntoOrigen() {
        return puntoOrigen;
    }

    /**
     * @param puntoOrigen the puntoOrigen to set
     */
    public void setPuntoOrigen(Punto puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    /**
     * @return the puntoB
     */
    public Punto getPuntoB() {
        return puntoB;
    }

    /**
     * @param puntoB the puntoB to set
     */
    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    /**
     * @return the puntoC
     */
    public Punto getPuntoC() {
        return puntoC;
    }

    /**
     * @param puntoC the puntoC to set
     */
    public void setPuntoC(Punto puntoC) {
        this.puntoC = puntoC;
    }

    /**
     * @return the puntoD
     */
    public Punto getPuntoD() {
        return puntoD;
    }

    /**
     * @param puntoD the puntoD to set
     */
    public void setPuntoD(Punto puntoD) {
        this.puntoD = puntoD;
    }
}

