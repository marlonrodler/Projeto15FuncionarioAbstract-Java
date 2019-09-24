/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public abstract class Funcionario {

    protected String nome;
    protected double salBase;

    public Funcionario() {
    }

    public Funcionario(String nome, double salBase) {
        this.nome = nome;
        this.salBase = salBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public abstract double calcularSalario();

}
