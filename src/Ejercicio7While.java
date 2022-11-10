import javax.swing.*;

public class Ejercicio7While {
    public static void main(String[] args) {
        int numero, elementos = 0, suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

        while(numero>=0){
            suma += numero; // Suma iterativa
            elementos++; // Aumentamos 1 a elemento

            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número: "));
        }

        if(elementos == 0){
            System.out.println("Error, La división entre 0 no es posible");
        }else{
        media = (float) suma /elementos;
            System.out.println("La media es " +media);
        }
    }
}
