
# ACTIVIDAD 2 – ORDENAMIENTO RECURSIVO

**Responsable:** Claudio García Pérez  
**Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial  
**Evaluación:** PA4  
**Equipo:** Grupo 7

---

## 1. Introducción

El ordenamiento recursivo es una técnica que permite organizar un conjunto de datos mediante procedimientos que se llaman a sí mismos para resolver partes más pequeñas del problema.

En esta actividad se utilizará el algoritmo Merge Sort (ordenamiento por mezcla), aplicándolo a un conjunto de ubicaciones de una institución educativa.

El propósito es organizar alfabéticamente los nombres de las diferentes instalaciones del campus, facilitando la búsqueda y consulta de información dentro del sistema inteligente de orientación.

## 2. Descripción del problema

La institución educativa cuenta con diferentes ubicaciones dentro de su campus, como aulas, biblioteca, auditorio, cafetería y laboratorios.

Para que el módulo inteligente de orientación pueda consultar esta información de manera organizada, se necesita ordenar los nombres de las ubicaciones alfabéticamente.

Se utilizará Merge Sort porque permite dividir el conjunto de datos en partes más pequeñas, ordenarlas recursivamente y finalmente combinarlas para obtener una lista ordenada.

### 2.1. Datos iniciales

El conjunto de ubicaciones se encuentra inicialmente desordenado:

1. Biblioteca
2. Laboratorio
3. Auditorio
4. Cafetería
5. Aulas
6. Enfermería
7. Gimnasio
8. Administración

### 2.2. Resultado esperado

Después de aplicar el algoritmo, las ubicaciones quedarán organizadas alfabéticamente:

1. Administración
2. Auditorio
3. Aulas
4. Biblioteca
5. Cafetería
6. Enfermería
7. Gimnasio
8. Laboratorio

## 3. Algoritmo Merge Sort

### 3.1. ¿Qué es Merge Sort?

Merge Sort es un algoritmo de ordenamiento basado en el principio divide y vencerás.

Su funcionamiento consiste en dividir una lista en dos partes, ordenar cada parte mediante llamadas recursivas y combinar los resultados en una única lista ordenada.

Este procedimiento continúa hasta que cada parte contiene un solo elemento, ya que un elemento individual se considera ordenado.

### 3.2. Principio divide y vencerás

El algoritmo trabaja mediante tres etapas:

- **Dividir:** separa el conjunto de datos en dos mitades.
- **Conquistar:** ordena cada mitad mediante llamadas recursivas.
- **Combinar:** une las dos mitades ordenadas para obtener una lista final ordenada.

### 3.3. Funcionamiento de la recursividad

Merge Sort utiliza dos procedimientos principales:

- `MergeSort`: divide la lista y realiza las llamadas recursivas.
- `Merge`: compara y combina los elementos de las dos mitades ordenadas.

**Caso base:** cuando la lista contiene cero o un elemento, no necesita ordenarse y el procedimiento termina.

**Caso recursivo:** cuando la lista contiene más de un elemento, se divide en dos mitades y se vuelve a ejecutar Merge Sort sobre cada una.

**Condición de finalización:** las llamadas recursivas terminan cuando todas las divisiones llegan a listas de un solo elemento. Después se combinan hasta obtener la lista completa ordenada.

## 4. Desarrollo paso a paso del algoritmo

Se utilizará el siguiente conjunto de datos:

```text
[Biblioteca, Laboratorio, Auditorio, Cafetería,
 Aulas, Enfermería, Gimnasio, Administración]
```

### 4.1. Primera etapa: división

La lista original se divide en dos mitades:

```text
[Biblioteca, Laboratorio, Auditorio, Cafetería]

[Aulas, Enfermería, Gimnasio, Administración]
```

### 4.2. Segunda etapa: nuevas divisiones

Cada mitad vuelve a dividirse:

