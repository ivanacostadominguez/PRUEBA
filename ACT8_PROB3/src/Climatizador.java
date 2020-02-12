
public class Climatizador {

	private boolean bEncendido;
	private float temperaturaActual;
	private float temperaturaDeseada;
	
	
	public Climatizador (boolean bEncendido, float temperaturaActual, float temperaturaDeseada) {
		setbEncendido(bEncendido);
		setTemperaturaActual(temperaturaActual);
		setTemperaturaDeseada(temperaturaDeseada);
		
	}
	
	
	
	public String activar() {
		
		String sResultado="";
		while (getTemperaturaActual()<getTemperaturaDeseada()) {
			Calentar();
			sResultado+="Subiendo la temperatura \n";
		}
		
		while (getTemperaturaActual()>getTemperaturaDeseada()) {
			Enfriar();
			sResultado+="Disminuyendo la temperatura \n";
		}
		
		
		return sResultado;
		
	}
	
	
	public String desactivar() {
		String sResultado="Dispositivo apagado";
		setbEncendido(false);
		return sResultado;
	}
	
	
	
	
	
	public void Enfriar () {
		setTemperaturaActual((float)(getTemperaturaActual()-0.5));
	}
	
	
	public void Calentar () {
		setTemperaturaActual((float)(getTemperaturaActual()+0.5));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	public boolean isbEncendido() {
		return bEncendido;
	}


	public void setbEncendido(boolean bEncendido) {
		this.bEncendido = bEncendido;
	}


	public float getTemperaturaActual() {
		return temperaturaActual;
	}


	
	public void setTemperaturaActual(float temperaturaActual) {
		if(isbEncendido()==false) {
		this.temperaturaActual = temperaturaActual;
		}
	}


	public float getTemperaturaDeseada() {
		return temperaturaDeseada;
	}


	public void setTemperaturaDeseada(float temperaturaDeseada) {
		if(isbEncendido()==false) {
		this.temperaturaDeseada = temperaturaDeseada;
		}
	}


	public String toString() {
	String sResultado = "";
	sResultado +="Estado: " +isbEncendido()+"\n";
	sResultado += "Temperatura actual: " + getTemperaturaActual() + "\n";
	sResultado += "Temperatura establecida: " + getTemperaturaDeseada() + "\n";
	
	return sResultado;
	}
	
	
	
	
	
	
	
}
