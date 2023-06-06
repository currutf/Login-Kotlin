# Login-Kotlin
Idea para inicio de sesión en una aplicación local para Android basada en Kotlin. Intenté dejar todo lo más práctico e intuitivo posible para quienes deseen utilizar el código.

En este inicio de sesión, tenemos 2 campos de texto y 2 donde el primero es "Validar". Este valida que los usuarios registrados en "validUsernames" de la lista que creamos sean correspondidos a "validPasswords". El orden es relativo a la secuencia, por ejemplo, Usuario1 es correspondiente únicamente a Clave1.
Después de validar, tenemos el botón "Iniciar sesión" el cual se muestra una vez que "Validar" completa su sentencia. La acción que tenemos al tocar "Iniciar sesión" es la transisión a la siguiente actividad "HomeActivity.kt".

#######################################

Explicación de conceptos breve para principiantes

#######################################

El uso de 2 botones es para no colapsar de funciones un botón. Por ejemplo, si quiséramos que el botón "Iniciar sesión" además de dar paso a la siguiente actividad, quisieramos que haga un tipo registro en nuestra BBDD local.
El tipo de inicio que utilizamos acá no se recomiendo para aplicaciones de gran escala, esto es funcional para proyectos pequeños o personales como administrar un negocio nuevo, ventas propias, etc.

Con los archivos .xml damos una interfaz al programa para que se pueda ejecutar y a su vez asociar botones a la actividad.
Con los archivos .kt generamos actividades, estas son las responsables de que todo lo gráfico (interfaz) tenga una función útil al interactuar con el usuario.
Básicamente, archivos .xml descritors en res>layout corresponden a todo lo que vemos, mientras que archivos .kt dentro de Java>paquete_de_la_app corresponden a todas las acciones que puede tener nuestra interfaz.

en res>values almacenamos todos los datos de importancia dentro de las palabras que utilizamos haciendo referencia a sus usos, p.ej arrays.xml hace referencia a los arreglos/listas que estamos utilizando. Strings a las cadenas de texto que queremos mostrar y Themes a las posibles composiciones gráficas que podemos integrar como temas claros, oscuros, custom, etc.
