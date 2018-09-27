
public class Juego {

	public static void main(String[] args) {
		
		
		Mago mago = new Mago();
		Barbaro barbaro = new Barbaro();
		Arquera arquera = new Arquera ();
		
		mago.energia = 100;
		mago.valorAtaque = 50;
		mago.valorDefensa = 80;
		
		barbaro.valorAtaque= 60;
		barbaro.valorDefensa = 500;
		barbaro.espadaMetal = true;
		
		arquera.valorDefensa = 80;
		arquera.valorAtaque = 100;
		arquera.ataqueExitoso = 2;
		
		
		System.out.println(mago.getValorAtaque());
		System.out.println(mago.getValorDefensa());
		
		System.out.println(barbaro.getValorAtaque());
		System.out.println(barbaro.getValorDefensa());
		
		System.out.println(arquera.getValorAtaque());
		System.out.println(arquera.getValorDefensa());
		

	}

}
