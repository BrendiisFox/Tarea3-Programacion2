
public class Animal {
	
	//Declaro las variables.
	String nombre;	
	String ladrar;
	String maullar;
	String hablar;
	int edad;
	
	//Se realiza la funcion Animal
	Animal(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//Se realiza la funcion nombre
	String getNombre()
	{
		return nombre;
	}
	
	//Se realiza la funcion edad
	int getEdad()
	{
		return edad;
	}
	

	void setNombre(String nombre)
	{
		this.nombre =nombre;
	}
	
	
	void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	
}