package Main;

import Modelos.Caminhao;
import Modelos.Carro;
import Modelos.Condutor;
import Modelos.FolhaDePagamento;
import Modelos.Moto;
import Modelos.Relatorios;
import Modelos.Viagem;

public class Main {
    public static void main(String[] args) {
        Relatorios relatorios = new Relatorios();
        
        Moto moto = new Moto("CB", 0.0, 3.50, "EDU6789", 500);
        Carro carro = new Carro("zelta", 0, 3.40, "ABC9860", 4);
        Caminhao caminhao = new Caminhao("HBO", 0, 3.80, "RYA3456", 8);
        
        Condutor condutor1 = new Condutor("Ryan", "111.111.111-11", "04/11/2003", 2000);
        Condutor condutor2 = new Condutor("Antonio", "222.222.222-22", "30/10/2010", 3000);
        Condutor condutor3 = new Condutor("Eduardo", "333.333.333-33", "23/08/2003", 2800);
    
        Viagem viagem1 = new Viagem("Cidade A", "Cidade B", 500, moto, condutor1);
        Viagem viagem2 = new Viagem("Cidade B", "Cidade C", 1000, carro, condutor2);
        Viagem viagem3 = new Viagem("Cidade C", "Cidade D", 1500, caminhao, condutor3);
        
        relatorios.adicionarVeiculo(caminhao);
        relatorios.adicionarVeiculo(carro);
        relatorios.adicionarVeiculo(moto);
        
        relatorios.adicionarViagem(viagem3);
        relatorios.adicionarViagem(viagem2);
        relatorios.adicionarViagem(viagem1);
     
        relatorios.adicionarCondutor(condutor1);
        relatorios.adicionarCondutor(condutor2);
        relatorios.adicionarCondutor(condutor3);
     
        System.out.println("Relatorio de condutores");
        relatorios.imprimeCondutores();
        
        System.out.println("\nRelatorio de viagens");
        relatorios.imprimeViagem();
        
        System.out.println("\nRelatorio de veiculos");
        relatorios.imprimeVeiculos();
        
        FolhaDePagamento folha = new FolhaDePagamento(11, 2003);
        folha.adicionarCondutor(condutor1);
        folha.adicionarCondutor(condutor2);
        folha.adicionarCondutor(condutor3);
        
        System.out.println("\nFolha de pagamento");
        folha.imprimir();
    }
     
}
