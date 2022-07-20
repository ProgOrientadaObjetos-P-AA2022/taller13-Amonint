/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p2.*;
import p1.*;
import p3.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
         */
        Estudiante estudiante = new Estudiante();
        estudiante.establecerNombres("René Elizalde");
        estudiante.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();

        Correo Correo = new Correo();
        Correo.establecerUserName(e.obtenerUserName());     
        Gmail Gmailcorreo = new Gmail();
        Gmailcorreo.establecerDominio();
        Correo.establecerDominio(dg);
        Correo.establecerCorreo();
        
        Correo Correo2 = new Correo();
        Correo2.establecerUserName(e.obtenerUserName());
        UTPL CorreoUtpl = new UTPL();
        CorreoUtpl.establecerDominio();
        Correo2.establecerDominio(ut);
        Correo2.establecerCorreo();
        
        
        Correo Correo3 = new Correo();
        Correo3.establecerUserName(e.obtenerUserName());
        Gobierno CorreoGobierno = new Gobierno();
        CorreoGobierno.establecerDominio();
        Correo3.establecerDominio(CorreoGobierno);
        Correo3.establecerCorreo();

        
        Correo Correo4 = new Correo();
        Correo4.establecerUserName(e.obtenerUserName());
        Outlook CorreoOutlook = new Outlook();
        CorreoOutlook.establecerDominio();
        Correo4.establecerDominio(CorreoOutlook);
        Correo4.establecerCorreo();

        Correo Correo5 = new Correo();
        Correo5.establecerUserName(e.obtenerUserName());
        Yahoo correoYahoo = new Yahoo();
        correoYahoo.establecerDominio();
        Correo5.establecerDominio(correoYahoo);
        Correo5.establecerCorreo();
        

        lista.add(Gmailcorreo);
        lista.add(CorreoGobierno);
        lista.add(CorreoOutlook);
        lista.add(CorreoUtpl);
        lista.add(correoYahoo);
        e.establecerCorreos(lista);

        System.out.println(e);

    }

}
