/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.clientw;

import SumadorImpl.Sumador;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;

public class SumadorClient {

    public static void main(String args[]) {
        int res = 0;
        try {
            System.out.println("Buscando Objeto ");
            Sumador misuma = (Sumador) Naming.lookup("rmi://" + args[0] + "/" + "MiSumador");
            res = misuma.sumar(5, 2);
            System.out.println("5 + 2 = " + res);
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.err.println(" System exception");
        }
        System.exit(0);
    }
}