```text
[Biblioteca, Laboratorio]
[Auditorio, Cafetería]

[Aulas, Enfermería]
[Gimnasio, Administración]
```

Posteriormente, cada grupo se divide hasta obtener elementos individuales:

```text
[Biblioteca] [Laboratorio]
[Auditorio] [Cafetería]
[Aulas] [Enfermería]
[Gimnasio] [Administración]
```

### 4.3. Tercera etapa: combinación y ordenamiento

Se comparan los elementos y se combinan en orden alfabético:

```text
[Biblioteca] + [Laboratorio]
= [Biblioteca, Laboratorio]

[Auditorio] + [Cafetería]
= [Auditorio, Cafetería]

[Aulas] + [Enfermería]
= [Aulas, Enfermería]

[Gimnasio] + [Administración]
= [Administración, Gimnasio]
```

Después se combinan los grupos:

```text
[Auditorio, Cafetería] +
[Biblioteca, Laboratorio]

= [Auditorio, Biblioteca, Cafetería, Laboratorio]
```

```text
[Administración, Gimnasio] +
[Aulas, Enfermería]

= [Administración, Aulas, Enfermería, Gimnasio]
```

Finalmente, se combinan ambas mitades:

```text
[Administración, Auditorio, Aulas, Biblioteca,
 Cafetería, Enfermería, Gimnasio, Laboratorio]
```

### 4.4. Resultado final

La lista queda ordenada alfabéticamente:

| Posición | Ubicación |
|---|---|
| 1 | Administración |
| 2 | Auditorio |
| 3 | Aulas |
| 4 | Biblioteca |
| 5 | Cafetería |
| 6 | Enfermería |
| 7 | Gimnasio |
| 8 | Laboratorio |

## 5. Pseudocódigo del algoritmo

El algoritmo completo se encuentra documentado en el archivo:

`codigo/MergeSort.txt`

Utiliza dos procedimientos: MergeSort para dividir recursivamente los datos y Merge para combinarlos en orden alfabético.

## 6. Complejidad del algoritmo

Merge Sort presenta las siguientes características:

- **Mejor caso:** O(n log n).
- **Caso promedio:** O(n log n).
- **Peor caso:** O(n log n).
- **Espacio auxiliar:** O(n).

Donde n representa la cantidad de elementos que se desean ordenar.

Su complejidad temporal se mantiene en O(n log n) porque en cada nivel se realizan divisiones del conjunto y el proceso de combinación requiere recorrer los elementos.

## 7. Justificación de su aplicación

Se eligió Merge Sort para organizar las ubicaciones del campus porque permite ordenar eficientemente un conjunto de datos y facilita su posterior consulta.

Entre sus principales ventajas se encuentran:

- Permite ordenar grandes cantidades de ubicaciones.
- Aplica directamente el principio divide y vencerás.
- Utiliza recursividad para resolver problemas más pequeños.
- Mantiene un rendimiento temporal de O(n log n).
- Es un algoritmo estable, porque conserva el orden relativo de elementos con claves iguales.

En el módulo inteligente de orientación, tener las ubicaciones organizadas alfabéticamente facilita su consulta y administración.

Es importante señalar que Merge Sort organiza los nombres de las ubicaciones, pero no calcula las rutas físicas entre ellas. El cálculo de rutas será desarrollado mediante grafos en la Actividad 3.

## 8. Conclusión

Mediante esta actividad se demuestra cómo el algoritmo Merge Sort permite ordenar recursivamente un conjunto de ubicaciones de un campus educativo.

Su funcionamiento se basa en dividir los datos en partes pequeñas, ordenarlas mediante llamadas recursivas y combinarlas hasta obtener una lista organizada.

Se concluye que Merge Sort es una alternativa adecuada para el módulo de orientación académica, ya que ofrece un rendimiento eficiente y permite organizar la información que posteriormente será utilizada por otros componentes del sistema.

---

**Fin de la Actividad 2 – Ordenamiento recursivo.**
