/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author cauas
 */
public class Caminhao extends Veiculo implements Veiculos{
    private int qtdEixos;

    public Caminhao(String nome, double combustivel, double consumo, String placa, int qtdEixos) {
        super(nome, combustivel, consumo, placa);
        this.qtdEixos = qtdEixos;
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

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }
    
    
  } 
    


    

