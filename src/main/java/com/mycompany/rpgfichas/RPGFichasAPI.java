/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rpgfichas;

import beans.UsuarioBEAN;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Usuario;

/**
 *
 * @author Gean Souza
 */
@Path("/api/v1")
public class RPGFichasAPI {
    
    @POST
    @Path("/cadastro")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean cadastrar(UsuarioBEAN usu){
        
        try{
            EntityManagerFactory ef = Persistence.createEntityManagerFactory("RPGFichas");
       EntityManager em = ef.createEntityManager();
        
        em.getTransaction().begin();
        Usuario usuario = new Usuario();
        usuario.setNome(usu.getNome());
        usuario.setNickname(usu.getNickname());
        usuario.setPassword(usu.getPassword());
        
        em.persist(usuario);
        em.getTransaction().commit();
        return true;
            
        } catch(Exception e) {
            
            e.printStackTrace();
            return false;
            
        }

    }
    
    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean login(UsuarioBEAN usu){
        
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("TB_USUARIO");
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("select NICKNAME and SENHA from TB_USUARIO");
        Usuario user = new Usuario();
              if(user.getNickname() == usu.getNickname() && user.getPassword() == usu.getPassword()){
                          return true;
                          
                  
              } else {
                  return false;
              }
        
    }
    
    
    
    
}
