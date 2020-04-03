/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumadorImpl;

/**
 *
 * @author webdev
 */
public interface Sumador extends java.rmi.Remote
{
public int sumar(int a, int b)
throws java.rmi.RemoteException;
}