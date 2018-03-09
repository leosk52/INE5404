
public class Novo extends Imovel {

	double adicional=20000;
	
	public void valorNovo() {
		System.out.println(adicional + preco); 
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	
	
}
