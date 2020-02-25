package cliente43;

import java.net.*;
import java.io.*;

public class Cliente43 {
   public final static int DEFAULT_PORT = 43;

  public final static String DEFAULT_HOST = "whois.internic.net";
    public static void main(String[] args) throws UnknownHostException, IOException {
     
    String serverName = System.getProperty("WHOIS_SERVER", DEFAULT_HOST);
    InetAddress server = null;
    server = InetAddress.getByName(serverName);
    Socket theSocket = new Socket(server, DEFAULT_PORT);
    Writer out = new OutputStreamWriter(theSocket.getOutputStream(), "8859_1");
    out.write("\r\n");
    out.flush();
    InputStream raw = theSocket.getInputStream();
    InputStream in = new BufferedInputStream(theSocket.getInputStream());
    int c;
    while ((c = in.read()) != -1)
      System.out.write(c);
  }
    }
