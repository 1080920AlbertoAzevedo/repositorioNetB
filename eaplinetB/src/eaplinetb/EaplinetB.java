/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eaplinetb;

/**
 *
 * @author alberto
 */
public class EaplinetB {

    public void pausa(millis){
        var date = new Date();
        var curDate = null;
        do { curDate = new Date(); }
        while(curDate-date < millis);
    }
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
           setTimeout(); 
        }
    }
}
