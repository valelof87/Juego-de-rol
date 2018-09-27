
public class Barbaro extends Personaje {
	protected boolean espadaMetal;
	
	public boolean isEspadaMetal() {
		return espadaMetal;
	}
	
	public void setEspadaMetal( boolean espadaMetal) {
		this.espadaMetal = espadaMetal;
	}
	
	@Override
	public int getValorAtaque() {
//		if(isEspadaMetal()) {
//			return super.getValorAtaque() * 2;
//		}
//		return super.valorAtaque;
		return (isEspadaMetal()) ? super.getValorAtaque() * 2 : super.getValorAtaque();
	}
	
	
	@Override
	public int getValorDefensa() {
		return super.getValorDefensa() ;
	}
	
	@Override
	public void setValorDefensa(int valorDefensa) {
		this.getValorDefensa ();
	}
}
