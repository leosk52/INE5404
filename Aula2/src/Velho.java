
public class Velho extends Imovel{

	double desconto=0.75;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void valorVelho() {
		
		System.out.println(preco*desconto);
	}
	
	
}
