# PA4 – Evaluación aplicada sobre recursividad y grafos

**Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial  
**Código:** 30710  
**Evaluación:** PA4  
**Equipo:** Grupo 7  
**Integrantes:** 4

## 1. Integrantes y responsabilidades

| Integrante | Actividad asignada | Aporte principal |
|---|---|---|
| Joseph Gianmarco Soberon Leon | Actividad 1 y coordinación | Recursividad, divide y vencerás, diseño de algoritmo y coordinación de la integración final. |
| Claudio Garcia Perez | Actividad 2 | Ordenamiento recursivo de datos del campus y explicación paso a paso. |
| Percy Daniel Perez Rojas | Actividad 3 | Representación del campus mediante grafos y análisis de DFS, BFS y A*. |
| Gustavo Aarón Cruz Mírez | Actividad 4 | Comparación de alternativas, recomendación técnica, relación con IA y conclusiones. |

**Participación:** Cada integrante desarrollará, documentará y expondrá su actividad, registrando sus aportes en GitHub desde una rama propia.

## 2. Descripción y objetivo

### Problema

Una institución desea construir un módulo inteligente de orientación dentro de su campus. El sistema debe ordenar información, analizar rutas posibles entre ubicaciones y justificar qué recorrido resulta más conveniente según el contexto.

### Objetivo

Aplicar recursividad, ordenamiento recursivo y algoritmos de búsqueda en grafos para plantear y justificar una solución de orientación dentro del campus.

### Propuesta inicial del equipo

Representar las ubicaciones del campus como **nodos** y sus conexiones como **aristas**. Procesar y ordenar información de ubicaciones con algoritmos recursivos y comparar los recorridos **DFS**, **BFS** y **A*** para distintas necesidades. Las ubicaciones, conexiones y criterios concretos se definirán en conjunto antes de implementar los algoritmos.

## 3. Actividades del proyecto

### Actividad 1 – Recursividad aplicada

**Responsable: Joseph**

- Explicar qué es recursividad y su relación con divide y vencerás.
- Diseñar un algoritmo recursivo vinculado al caso.
- Identificar caso base, caso recursivo y condición de finalización.
- [Ver desarrollo de la actividad 1](actividad-1/explicacion.md) *(pendiente de incorporar)*.

### Actividad 2 – Ordenamiento recursivo

**Responsable: Claudio**

- Diseñar un algoritmo recursivo para ordenar datos relacionados con el campus.
- Explicar cómo se divide el problema y se obtiene el resultado.
- Justificar la utilidad del método en el caso.
- [Ver desarrollo de la actividad 2](actividad-2/explicacion.md) *(pendiente de incorporar)*.

### Actividad 3 – Modelado mediante grafos

**Responsable: Percy**

- Representar nodos, aristas, origen, destino y sentido de conexiones cuando corresponda.
- Explicar un escenario apropiado para DFS y otro para BFS.
- Explicar el aporte de A* en búsquedas dirigidas a una meta.
- [Ver desarrollo de la actividad 3](actividad-3/explicacion.md) *(pendiente de incorporar)*.

### Actividad 4 – Argumentación final

**Responsable: Gustavo**

- Comparar las alternativas desarrolladas.
- Recomendar una solución y justificarla técnicamente.
- Relacionar la propuesta con aplicaciones básicas de IA vistas en el curso.
- [Ver conclusiones y comparación](actividad-4/conclusiones.md) *(pendiente de incorporar)*.

## 4. Organización del repositorio

| Rama | Responsable | Contenido |
|---|---|---|
| `main` | Equipo | Versión final integrada y revisada |
| `actividad-1` | Joseph | Recursividad aplicada |
| `actividad-2` | Claudio | Ordenamiento recursivo |
| `actividad-3` | Percy | Grafos, DFS, BFS y A* |
| `actividad-4` | Gustavo | Comparación y conclusión técnica |

**Flujo de trabajo:** cada integrante trabaja en su rama, realiza commits y solicita un Pull Request hacia `main`. Antes de integrar, se revisa que su actividad esté documentada y sea coherente con el caso compartido.

### Estructura prevista

```text
README.md
actividad-1/
  explicacion.md
  codigo/
  diagramas/
actividad-2/
  explicacion.md
  codigo/
  diagramas/
actividad-3/
  explicacion.md
  codigo/
  diagramas/
actividad-4/
  conclusiones.md
```

## 5. Cómo ejecutar o revisar

1. Abrir este README para conocer el objetivo, los responsables y la estructura.
2. Revisar cada actividad desde los enlaces del apartado 3, una vez incorporados los archivos.
3. Consultar diagramas, pseudocódigos y justificaciones de cada integrante.
4. Ejecutar el código según las instrucciones específicas que se agreguen en cada actividad (lenguaje y versión aún por confirmar).
5. Consultar el video de exposición publicado en el apartado 8.

## 6. Evidencias del proyecto

Se incorporarán progresivamente:

- Diagramas y representaciones del caso.
- Algoritmos o pseudocódigo de recursividad y ordenamiento.
- Grafo del campus y análisis de DFS, BFS y A*.
- Pruebas, resultados y justificaciones técnicas.
- Commits y Pull Requests de los integrantes.
- Enlace del video de exposición en YouTube.

## 7. Matriz de participación

| Integrante | Desarrollo asignado | Documentación | Exposición | Evidencia GitHub |
|---|---|---|---|---|
| Joseph Gianmarco Soberon Leon | Actividad 1 | Realizado | Realizado | Realizado |
| Claudio Garcia Perez | Actividad 2 | Realizado | Pendiente | Realizado |
| Percy Daniel Perez Rojas | Actividad 3 | Realizado | Pendiente | Realizado |
| Gustavo Aarón Cruz Mírez | Actividad 4 | Realizado | Pendiente | Realizado |

Esta matriz se actualizará únicamente cuando se verifiquen los avances reales.

## 8. Video de exposición

**Enlace de YouTube:** https://youtu.be/bhnAj2t5aPY

El equipo expondrá cómo resolvió el caso, qué decisiones tomó y por qué, con participación de los cuatro integrantes y cámaras encendidas.

## 9. Conclusiones

**Pendiente:** se redactarán después de desarrollar, contrastar y revisar las cuatro actividades.

---

**Nota sobre la entrega:** El documento de evaluación PA4 indica también un informe PDF independiente. El equipo ha decidido priorizar la documentación en el README; conviene confirmar con el docente si ese formato sustituye el informe solicitado.
