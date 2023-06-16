package com.bootcamp.sprintBootEjercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

   public String[] nombres = new String[10];
   public int contadorRegistros = 0; // variable que permite llevar el control de los que se registran y elimina

    @GetMapping("/buscar-usuario/{nombreUsuario}")
    public String buscarUsuarios(@PathVariable String nombreUsuario) {

        String busqueda;

        // se recibe el resultado de la busqueda
        busqueda = resultados(nombreUsuario,nombres);

        if(busqueda.isEmpty()) busqueda = "No se encontro el registro";

        return "------------------------------<br>"+
                   "Resultado de la busqueda<br>"+
                   "------------------------------<br>"+
                   busqueda;
    }

    /*
    Este metodo se encarga de encontrar todos los resultado y devolverlos como un string
    concatenados, de lo contrario manda un vacio
     */
    public String resultados (String busqueda, String[] nombres) {

        String resultadoNombre = "";

            for (int index=0;index<contadorRegistros;index++) {

                String nombre = nombres[index];

                if (nombre.toLowerCase().contains(busqueda.toLowerCase())) {
                    resultadoNombre += nombre + "<br>";
                }
            }

        return resultadoNombre;
    }

    @GetMapping("/agregar-usuario/{nombreUsuario}")
    public String agregarUsuario(@PathVariable String nombreUsuario){

        String busqueda;

        // se recibe el resultado de la busqueda
        busqueda = resultados(nombreUsuario,nombres);

        // si esta vacio el String es porque no se agregado ese nombre y se procede a guardarlo
        if(busqueda.isEmpty()) {
            nombres[contadorRegistros] = nombreUsuario;
            contadorRegistros++;

            return "--------------------------------------<br>"+
                    "Se ha registrado exitosamente a: <br>"+
                    "-----------------------------------------<br>"+
                    nombreUsuario+"<br>";
        }

        return "Usuario ya registrado";
    }


    /*
     esta funcion me permite realizar lo mismo que resultado(), pero no retorna el String con el nombre,
     sino la posicion en el arreglo, en caso de no encontrarlo retorna -1.
    */
    public int resultadoIndice (String busqueda, String[] nombres) {

        int indiceEncontrado = -1;

        for (int index=0;index<contadorRegistros;index++) {

            if (nombres[index].toLowerCase().contains(busqueda.toLowerCase())) {
                indiceEncontrado = index;
                break;
            }
        }
        return indiceEncontrado;
    }

    @GetMapping("/eliminar-usuario/{nombreUsuario}")
    public String eliminarUsuario(@PathVariable String nombreUsuario) {

        int indiceEliminar;

        // se recibe el indice de la busqueda
        indiceEliminar = resultadoIndice(nombreUsuario,nombres);

        if (indiceEliminar == -1) return "Usuario no registrado";

        // se asigna lo que trae el arreglo temporal al arreglo nombres, para que se actulice.
        nombres = copiaTemporal(indiceEliminar,nombres);

        return  "Usuario eliminado";
    }

    /*
    Este metodo cumple la funcion de crear un arreglo temporal, que almacena los nombres
    excepto el que se quiere eliminar, a partir de ignorar la posición que sea igual al indiceEliminar

    @return el arreglo temporal
     */
    public String[] copiaTemporal(int indiceEliminar, String[] nombres) {

        String[] temporal = new String[nombres.length];

        /*
        Usando la variable contadorRegistros, evitamos tener que recorrer todo el arreglo.
        solo se itera con la cantidad de registros que se lleven en el momento
         */
        for (int index1=0,index2=0; index1 < contadorRegistros;index1++) {

            // si son diferentes entra ha agregar el nombre en el temporal
            if(index1 != indiceEliminar) {
                temporal[index2] = nombres[index1];
                index2++;
            }
        }

        // se debe disminuir, ya que la cantidad de registros ha disminuido
        contadorRegistros--;

        return temporal;
    }


}
