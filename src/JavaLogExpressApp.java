import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLogExpressApp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Veiculo> frota = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- JAVALOG EXPRESS - SISTEMA DE FROTA ---");
            System.out.println("1. Cadastrar Van no Sistema");
            System.out.println("2. Cadastrar Caminhão no Sistema");
            System.out.println("3. Listar Veículos da Frota e Custos de Frete Simulados");
            System.out.println("0. Encerrar Sistema");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a Placa da Van: ");
                    String pVan = leitor.nextLine();
                    System.out.print("Digite o Modelo: ");
                    String mVan = leitor.nextLine();
                    System.out.print("Capacidade de Carga (kg): ");
                    double cVan = leitor.nextDouble();
                    leitor.nextLine();
    
                    frota.add(new Van(pVan, mVan, cVan));
                    
                    System.out.println("Van cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a Placa do Caminhão: ");
                    String pCam = leitor.nextLine();
                    System.out.print("Digite o Modelo: ");
                    String mCam = leitor.nextLine();
                    System.out.print("Capacidade de Carga (kg): ");
                    double cCam = leitor.nextDouble();
                    System.out.print("Número de Eixos do Caminhão: ");
                    int eixos = leitor.nextInt();
                    leitor.nextLine();
    
                    frota.add(new Caminhao(pCam, mCam, cCam, eixos));
                    
                    System.out.println("Caminhão cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- RELATÓRIO DA FROTA E SIMULAÇÃO DE FRETE (Para 100km) ---");
                    if (frota.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado na frota.");
                    } else {
                        for(Veiculo veiculo : frota){
                        double freteBase = veiculo.calcularCustoFrete(100);
                        String tipo = (veiculo instanceof Van) ? "Van" : "Caminhão";
                        System.out.println("Veículo: "+ tipo +
                                            "| Placa: "+ veiculo.getPlaca() +
                                            "| Modelo: "+ veiculo.getModelo() +
                                            veiculo.getInstancia() +
                                            "| Frete Simulado: "+ freteBase);
                    }
                }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}