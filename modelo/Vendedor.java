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
public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor() {
    }

    public Vendedor(double comissao, String nome, double salBase) {
        super(nome, salBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double novoSal;
        novoSal = this.salBase + this.comissao;
        return novoSal;
    }
}
