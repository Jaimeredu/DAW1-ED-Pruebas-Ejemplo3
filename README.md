# DAW1-ED-Pruebas-Ejemplo3
> Exámen del día 11 Febrero 2019 resuelto


## Pruebas unitarias en **Java** con **JUnit4** (Gradle)

### Código a testear (pruebas de unidad)

El código de la aplicación lo componen 3 clases:

- Main  (Clase principal)
- Fraccion
- Texto

La clase Main es la que hace uso de los métodos definidos en Fraccion y Texto, y debe ser creada por el alumno/a.

Dentro de **Fraccion** tenemos 2 métodos estáticos:
- `double mitad(int numero)`
- `double tercio(int numero)`
 
Dentro de **Texto** tenemos 3 métodos estáticos:
- `String minusculas(String texto)`
- `String mayusculas(String texto)`
- `String textoInvertido(String texto)`

### Requisitos

Este proyecto se ha desarrollado en Netbeans con el sistema de construcción **Gradle**. Por tanto es necesario tener instalado el plugin para `Gradle` instalado en Netbeans.

Además, si queremos hacer cobertura de código, deberemos editar el archivo `build.gradle`. Debemos insertar las siguientes líneas:

```
apply plugin: 'jacoco'

jacocoTestReport {
    reports {
        xml.enabled false
        csv.enabled false
        html.destination file("${buildDir}/jacocoHtml")
    }
}
```



### Clases de prueba

Las clases de prueba son:

- MainTest
- FraccionTest
- TextoTest

Se ha probado también el constructor por defecto, con la finalidad de que el informe de cobertura fuera del 100%.

### Ejecución de pruebas

Para ejecutar las pruebas sobre el código, ejecutaremos en el terminal de texto:

```
gradle  test
```

### Informe de cobertura

Para generar el informe de cobertura ejecutamos en el terminal de texto:

```
gradle  jacocoTestReport
```

Este comando debe ejecutarse desde la misma carpeta en la cuál tenemos el archivo `build.gradle`.

Para ver el informe de cobertura generado en formato HTML, ejecutamos desde el terminal de texto:

```
firefox   build/jacocoHtml/index.html
```

