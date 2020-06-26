#                    Reporte Practica 5

##                      Resumen 

Esta practica se realizo mayormente durante la sesion del jueves de la semana 6 a modo de repaso de todo lo visto en el curso hasta el momento, usando la programacion _MODULAR_ como eje principal de esta y realizando una **Calculadora** con las funciones de suma, resta, multiplicacion y division

##                      Desarrollo

La sesion comenzo con un repaso al temario para ver en que temas se iba a centrar el **segundo examen** del trimestre, entonces y como tema primordial la programacion _MODULAR_ el profesor decidio que se haria una **Calculadora** usando varios modulos, para disminuir el codigo contenido en el modulo principal o _main_, ello con lo siguiente:

* _leerNumero(Scanner):_ que se va a encaragar de recibir los datos o numeros de estrada para realizar las operaciones basicas y mandarlos a las variables dentro del modulo _main_ y que se pudieran pasar como parametros para otros modulos, opte por mandarle como parametro un objeto de la clase Scanner para no tener que generarlo dentro este modulo cada vez que se mandaba llamar.

* _imprimirResultado(double):_ este modulo imprime el resultado final de cada operacion en pantalla, como parametro se le envia el resultado final en forma de una variable de tipo _double_, este metodo no retorna ningun valor.

* _sumar(double,double):_ como lo indica su nombre, se encarga de sumar 2 numeros, como parametros recibe 2 variables de tipo _double_ y retorna un valor de tipo _double_ que es la suma de los 2 parametros recibidos previamente.

* _restar(double,double):_ como lo indica su nombre, se encarga de restar 2 numeros, como parametros recibe 2 variables de tipo _double_ y retorna un valor de tipo _double_ que es la resta de los 2 parametros recibidos previamente.

* _multiplicar(double,double):_ como lo indica su nombre, se encarga de multiplicar 2 numeros, como parametros recibe 2 variables de tipo _double_ y retorna un valor de tipo _double_ que es la multiplicacion de los 2 parametros recibidos previamente.

* _dividir(double,double):_ como lo indica su nombre, se encarga de dividir 2 numeros, como parametros recibe 2 variables de tipo _double_ y retorna un valor de tipo _double_ que es la division de los 2 parametros recibidos previamente.

Como parte adicional de la practica era realizar su respectivo _pseudocodigo_ y _diagrama de flujo_ en _PSeInt_ y anexarlo a la carpeta del repositorio de la **practica 5**.

Aqui como iniciativa decidi agregar un ciclo _while_ en el modulo _leerNumero_ para evitar recibir el numero **0** y asi evitar un error con la division por **0** en el modulo _dividir_, ademas de un condicional _if_ para que solo al escoger una de las primeras 4 opciones del menu de la calculadora, se soliciten primero los 2 numeros a operar antes de llegar a la sentencia _switch_ del codigo

##                        Resultados

Aqui solo exite la **Calculadora** por lo que los unicos archivos con este nombre son el _codigo fuente_, el archivo con el _pseudocodigo_ que contiene todos los modulos y el _diagrama de flujo_ principal o el correspondiente al modulo _main_, cada uno con su respectivo formato (.java, .png, .psc) y los _diagramas de flujo_ adicionales, cada uno a un modulo diferente y se especifica en el nombre a cual corresponden.

Aqui no se incluyo ningun algortimo ya que los _diagramas de flujo_ son lo bastante claros como para expresar que hace cada modulo.

##                        Discusion

Como repaso general y sobre todo de programacion _MODULAR_ esta practica funciono bastante bien, sin mencionar que este codigo puede ser reutilizable a futuro.

##                        Conclusion

Aqui todos los  objetivos fueron sencillos, claros y bastante faciles de cumplir. 