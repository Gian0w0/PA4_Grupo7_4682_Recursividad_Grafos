# Actividad 1 – Recursividad aplicada

**Responsable:** Joseph Gianmarco Soberon Leon  
**Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial  
**Evaluación:** PA4 – Grupo 7

## 1. Descripción del problema

Una institución educativa necesita desarrollar un sistema inteligente de orientación dentro de su campus.

Para esta actividad, se propone un algoritmo recursivo que permita buscar un aula dentro de una estructura jerárquica formada por edificios y salones.

El objetivo es determinar si un aula se encuentra registrada dentro del campus utilizando recursividad.

## 2. ¿Qué es la recursividad?

La recursividad es una técnica de programación en la que una función se llama a sí misma para resolver un problema.

Se relaciona con el principio de divide y vencerás porque permite descomponer un problema grande en problemas más pequeños.

En nuestro caso, la búsqueda general dentro del campus se divide en búsquedas dentro de sus edificios y respectivas aulas.

## 3. Algoritmo propuesto

Se implementó un algoritmo recursivo en Java que permite buscar aulas dentro de una estructura jerárquica.

El algoritmo comienza revisando el campus. Si la ubicación actual coincide con el aula buscada, devuelve verdadero.

En caso contrario, continúa revisando recursivamente las sububicaciones hasta encontrar el aula o terminar la búsqueda.

### Pseudocódigo

```text
FUNCIÓN buscarAula(ubicacion, aulaBuscada)

    SI ubicacion.nombre == aulaBuscada ENTONCES
        RETORNAR VERDADERO
    FIN SI

    PARA CADA lugar EN ubicacion.sububicaciones
        SI buscarAula(lugar, aulaBuscada) ENTONCES
            RETORNAR VERDADERO
        FIN SI
    FIN PARA

    RETORNAR FALSO

FIN FUNCIÓN
```

## 4. Identificación de los casos

**Caso base:** cuando encontramos el aula buscada, el algoritmo devuelve verdadero. Si una ubicación no coincide y no contiene otras ubicaciones, devuelve falso.

**Caso recursivo:** cuando una ubicación contiene otras ubicaciones, la función se llama nuevamente para revisar cada una.

**Condición de finalización:** la búsqueda termina cuando se encuentra el aula solicitada o cuando todas las ubicaciones han sido examinadas sin encontrarla.

## 5. Ejemplo de funcionamiento

Para comprobar el algoritmo, se construyó un campus de ejemplo con la siguiente estructura:

- Campus
  - Edificio A
    - Aula A101
    - Aula A102
  - Edificio B
    - Aula B201
    - Aula B202

Al buscar el Aula B202, el algoritmo revisa las ubicaciones hasta encontrarla y devuelve verdadero.

Si se busca el Aula C301, que no está registrada, el algoritmo devuelve falso después de revisar todas las ubicaciones.

## 6. Pruebas realizadas

El algoritmo fue implementado y ejecutado en IntelliJ IDEA.

| Aula buscada | Resultado obtenido | Estado |
|---|---|---|
| Aula B202 | true | Correcto |
| Aula C301 | false | Correcto |
| Aula A101 | true | Correcto |
| Aula B201 | true | Correcto |

Las cuatro pruebas mostraron los resultados esperados.

Además, se incorporaron mensajes en consola para visualizar las ubicaciones revisadas durante la ejecución del algoritmo.

## 7. Justificación técnica

La recursividad facilita el procesamiento de estructuras jerárquicas porque permite utilizar el mismo procedimiento para revisar distintos niveles.

En este caso, el algoritmo permite identificar si un aula está registrada dentro del campus.

La implementación no determina la ruta más corta ni el recorrido óptimo entre ubicaciones. Estos aspectos corresponden al análisis de grafos desarrollado en la Actividad 3.

## 8. Conclusión

La aplicación de recursividad permitió desarrollar un algoritmo capaz de buscar aulas dentro de una estructura jerárquica.

Mediante el caso base y el caso recursivo, se consiguió resolver el problema de manera organizada, demostrando la utilidad de esta técnica en el procesamiento de información relacionada con un campus educativo.
