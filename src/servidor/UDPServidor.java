package servidor;


 
import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JTextPane;
 class UDPServidor
 {
	 Pantalla pantalla;
	
	 public UDPServidor(Pantalla pantalla){
		 this.pantalla=new Pantalla();
		 this.pantalla.setVisible(true);
		 this.pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
 
public void run() 
 {

 System.out.println("El servidor va a ponerse a la escucha, un momento mientras se leen los parametros");
 int port = 5000;
 this.pantalla.setPantalla("Escuchando en puerto "+port);
 DatagramSocket socketServidor = null;
 try {
 socketServidor = new DatagramSocket(port);
 } catch (IOException e)
 {
 System.out.println("Error al crear el objeto socket servidor");
 System.exit ( 0 );
 }
 byte [] recibirDatos = null; 
 //byte [] enviarDatos = new byte[1024];
 String fraseAux="";
//byte [] enviarDatos2 = new byte[1024];

 while(true && !fraseAux.equals("FIN"))
 {

recibirDatos=new byte[1024];
fraseAux=null;
 DatagramPacket recibirPaquete =null;

 recibirPaquete=new DatagramPacket(recibirDatos, recibirDatos.length);
 try {        socketServidor.receive(recibirPaquete);
 } catch (IOException e)
 {
 System.out.println("Error al recibir");
 System.exit ( 0 );
 }
 String frase = null;
 frase=new String(recibirPaquete.getData());
 //frase=frase.substring(0,frase.lastIndexOf(";"));
 //InetAddress DireccionIP = recibirPaquete.getAddress();
 //int puerto = recibirPaquete.getPort();
 
 
 /*String fraseMayusculas = frase.toUpperCase();
 enviarDatos = fraseMayusculas.getBytes();
 DatagramPacket enviarPaquete = new DatagramPacket(enviarDatos, enviarDatos.length, DireccionIP, puerto);*/
 //http://www.redeszone.net/2010/11/23/taller-de-practicas-cliente-y-servidor-udp-en-java/
 
 fraseAux=frase;
 
 System.out.println(fraseAux);
 
 this.pantalla.setPantalla(fraseAux);
 //this.pantalla.repaint();
 }
 }
 }
 

