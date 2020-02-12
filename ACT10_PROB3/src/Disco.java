
public class Disco extends Publicacion implements iPublicacion, iPrestable, iConsultable {
	
	public Disco(int iCodigo, String sAutor, String sTitulo, int iAnioPublicacion) {
		
		super(iCodigo, sAutor, sTitulo, iAnioPublicacion);
	}


	@Override
	public void prestar() {
		// TODO Auto-generated method stub
		if(isbPrestado()==false) {
			setbPrestado(true);
		}
		
		else {
			setbPrestado(true);
		}
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		if(isbPrestado()==true) {
			setbPrestado(false);
		}
		
		else {
			setbPrestado(false);
		}
	}

	@Override
	public void estaPrestado() {
		// TODO Auto-generated method stub
		isbPrestado();
		// ESTO NO TIENE SENTIDO YA QUE SI ESTA FUNCION NO DEVUELVE NADA Y SOLO COMPRUEBA SE PONE EN EL TOSTRING
		
	}


	@Override
	public void retirar() {
		// TODO Auto-generated method stub
		if(isbConsultado()==false) {
			setbConsultado(true);
		}
		
		else {
			setbConsultado(true);
		}
		
	}


	@Override
	public void estaConsultando() {
		// TODO Auto-generated method stub
		isbConsultado();
		// ESTO NO TIENE SENTIDO YA QUE SI ESTA FUNCION NO DEVUELVE NADA Y SOLO COMPRUEBA SE PONE EN EL TOSTRING
		
	}


	@Override
	public void devolverConsulta() {
		// TODO Auto-generated method stub
		if(isbConsultado()==true) {
			setbConsultado(false);
		}
		
		else {
			setbConsultado(false);
		}
		
	}
}
