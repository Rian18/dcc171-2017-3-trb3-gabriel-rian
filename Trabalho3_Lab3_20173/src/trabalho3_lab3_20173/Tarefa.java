/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab_lab3_20173;

import java.util.Date;

/**
 *
 * @author RianAlves
 */
public class Tarefa {
   private String nome;
   private String descricao;
   private int duracaoDias;
   private float percentual;
   private Date dataInicial;
   private Date dataFinal;
   private boolean stutus = true;

    public Tarefa() {
    }

   
    public Tarefa(String nome, String descricao, int duracaoDias, float percentual, Date dataInicial, Date dataFinal, Boolean status) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoDias = duracaoDias;
        this.percentual = percentual;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.stutus = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(int duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public boolean isStutus() {
        return stutus;
    }

    public void setStutus(boolean stutus) {
        this.stutus = stutus;
    }

    @Override
    public String toString() {
        if(isStutus()){
            return nome + " - Ativa";
        }else{
            return nome + " - Inativa";
        }
        
    }
   
   
   
}
