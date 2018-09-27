
public class Mago extends Personaje {
	protected int energia;
	
	
	@Override
	public int getValorAtaque() {
		if(energia == 100) {
			return super.getValorAtaque() * 10;
		}
		return super.getValorAtaque();
	}
	
	@Override
	public int getValorDefensa() {
		if(energia == 100 ) {
			return super.getValorDefensa() /2;
		}
		return super.valorDefensa;
	}
}
