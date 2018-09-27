
public class Arquera extends Personaje {
	protected int ataqueExitoso;
	
	public void setAtaqueExitoso(int ataqueExitoso) {
		this.ataqueExitoso = ataqueExitoso;
	}
	
	public int getAtaqueExitoso() {
		return ataqueExitoso;
	}
	
	@Override
	public int getValorAtaque() {
		if(getAtaqueExitoso()> 0) {
			return super.getValorAtaque() * getAtaqueExitoso();
		}
		return super.getValorAtaque();
	}
	
	@Override
	public int getValorDefensa() {
		if (getAtaqueExitoso ()> 0) {
			return super.getValorDefensa() / getAtaqueExitoso();
		}
		return super.getValorDefensa();
	}
}
