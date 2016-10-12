/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.model.equipe;

import java.util.List;
import stevent.model.atleta.Atleta;
import stevent.model.modalidade.Modalidade;

/**
 *
 * @author Yuri Pereira <yuri.souza@al.infnet.edu.br>
 */
public class Equipe {
    
    private int id;
    private String nome;
    private Modalidade modalidade;
    private List<Atleta> atletas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }
    
    
    
}
