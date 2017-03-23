package examen;

import java.util.ArrayList;


/*YEEEEEEEE FRIKIIIII ;) ProsOfProgaming WAS HERE
 *Tornem a modificar 
 *
 *
 *yeeyeyeyeyey
 *w
 *erg
 *we
 *we
 *gwe
 *gwe
 *g
 */

public class mainExamen {
	public static paquete[] arrayP= new paquete[40];
	public static ArrayList<paquete> llistaPaquetes= new ArrayList<paquete>();
	
	//hola
	
	public static void estadisticas(){
		int mediaKM=0, contador=0;
		double anchoMaximo=0.00;
		String toString01="";
		for (int i=0; i<arrayP.length; i++){
			if (arrayP[i]!=null){
				contador++;
			}
			if (arrayP[i]!=null){
				mediaKM=mediaKM+arrayP[i].getKm();
			}
			if (arrayP[i]!=null && anchoMaximo<arrayP[i].getAncho()){
				anchoMaximo=arrayP[i].getAncho();
				toString01=arrayP[i].toString();
			}
			
		}
		if (contador!=0){ System.out.println("La media de KM es: "+(mediaKM/contador)+" km.");}
		System.out.println("El paquete con más anchura, tiene: "+anchoMaximo);
		System.out.println("El paquete con más anchura es: "+toString01);
	}
	
	public static void anchoMaximo(){
		
		
	}
	
	public static void main(String[] args) {
		
		//crear los paquetes
		paquete p1= new paquete("Valencia",80,0.60,0.80,0.90);
		paquete p2= new paquete("Alicante",100,1.20,0.20,0.25);
		paquete p3= new paquete("Castellon",200,0.20,0.40,0.20);
		paquete p4= new paquete("Benitatxell",10,0.20,0.10,0.10);
		paquete p5= new paquete("Denia",20,0.20,0.20,0.20);
		
		arrayP[0]=p1;
		arrayP[1]=p2;
		arrayP[2]=p3;
		arrayP[3]=p4;
		arrayP[4]=p5;
	
		llistaPaquetes.add(p1);
		llistaPaquetes.add(p2);
		llistaPaquetes.add(p3);
		llistaPaquetes.add(0,p4);
		
		llistaPaquetes.remove(llistaPaquetes.get(2));
		llistaPaquetes.clear();
		
		
		estadisticas();

	}

}
