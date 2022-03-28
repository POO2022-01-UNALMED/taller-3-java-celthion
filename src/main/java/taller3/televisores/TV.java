package taller3.televisores;


public class TV {
	
	private static int numTV;
	private Marca marca ;
	private boolean estado;
	private int canal=1;
	private int volumen=1;
	private int precio= 500 ;
	private Control control;
	
	public TV(Marca marca,boolean estado) {
		
		this.marca=marca;
		this.estado=estado;
		numTV += 1;
		
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public Marca getMarca() {
		
		return  marca;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	
	public Control getControl() {
		
		return  control;
	}	
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getPrecio() {
		
		return  precio;
	}	
	
	public void setVolumen(int volumen) {
		
		if(volumen>=0 && volumen<=7 && this.estado) {
			
			this.volumen=volumen;
		}
		
	}
	
	public int getVolumen() {
		
		return  volumen;
	}	
	
	public void setCanal(int canal) {
		
		if(canal>=1 && canal<=120 && this.estado) {
			
			this.canal=canal;
		}
		
	}
	
	public int getCanal() {
		
		return  canal;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	
	public static int getNumTV() {
		
		return  numTV;
	}	
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(canal<120 && estado) {
			canal +=1;
		}
		
	}
	
	public void canalDown() {
		if(canal>1 && estado) {
			canal -=1;
		}
		
	}
	
	public void volumenUp() {
		if(volumen<7 && estado) {
			volumen +=1;
		}
		
	}
	
	public void volumenDown() {
		if(volumen>0 && estado) {
			volumen -=1;
		}
		
	}
	
	

}
