/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.server;

import java.rmi.*;
import java.rmi.server.*;
import SumadorImpl.SumadorImpl;

public class SumadorServer {

    public static void main(String args[]) {
        try {
            SumadorImpl misuma = new SumadorImpl("MiSumador");
        } catch (Exception e) {
            System.err.println("System exception" + e);
        }
    }
}
