package servidor;

public class iniServUDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pantalla p = null;
		UDPServidor udp=new UDPServidor(p);
		udp.run();
		

	}

}
