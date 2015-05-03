package webservice;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService
@Stateless
public class Randon {
	public double next(double max){
		return Math.random()*max;
	}
}
