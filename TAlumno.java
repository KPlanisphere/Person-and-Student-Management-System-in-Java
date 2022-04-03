//---------> TAlumno

class TAlumno extends TPersona{
	//ATRIBUTOS
	private String matricula,carrera,correo;
	
	//METODOS CONSTRUCTORES
	TAlumno(){
		super(); //MANDO A LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
		matricula = carrera = correo = "";
		
	}
	
	TAlumno(String nombre, int edad,String curp, 
	String matricula, String carrera, String correo){
		super(nombre,edad,curp);
		setMatricula(matricula);
		setCarrera(carrera);
		setCorreo(correo);
	}
	
	//METODOS SET
	public void setMatricula(String matricula){
		this.matricula = matricula;
		
	}
	
	public void setCarrera(String carrera){
		this.carrera = carrera;
	}
	
	public void setCorreo(String correo){
		this.correo = correo;
	}
	
	//METODOS GET
	public String getMatricula(){
		return matricula;
	}
	
	public String getCarrera(){
		return carrera;
	}
	
	public String getCorreo(){
		return correo;
	}
	
	//METODOS DIVERSOS
	@Override //SOBREESCRITURA DEL METODO DE LA CLASE PADRE
	public String toString(){
		String cadena;
		
		cadena = super.toString() + "Matricula: " + matricula + "\n" +
		"Carrera: " + carrera + "\n" + "Correo: " + correo + "\n";
		
		return cadena;
	}
}//FIN DE LA CLASE
