/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;
import p2.*;
import p1.*;
import p3.*;

public class Outlook implements Dominio{
    private String dominio;
    
    public void establecerDominio(){
        dominio = "@Outlook.com";
    }
    
    public String obtenerDominio(){
        return dominio;
    }
}