/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cauas
 */
public class Relatorios {
    private List<Condutor> condutores; //declarando as variaveis como listas que contem elementos dos tipos...
    private List<Veiculo> veiculos;
    private List<Viagem> viagens;

    public Relatorios() {
        this.condutores = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.viagens = new ArrayList<>(); //são inicializazdas como instancias de arraylist vazias
    }
    
    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    
    public void adicionarCondutor(Condutor condutor){
        condutores.add(condutor);
    }
    
    public void adicionarViagem(Viagem viagem){
        viagens.add(viagem);
    }
    
    public void imprimeVeiculos(){
        Collections.sort(veiculos);
        for(Veiculo veiculo : veiculos){
            System.out.println("Tipo: " + veiculo.getClass().getSimpleName());
            System.out.println("Nome: " + veiculo.getNome());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Combustível: " + veiculo.getCombustivel());
            System.out.println("Consumo: " + veiculo.getConsumo());
            System.out.println("------------------------\n");
        }
        
    }
    
    public void imprimeCondutores(){
        Collections.sort(condutores);
        for(Condutor c : condutores){
            System.out.println("Nome: " + c.getNome());
            System.out.println("CPF: " + c.getCpf());
            System.out.println("dataNascimento: " + c.getDataNascimento());
            System.out.println("Salario: " + c.getSalario());
            System.out.println("--------------------------\n");
        }
    }
    
    public void imprimeViagem(){
        Collections.sort(viagens);
        for(Viagem v : viagens){
            System.out.println("Cidade de Origem: " + v.getCddOrigem());
            System.out.println("Cidade de Destino: " + v.getCddDestino());
            System.out.println("Distância: " + v.getDistancia());
            System.out.println("Veículo: " + v.getCondutor().getNome());
            System.out.println("Condutor: " + v.getCondutor().getNome());
            System.out.println("Custo: " + v.custo(0));
            System.out.println("--------------------------\n");
        }
    }
    
    
}
