/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author cauas
 */
public interface Veiculos {
    
    public double gastoCombustivel(double distancia, double valorCombustivel);
    
    public void setCombustivel(double combustivel);
    
    public void setConsumo(double consumo);
    
    public void setPlaca(String placa);
    
    public double getCombustivel();
    
    public double getConsumo();
    
    public String getPlaca();

}
