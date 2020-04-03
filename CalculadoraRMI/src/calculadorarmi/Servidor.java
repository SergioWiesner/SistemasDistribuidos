/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author webdev
 */
public class Servidor {

    public static void main(String args[]) throws java.net.UnknownHostException {
        try {
   
            Registry r = LocateRegistry.createRegistry(1234);
            r.rebind("Calculadora", new Rmi());
            JOptionPane.showMessageDialog(null, "Servidor  conectado ");
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "Servidor no conectado " + e);
        }
    }
}
