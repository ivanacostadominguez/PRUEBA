
public abstract class Publicacion {
	
	private int iCodigo;
	private String sAutor;
	private String sTitulo;
	private int iAnioPublicacion;
	private boolean bPrestado;
	private boolean bConsultado;
	
	
	public Publicacion(int iCodigo, String sAutor, String sTitulo, int iAnioPublicacion) {
		setiCodigo(iCodigo);
		setsAutor(sAutor);
		setsTitulo(sTitulo);
		setiAnioPublicacion(iAnioPublicacion);
		setbPrestado(false);
		setbConsultado(false);
		
	}
	
	
	
	public String toString() {
	String sResultado = "";
	sResultado +="El codigo es: "+getiCodigo()+"\n";
	sResultado += "El autor es: "+getsAutor()+"\n";
	sResultado += "Titulo: "+getsTitulo()+"\n";
	sResultado += "Anio de publicacion: "+getiAnioPublicacion()+"\n";
	sResultado += "Prestado: "+isbPrestado()+"\n";
	
	return sResultado;
	}

	public int getiCodigo() {
		return iCodigo;
	}

	public void setiCodigo(int iCodigo) {
		this.iCodigo = iCodigo;
	}

	public String getsAutor() {
		return sAutor;
	}

	public void setsAutor(String sAutor) {
		this.sAutor = sAutor;
	}

	public String getsTitulo() {
		return sTitulo;
	}

	public void setsTitulo(String sTitulo) {
		this.sTitulo = sTitulo;
	}

	public int getiAnioPublicacion() {
		return iAnioPublicacion;
	}

	public void setiAnioPublicacion(int iAnioPublicacion) {
		this.iAnioPublicacion = iAnioPublicacion;
	}

	public boolean isbPrestado() {
		return bPrestado;
	}

	public void setbPrestado(boolean bPrestado) {
		this.bPrestado = bPrestado;
	}



	public boolean isbConsultado() {
		return bConsultado;
	}



	public void setbConsultado(boolean bConsultado) {
		this.bConsultado = bConsultado;
	}
	
	
	

}
