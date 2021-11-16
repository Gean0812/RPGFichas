/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author Gean Souza
 */
@ManagedBean(name="CadastroController")
@SessionScoped 
public class CadastroController {
    
    
    String nome;
    String nickname;
    String password;
    
    
    
    public String cadastrarUsuario(){
        
        return null;
        
    }
    
}
