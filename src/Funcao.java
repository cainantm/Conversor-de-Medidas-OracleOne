import javax.swing.*;

public class Funcao {

    ConverterMoedas moedas = new ConverterMoedas();

    public void converterMoedas(double valorRecebido) {
        String opcao = JOptionPane.showInputDialog(null, "Escolha a moeda para qual deseja converter seu dinheiro", "Moedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De reais para dólar", "De reais para Euros", "De reais para Libra", "De dólar para reais", "De euros para reais", "De Libra para reais"}, "Escolha").toString();

        switch (opcao) {
            case "De reais para dólar":
                moedas.converterReaisADolar(valorRecebido);
                break;
            case "De reais para Euros":
                moedas.converterReaisAEuro(valorRecebido);
                break;
        }
    }
}
