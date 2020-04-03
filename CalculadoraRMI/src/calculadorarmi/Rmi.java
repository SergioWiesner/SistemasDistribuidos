/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author webdev
 */
public class Rmi extends UnicastRemoteObject implements Calculadora {

    public Rmi() throws RemoteException {
        super();
        System.out.println("pasa por acá.");
        int a, b;
    }

    @Override
    public int div(int a, int b) throws RemoteException {
        return a / b;
    }

    @Override
    public int mult(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int sum(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int rest(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int raizCuadrada(int b) throws RemoteException {
        return (int) Math.sqrt(b);
    }

    @Override
    public int potencia(int a, int b) throws RemoteException {
        return (int) Math.pow(a, b);
    }

    @Override
    public double logaritmo(int b) throws RemoteException {
        return Math.log(b);
    }

    @Override
    public double seno(int b) throws RemoteException {
        return Math.sin(b);
    }

    @Override
    public double coseno(int b) throws RemoteException {
        return Math.cos(b);
    }

    @Override
    public double tangente(int b) throws RemoteException {
        return Math.tan(b);
    }

}
