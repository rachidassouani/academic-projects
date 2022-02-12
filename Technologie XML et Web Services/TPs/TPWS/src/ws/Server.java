package ws;

import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {
		
		BanqueService ws = new BanqueService();		
		
		String url = "http://0.0.0.0:8086/";
		Endpoint.publish(url, ws);
		
		System.out.println("Web service déployé sur : " + url);
	}

}
