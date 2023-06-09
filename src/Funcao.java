import javax.swing.*;

public class Funcao {

    ConverterMoedas moedas = new ConverterMoedas();
    ConverterTemperaturas temp = new ConverterTemperaturas();

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
            case "De reais para Libra":
                moedas.converterReaisALibras(valorRecebido);
                break;
            case "De dólar para reais":
                moedas.converterDolarReais(valorRecebido);
                break;
            case "De euros para reais":
                moedas.converterEuroReais(valorRecebido);
                break;
            case "De libras para reais":
                moedas.converterLibrasReais(valorRecebido);
                break;
        }
    }

    public void converterTemp (double tempRecebido) {
        String opcao = JOptionPane.showInputDialog(null, "Escolha a tempratura para qual deseja converter", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius para Fahrenheit" , "De Celsius para Kelvin" , "De Fahrenheit para Celsius", "De Kelvin para Celsius"}, "Escolha").toString();

        switch (opcao) {
            case "De Celsius para Fahrenheit":
                temp.converterCelFaren(tempRecebido);
                break;
            case "De Celsius para Kelvin":
                temp.converterCelKelvin(tempRecebido);
                break;
            case "De Fahrenheit para Celsius":
                temp.converterFahrCel(tempRecebido);
                break;
            case "De Kelvin para Celsius":
                temp.converterKelvinCel(tempRecebido);
                break;
        }

    }

}
