/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author cauas
 */
public abstract class Veiculo implements Comparable <Veiculo> {
    protected String nome;
    protected double combustivel;
    protected double consumo;
    protected String placa;

    public Veiculo(String nome, double combustivel, double consumo, String placa) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.placa = placa;
    }
    
    public int compareTo(Veiculo outroVeiculo) {
        return this.nome.compareTo(outroVeiculo.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
