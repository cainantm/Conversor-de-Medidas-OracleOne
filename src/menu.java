import javax.swing.*;

public class menu {

    public static void menu() {
        String opcoes = JOptionPane.showInputDialog(null,"Escolha uma opção", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"},"Escolha").toString();

        String input = JOptionPane.showInputDialog("Insira uma valor");

        Funcao funcao = new Funcao();

        switch (opcoes) {
            case "Conversor de Moeda":
                double valorRecebido = Double.parseDouble(input);
                funcao.converterMoedas(valorRecebido);
                int resposta = JOptionPane.showConfirmDialog(null,"Deseja Continuar?");
                if (resposta == JOptionPane.OK_OPTION){
                    menu.menu();
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
                break;

            case "Conversor de Temperatura":
                double tempRecebido = Double.parseDouble(input);
                funcao.converterTemp(tempRecebido);
                int resp = JOptionPane.showConfirmDialog(null,"Deseja Continuar?");
                if (resp == JOptionPane.OK_OPTION){
                    menu.menu();
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
                break;
        }
    }

}
