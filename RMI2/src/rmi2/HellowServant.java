/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author webdev
 */
public class HellowServant extends UnicastRemoteObject implements HelloService {

    public HellowServant() throws RemoteException {
        super();
    }

    public String echo(String input) throws RemoteException {
        return "Servidor desde : " + input;
//  throw new UnsupportedOperationException("No soportado todavia.");
    }
;
}
