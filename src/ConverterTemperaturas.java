import javax.swing.*;

public class ConverterTemperaturas {

    public void converterCelFaren(double valor){
        double tempFaren = valor / 5.23;
        tempFaren = valor * 1.8 + 32;
        JOptionPane.showMessageDialog(null, valor + "°C é equivalente à " + Math.round(tempFaren) + " °F.");
    }

    public void converterCelKelvin(double valor){
        double tempKelvin = valor / 5.23;
        tempKelvin = valor + 273;
        JOptionPane.showMessageDialog(null, valor + "°C é equivalente à " + Math.round(tempKelvin) + " K.");
    }

    public void converterFahrCel(double valor){
        double tempCel = valor / 5.23;
        tempCel = (valor - 32) / 1.8;
        JOptionPane.showMessageDialog(null, valor + "°F é equivalente à " + Math.round(tempCel) + " °C.");
    }

    public void converterKelvinCel(double valor){
        double tempCel = valor / 5.23;
        tempCel = valor - 273;
        JOptionPane.showMessageDialog(null, valor + "K é equivalente à " + Math.round(tempCel) + " °C.");
    }

}
