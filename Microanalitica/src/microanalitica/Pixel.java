/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microanalitica;

/**
 *
 * @author Estudiantes
 */
public class Pixel {
    
    int rojo;
    int verde;
    int azul;

    public void setPixel(int rojo, int verde, int azul) {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    public Pixel() {
    }

   
    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        if(rojo<0||rojo>255){
            this.rojo = 128;
        }
        else{
            this.rojo = rojo;
        }
          
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        if(verde<0||verde>255){
            this.verde = 128;
        }
        else{
            this.verde = verde;
        }
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
             if(azul<0||azul>255){
            this.azul = 128;
        }
        else{
            this.azul = azul;
        }
    }
    
    
}
