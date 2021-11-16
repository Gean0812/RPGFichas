/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Gean Souza
 */
public class Ficha {
    
    String raca;
    String genero;
    String altura;
    String classe;
    int fichaId;

    public Ficha(String raca, String genero, String altura, String classe, int fichaId) {
        this.raca = raca;
        this.genero = genero;
        this.altura = altura;
        this.classe = classe;
        this.fichaId = fichaId;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getFichaId() {
        return fichaId;
    }

    public void setFichaId(int fichaId) {
        this.fichaId = fichaId;
    }
    
    
    
}
