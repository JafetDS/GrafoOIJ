package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

    Socket cliente;
    int puerto = 3334;
    String ip; // COMPLETAR
    BufferedReader entrada, teclado;
    PrintStream salida;

    public void iniciar (){
        try{
            cliente = new Socket(ip, puerto);
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            teclado = new BufferedReader(new InputStreamReader(System.in));
            String tec = teclado.readLine();
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(tec);
            String msg = entrada.readLine();
            System.out.println(msg);

            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();
        }catch (Exception e) {};
    }

}
