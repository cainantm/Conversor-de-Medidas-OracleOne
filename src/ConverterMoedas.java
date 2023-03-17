import javax.swing.*;

public class ConverterMoedas {

    public void converterReaisADolar(double valor){
        double moedaDolar = valor / 5.23;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " dólares");
    }

    public void converterReaisAEuro(double valor){
        double moedaEuro = valor / 5.52;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " euros");
    }

    public void converterReaisALibras(double valor){
        double moedaLibra = valor / 6.43;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem £ " + moedaLibra + " libras");
    }

    public void converterDolarReais(double valor){
        double moedaReais = valor * 5.23;
        moedaReais = (double) Math.round(moedaReais * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReais + " dólares");
    }

    public void converterEuroReais(double valor){
        double moedaReais = valor * 5.52;
        moedaReais = (double) Math.round(moedaReais * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReais + " euros");
    }

    public void converterLibrasReais(double valor){
        double moedaReais = valor * 6.43;
        moedaReais = (double) Math.round(moedaReais * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem £ " + moedaReais + " libras");
    }

}
