package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

	@WebMethod(operationName = "ConversionEuroToDH")
	public double conversion(@WebParam(name="montant") double mt) {
		return 11.4*mt;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") int code) {
		Compte cp = new Compte(code, Math.random()*9000, new Date());
		return cp;
	}
	
	@WebMethod
	public List<Compte> listeComptes() {
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1, Math.random()*9000, new Date()));
		comptes.add(new Compte(2, Math.random()*9000, new Date()));
		comptes.add(new Compte(3, Math.random()*9000, new Date()));
		
		return comptes;
	}
}
