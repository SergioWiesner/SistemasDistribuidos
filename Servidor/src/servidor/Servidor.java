package servidor;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;

public class Servidor {

    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        //puerto de nuestro servidor
        final int PUERTO = 5000;
        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");
            //Siempre estara escuchando peticiones
            while (true) {
                //Espero a que un cliente se conecte
                sc = servidor.accept();
                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                //Leo el mensaje que me envia
                String mensaje = in.readUTF();

                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha = null;
                try {
                    fecha = formatoDelTexto.parse(mensaje);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(fecha); 
                    calendar.add(Calendar.DAY_OF_YEAR, 10);  
                    fecha = calendar.getTime(); 
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
                
                //Le envio un mensaje
                out.writeUTF(fecha.toString());
                //Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
