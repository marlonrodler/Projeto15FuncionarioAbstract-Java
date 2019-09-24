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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vendedor ven01 = new Vendedor();
        ven01.setNome("Thiago");
        ven01.setSalBase(2000);
        ven01.setComissao(750);
        System.out.println("Vendedor: " + ven01.getNome() + "\nSalario Base: " + ven01.getSalBase());
        System.out.println("Salario Final: " + ven01.calcularSalario());

        Assistente ass01 = new Assistente();
        ass01.setNome("Rogerio");
        ass01.setSalBase(990);
        System.out.println("\n\nAssistende: " + ass01.getNome() + "\nSalario Base: " + ass01.getSalBase());
        System.out.println("Salario Final: " + ass01.calcularSalario());

        Gerente ger01 = new Gerente();
        ger01.setNome("Marlon");
        ger01.setSalBase(3000);
        System.out.println("\n\nGerente: " + ger01.getNome() + "\nSalario Base: " + ger01.getSalBase());
        System.out.println("Salario Final: " + ger01.calcularSalario());

    }

}
