package examen;

public class paquete {
	static int auto=0;
	private int ident=++auto;
	private String destino;
	private int km;
	private double[] arrayDim= new double[3];
	
	public paquete(String destino, int km, double largo, double ancho, double alto){
		this.destino=destino;
		this.km=km;
		this.arrayDim[0]=largo;
		this.arrayDim[1]=ancho;
		this.arrayDim[2]=alto;
	}
	
	
	public double getLargo(){
		return this.arrayDim[0];
	}
	
	public double getAncho(){
		return this.arrayDim[1];
	}
	
	public double getAlto(){
		return this.arrayDim[2];
	}
	
	public void setLargo(double largo) {
		this.arrayDim[0]= largo;
	} 
	
	public void setAncho(double ancho) {
		this.arrayDim[1]= ancho;
	} 
	
	public void setAlto(double alto) {
		this.arrayDim[2]= alto;
	} 
	
	
	public int getIdent() {
		return ident;
	}


	public void setIdent(int ident) {
		this.ident = ident;
	}


	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}


	public String toString(){
		return "==========="+
				"\nIdent: "+this.ident+
				"\nKm: "+this.km+
				"\nLargo: "+this.arrayDim[0]+
				"\nAncho: "+this.arrayDim[1]+
				"\nAlto: "+this.arrayDim[2];
	}
	

} //tanque el paquete
