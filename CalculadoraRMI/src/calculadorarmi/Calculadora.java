/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author webdev
 */
public interface Calculadora extends Remote {

    public int div(int a, int b) throws RemoteException;

    public int mult(int a, int b) throws RemoteException;

    public int sum(int a, int b) throws RemoteException;

    public int rest(int a, int b) throws RemoteException;

    public int raizCuadrada(int b) throws RemoteException;

    public int potencia(int a, int b) throws RemoteException;

    public double logaritmo(int b) throws RemoteException;

    public double seno(int b) throws RemoteException;

    public double coseno(int b) throws RemoteException;

    public double tangente(int b) throws RemoteException;
}
