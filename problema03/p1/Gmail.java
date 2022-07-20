/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import p2.*;
import p1.*;
import p3.*;

public class Gmail implements Dominio {
    private String dominio;
    
    public void establecerDominio(){
        dominio = "@gmail.com";
    }
    
    public String obtenerDominio(){
        return dominio;
    }
}
