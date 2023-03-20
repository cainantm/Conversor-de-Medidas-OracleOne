import javax.swing.*;

public class Validar {

    //desativado no momento

    public static double validaValor(String valor){
        boolean converteu = false;
        double valorConvertido = 0;

        while (converteu == false){
            try {
                valorConvertido = Double.parseDouble(valor);
                converteu = true;
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Valor invalido");
                valor = JOptionPane.showInputDialog("Digite um novo valor. Use somente números e . para decimais.");

            }
        }
        return valorConvertido;
    }

}
