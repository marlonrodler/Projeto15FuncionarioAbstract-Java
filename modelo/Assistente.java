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
public class Assistente extends Funcionario {

    public Assistente() {
    }

    public Assistente(String nome, double salBase) {
        super(nome, salBase);
    }

    @Override
    public double calcularSalario() {
        return this.salBase;
    }

}
