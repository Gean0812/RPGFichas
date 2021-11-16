/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gean Souza
 */
public class Main {
    
    public static void main(String[] args) {
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("RPGFichas");
        EntityManager em = ef.createEntityManager();
        
        em.getTransaction().begin();
        Usuario usuario = new Usuario();
        usuario.setNome("Gean");
        usuario.setNickname("Gena");
        usuario.setPassword("12345678");
        
        em.persist(usuario);
        em.getTransaction().commit();
        
    }
    
}
