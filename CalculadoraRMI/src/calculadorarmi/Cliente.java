/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.awt.HeadlessException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author webdev
 */
public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Registry miRegistro = LocateRegistry.getRegistry("127.0.0.1", 1234);
            Calculadora c = (Calculadora) miRegistro.lookup("Calculadora");
            while (true) {
                String menu = JOptionPane.showInputDialog("Calculadora de sergio \n Calculadora en RMI. \n\n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División \n 5. Raiz cuadrada \n 6. Potenciación \n 7. Logaritmación \n 8. Seno \n 9. Coseno \n 10. Tangente \n");
                switch (menu) {
                    case "1": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero."));
                        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.sum(a, b));
                        break;
                    }
                    case "2": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero."));
                        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.rest(a, b));
                        break;
                    }
                    case "3": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero."));
                        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.mult(a, b));
                        break;
                    }
                    case "4": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero."));
                        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.div(a, b));
                        break;
                    }
                    case "5": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.raizCuadrada(a));
                        break;
                    }
                    case "6": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base."));
                        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.potencia(a, b));
                        break;
                    }
                    case "7": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del logaritmo."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.logaritmo(a));
                        break;
                    }
                    case "8": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el angulo para sacar el seno."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.seno(a));
                        break;
                    }
                    case "9": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el angulo para sacar el coseno."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.coseno(a));
                        break;
                    }
                    case "10": {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el angulo para sacar la tangente."));
                        JOptionPane.showMessageDialog(null, "La suma es : " + c.tangente(a));
                        break;
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException | NotBoundException | RemoteException e) {
            JOptionPane.showMessageDialog(null, "Servidor no conectado " + e.getMessage());
        }
    }
}
