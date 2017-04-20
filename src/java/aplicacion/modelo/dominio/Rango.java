/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Alumno
 */
public class Rango {
 private int a;
 private int b;
 
public Rango() {
    }

    public Rango(int a, int b) {
        this.a = a;
        this.b = b;
    }

public int obtenerPares (int in, int f){
    setA(in);
    setB(f);
    int cont=0;
    int i;
    for (i=in;i<=f;i++){
        if (i%2==0){
            cont=cont+1;
        }
    }
   return cont;
}

public int obtenerPrimos (int in, int f){
    setA(in);
    setB(f);
    boolean esPrimo;
    int cont=0;
    int i,j;
    for(i = in;i <=f;i++){ 
        esPrimo=true;
        if (i==1 || i==0){
            esPrimo = false;
        }
        for(j = 2;j < i;j++){ 
            if(i % j == 0){
                esPrimo = false;} } 
            if(esPrimo){ 
                cont=cont+1; } } 
return cont;
 }


public int obtenerImpares (int in, int f){
    setA(in);
    setB(f);
    int cont=0;
    int i;
    for (i=in;i<=f;i++){
        if (i%2!=0){
            cont=cont+1;
        }
    }
    return cont;
}

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }


}
