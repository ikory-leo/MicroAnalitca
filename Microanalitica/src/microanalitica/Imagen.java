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
public class Imagen {
    
    //Los atributos se inicializan en el constructor!!!   
   Pixel pixels[][];  

    public Imagen(int n, int m) {
        
        pixels=new Pixel[n][m];
        
        for(int i=0;i<n;i++){
            
            for(int k=0;k<m;k++){
                
                pixels[i][k]=new Pixel();
            }
            
            
        }
        
        
    }
   
   
   
   
}
