import javax.swing.*;

public class Projeto2 {
    public static void main (String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Login", 3);
        if (nome != null && !nome.trim().isEmpty()) {
            JPasswordField senhaField = new JPasswordField(10);
            int resultado = JOptionPane.showConfirmDialog(null, senhaField, "Digite sua senha:", 2, 3);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(null, "Login cancelado.", "Aviso", 1);
            } else {
                String senha = new String(senhaField.getPassword());
                String USUARIO_CORRETO = "ADMIN";
                String SENHA_CORRETA = "1234";
                if (nome.trim().equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                    JOptionPane.showMessageDialog(null, "✅ Login bem-sucedido!\nBem-vindo, " + nome +
                            "!", "Sucesso", 1);
                    String var7 = "Eduardo Rodriguez";
                    int var8 = 68979425;
                    double var9 = 2000.00;
                    String var10 = "Julia Pinheiro";
                    int var11 = 98725280;
                    double var12 = 7000.00;
                    double var13 = 0.1;
                    double var14 = 2700.00;
                    String var15 = "Alexandro Queiroz";
                    int var16 = 55379164;
                    double var18 = 5750.00;
                    double var19 = (150 * 25);

                    String opcao = JOptionPane.showInputDialog(null, "=== SISTEMA DE FUNCIONÁRIOS ===\nEscolha uma opção:" +
                            "\n1 - Eduardo Rodriguez (Salário Base)\n2 - Julia Pinheiro (Salário + Comissão)" +
                            "\n3 - Alexandro Queiroz (Salário + Bônus)\n0 - Sair\n\nDigite o número da opção:", "Menu de Funcionários", 3);
                    if (opcao != null && !opcao.trim().isEmpty()) {
                        switch (opcao.trim()) {
                            case "1":
                                JOptionPane.showMessageDialog( null, "✅ FUNCIONÁRIO 1\nNome: " +var7 +
                                        "\nMatrícula: "+var8+"\nSalário: R$"+String.format("%.2f", + var9),"Eduardo Rodriguez", 1);
                                break;
                            case "2":
                                String var10001 = String.format("%.2f", +var12);
                                JOptionPane.showMessageDialog(null, "✅ FUNCIONÁRIO 2\nNome: "+var10+
                                        "\nMatrícula: "+var11+"\nVendas: R$ " + var10001 + "\nComissão (10%): R$ " +
                                        (var12 * var13) + "\nSalário Total: R$ " + var14, "Julia Pinheiro", 1);
                                break;
                            case "3":
                                JOptionPane.showMessageDialog(null, "✅ FUNCIONÁRIO 3\nNome: "+var15+
                                        "\nMatrícula: " +var16+ "\nBônus de Produtividade: R$ "+var19+"\nSalário Total: R$ "
                                        + var18, "Alexandro Queiroz", 1);
                                break;
                            case "0":
                                JOptionPane.showMessageDialog(null, "Até logo! \ud83d\udc4b", "Encerrando", 1);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "⚠️ Opção inválida! Digite 1, 2, 3 ou 0.", "Erro", 0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", 1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "❌ Acesso negado.\nNome ou senha incorretos.", "Erro de Autenticação", 0);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login cancelado.", "Aviso", 1);
        }
        JOptionPane.showMessageDialog(null, "Até logo! \ud83d\udc4b", "Encerrando", 1);
    }
}
