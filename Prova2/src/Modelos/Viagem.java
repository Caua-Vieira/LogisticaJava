/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author cauas
 */
public class Viagem implements Comparable<Viagem> {
    private String cddOrigem;
    private String cddDestino;
    private double distancia;
    private Veiculos veiculo;
    private Condutor condutor;

    public Viagem(String cddOrigem, String cddDestino, double distancia, Veiculos veiculo, Condutor condutor) {
        this.cddOrigem = cddOrigem;
        this.cddDestino = cddDestino;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.condutor = condutor;
    }
    
    public double custo(double valorCombustivel){
        double consumoCombustivel = veiculo.gastoCombustivel(this.distancia, valorCombustivel);
        double diariaCondutor = Math.ceil(this.distancia / 700) * condutor.getSalario();
        return consumoCombustivel + diariaCondutor;
    }

    @Override
    public int compareTo(Viagem outraViagem) {
        if(this.custo(5) < outraViagem.custo(5)){
            return -1;
        } else if (this.custo(5) > outraViagem.custo(5)){
            return 1;
        }
        return 0;
    }

    public String getCddOrigem() {
        return cddOrigem;
    }

    public void setCddOrigem(String cddOrigem) {
        this.cddOrigem = cddOrigem;
    }

    public String getCddDestino() {
        return cddDestino;
    }

    public void setCddDestino(String cddDestino) {
        this.cddDestino = cddDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }
 
}
