import java.util.Locale;
import java.util.Scanner;

public class ProjetoAtualizacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("===    LOGIN     ===");
        System.out.println("====================");

        String nome;
        String senha;
        String USUARIOCORRETO = "ADMIN";
        String SENHACORRETA = "1234";

        String var1 = "Eduardo Rodriguez";
        int var2 = 68979425;
        double var3 = 2000.00;

        String var4 = "Julia Pinheiro";
        int var5 = 98725280;
        double var6 = 2500.00;
        double var7 = 0.5;
        double var8 = (var6 * var7) + var3;

        String var9 = "Alexandro Queiroz";
        int var10 = 55379164;
        double var11 = (150 * 25);
        double var12 = 5750.00;

        do {
            System.out.print("Usuário: ");
            nome = sc.nextLine().trim().toUpperCase(Locale.ROOT);

            System.out.print("Senha: ");
            senha = sc.nextLine().trim();
            String opcao;

            if (nome.equals(USUARIOCORRETO) && senha.equals(SENHACORRETA)) {
                System.out.println("\n=======================");
                System.out.println("_ Login bem-sucedido! _");
                System.out.println("===== Bem-vindo! ======");

                System.out.println("\n===============================");
                System.out.println("=== SISTEMA DE FUNCIONÁRIOS ===");
                System.out.println("===============================");

                do {
                    System.out.println("\nEscolha uma opção:");
                    System.out.println("1 - " + var1);
                    System.out.println("2 - " + var4);
                    System.out.println("3 - " + var9);
                    System.out.println("0 - Sair do sistema");
                    System.out.print("\nDigite o número da opção: ");

                    opcao = sc.nextLine().trim();

                    switch (opcao) {
                        case "1":
                            System.out.println("\n\n================================");
                            System.out.println("====== FUNCIONÁRIO PADRÃO ======");
                            System.out.println("================================");
                            System.out.println("\nNOME: "+var1+ "\nMATRICULA:" +var2+ "\nSALÁRIO: "+var3);

                            break;
                        case "2":
                            System.out.println("\n\n=====================================");
                            System.out.println("====== FUNCIONÁRIO DE COMISSÃO ======");
                            System.out.println("=====================================");
                            System.out.println("\nNOME: "+var4+ "\nMATRICULA:" +var5+ "\nVENDAS: "+var6+ "\nSALÁRIO: "+var8);

                            break;
                        case "3":
                            System.out.println("\n\n====================================");
                            System.out.println("====== FUNIONÁRIO DE PRODUÇÃO ======");
                            System.out.println("====================================");
                            System.out.println("\nNOME: "+var9+ "\nMATRICULA: "+var10+"\nBÔNUS POR PRODUTIVIDADE: "+var11+"\nSALÁRIO: "+var12);

                            break;
                        case "0":
                            System.out.println("\n\n=============================");
                            System.out.println("========= ATÉ LOGO! =========");
                            System.out.println("====== ENCERRANDO. . . ======");
                            System.out.println("=============================");
                            break;
                        default:
                            System.out.println("\n\n==============================");
                            System.out.println("======= OPÇÃO INVÁLIDA =======");
                            System.out.println("==============================");
                            break;
                    }
                } while (!opcao.equals("0"));

            } else {
                System.out.println("\n================================");
                System.out.println("======== ACESSO NEGADO =========");
                System.out.println("=== NOME OU SENHA INCORRETOS ===");
                System.out.println("================================\n");
            }
        } while (!nome.equals(USUARIOCORRETO) || !senha.equals(SENHACORRETA));

        sc.close();
    }
}
