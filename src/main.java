import javax.swing.*;

public class main {

    public static void main(String[] args) {

        String opcoes = JOptionPane.showInputDialog(null,"Escolha uma opção", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moeda"},"Escolha").toString();

        String input = JOptionPane.showInputDialog("Insira uma valor");

        Funcao funcao = new Funcao();

        switch (opcoes) {
            case "Conversor de Moeda":
                double valorRecebido = Double.parseDouble(input);
                funcao.converterMoedas(valorRecebido);
                int resposta = JOptionPane.showConfirmDialog(null,"Deseja Continuar?");
                if (resposta == JOptionPane.OK_OPTION){
                    System.out.println("Escolheu opção afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
                break;
        }

    }

}