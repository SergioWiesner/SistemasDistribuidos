package cliente13;

import java.net.*;
import java.io.*;

public class Cliente13 {
 
    public static void main(String[] args) {
        String hostname = "time.nist.gov";
        int port = 13;
 
        try (Socket socket = new Socket(hostname, port)) {
 
            InputStream input = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
 
            int character;
            StringBuilder data = new StringBuilder();
 
            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
 
            System.out.println("FECHA "+data);
 
 
        } catch (UnknownHostException ex) {
 
            System.out.println("Servidor no encontrado: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}