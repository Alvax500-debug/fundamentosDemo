#                    Reporte Practica 1

8. Se utiliza el comando `git clone tipo_url`, donde el **_tipo_url_** varia dependiendo del tipo de clonado que se hara al repositorio, ya sea via **http** (autenticacion de usuario mediante logueo en el shell) o via **ssh** (autenticado via clave ssh generada por la maquina que se esta usando y que se registra en la cuenta de github del usuario).

9. Se usa el comando `git pull` para actualizar el repositorio local con los cambios que se subieron al repositorio almacenado en github.

10. Posiblemente haya algun conflicto si es que el archivo que modificaste ya habia sido modificaco por alguien mas, en cuyo caso se debe revisar cuales serian los cambios y arreglar los posibles conflictos, para posteriormente subir los cambios o usar el comando `git stash` antes de usar `git pull`.