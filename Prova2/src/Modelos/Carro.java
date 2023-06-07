/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author cauas
 */
public class Carro extends Veiculo implements Veiculos{
    private int qtdPortas;

    public Carro(String nome, double combustivel, double consumo, String placa, int qtdPortas) {
        super(nome, combustivel, consumo, placa);
        this.qtdPortas = qtdPortas;
    }
    
    @Override
    public double gastoCombustivel(double distancia, double valorCombustivel) {
        return (distancia / consumo) * valorCombustivel;
    }
    
    @Override
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double getCombustivel() {
        return(this.combustivel);
    }

    @Override
    public double getConsumo() {
        return(this.consumo);
    }

    @Override
    public String getPlaca() {
        return(this.placa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

}

