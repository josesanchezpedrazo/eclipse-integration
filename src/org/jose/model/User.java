package org.jose.model;
/*
 * Para crear un proyecto git:
 * 1- Creamos proyecto java o maven tal cual queramos.
 * 2- Boton derecho sobre el proyecto - team - share project.
 * 3- Abrir vista project explorer y editar el .gitignore con los archivos que no queramos sincronizar.
 * 4- Hacer primer commit pulsando boton derecho sobre proyecto - team - commit.
 * 
 * 
 * Para crear getters y setters de forma automatica asi como un to string, boton derecho sobre la clase - source - Generate ....
 * 
 * Para ver historico de commits debemos abrir la vista "history"
 * 
 * */
public class User {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
