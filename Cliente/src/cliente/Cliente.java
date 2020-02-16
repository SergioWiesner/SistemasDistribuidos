package cliente;

import java.io.*;
import java.net.Socket;
import java.text.*;
import java.util.*;
import java.util.logging.*;

public class Cliente {

    public static void main(String[] args) {
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            //Envio un mensaje al cliente
            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");             
            out.writeUTF(dateFormat.format(date));
            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            out.writeUTF("Fecha con 10 dias más.");
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
