# Welcome to eclipse-integration
Pluralsight eclipse course


Para crear un proyecto git:
1- Creamos proyecto java o maven tal cual queramos.
2- Boton derecho sobre el proyecto - team - share project.
3- Abrir vista project explorer y editar el .gitignore con los archivos que no queramos sincronizar.
4- Hacer primer commit pulsando boton derecho sobre proyecto - team - commit.

Para crear getters y setters de forma automatica asi como un to string, boton derecho sobre la clase - source - Generate ....

Para ver historico de commits debemos abrir la vista "history"

Para crear una rama, usando la vista "history", boton derecho a partir del commit y create new branch

Para hacer un merge, hacemos chekcout de la rama destino, y seleccionamos el "commit" de la rama origen a mergear.

Al hacer un merge puede haber conflictos, para solucionarlos, lo que debemos hacer es boton derecho en el archivo con
conflictos - team - merge tool. Pasamos a la parte de la izda lo que queramos que hay en la derecha. Guardamos y listo.

Luego podremos hacer el merge correctamente sin problemas. 

Para configurar un repositorio remoto, debemos abrir la vista de "Git repositories", boton derecho en "Remotes" y
añadimos el repo, user name y pass. Una vez hecho esto pulsamos en "advance" y decimos de sincronizar tanto las
branches como los tags.
