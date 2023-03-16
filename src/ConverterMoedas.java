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

}
