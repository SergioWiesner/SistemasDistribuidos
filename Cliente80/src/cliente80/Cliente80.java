package cliente80;
import java.net.*;
import java.io.*;
public class Cliente80 {
    public static void main(String[] args) {
        
        String server = "codwelt.com";
     

        System.out.println( "Loading contents of URL: " + server );

        try
        {
            try (Socket socket = new Socket( server, 80 )) {
                PrintStream out = new PrintStream( socket.getOutputStream() );
                BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
                out.println( "GET " + server + " HTTP/1.0" );
                out.println();
                String line = in.readLine();
                while( line != null )
                {
                    System.out.println( line );
                    line = in.readLine();
                }
                in.close();
                out.close();
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
    
}
