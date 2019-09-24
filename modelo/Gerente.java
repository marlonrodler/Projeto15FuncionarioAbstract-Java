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
public class Gerente extends Funcionario {

    @Override
    public double calcularSalario() {
        return 2 * this.salBase;
    }

}
