/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cauas
 */
public class FolhaDePagamento {
    private int mes;
    private int ano;
    private List<Condutor> condutores;
    
    double total = 0;

    public FolhaDePagamento(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
        this.condutores = new ArrayList<>();
    }

    public void adicionarCondutor(Condutor condutor) {
        condutores.add(condutor);
    }

    public double totalAPagar() {
        for (Condutor condutor : condutores) {
            total += condutor.getSalario();
        }
        return total;
    }

    public void imprimir() {
        for (Condutor condutor : condutores) {
            System.out.println("Nome: " + condutor.getNome());
            System.out.println("Salário: " + condutor.getSalario());
            System.out.println("\n------------------------");
        }
        System.out.println("Total a Pagar: " + totalAPagar());
    }
    
    
}
