//--------> TPersona

class TPersona{
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private String curp;
	
	//METODOS
	TPersona(){
		nombre = "";
		edad = 0;
		curp = "";
	}
	
	TPersona(String nombre, int edad,String curp){
		setNombre(nombre);
		setEdad(edad);
		setCurp(curp);
	}
	
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public void setCurp(String curp){
		this.curp = curp;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getCurp(){
		return curp;
	}
	
	@Override
	public String toString(){
		String cadena;
		
		cadena = "Nombre: " + nombre + "\n" + 
		"Edad: " + Integer.toString(edad) + "\n" + 
		"CURP: " + curp + "\n";
		return cadena;
	}
}//FIN CLASE TPersona
