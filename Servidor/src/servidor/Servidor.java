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
        final int PUERTO = 43;
        
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");
            while (true) {
                sc = servidor.accept();
                System.out.println("Cliente conectado");
                
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                FileWriter flwriter = null;
                flwriter = new FileWriter("C:\\Users\\webdev\\Documents\\NetBeansProjects/prueba.txt");
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                
                String mensaje = in.readUTF(); 
                bfwriter.write("CLIENTE: fecha de hoy "+mensaje+"\n");
                String fecha = agrega10DiasFechas(mensaje);
                bfwriter.write("SERVIDOR: se le ha agregado 10 dias más "+fecha+"\n");
                out.writeUTF(fecha);
                mensaje = in.readUTF(); 
                bfwriter.write("CLIENTE:  "+mensaje+"\n");
                sc.close();
                bfwriter.close();
		System.out.println("Archivo creado satisfactoriamente..");
                System.out.println("Cliente desconectado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String agrega10DiasFechas(String fechamensaje) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;
        try {
            fecha = formatoDelTexto.parse(fechamensaje);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fecha);
            calendar.add(Calendar.DAY_OF_YEAR, 10);
            fecha = calendar.getTime();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return fecha.toString();
    }
}
