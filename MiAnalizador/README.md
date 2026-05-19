# Analizador Sintáctico Mini C con ANTLR4

## Descripción

Este proyecto implementa un analizador léxico y sintáctico utilizando ANTLR4 y JavaScript para un subconjunto reducido del lenguaje C.

El lenguaje reconoce:

- estructuras if
- else
- printf
- return
- cadenas de texto

---

## Requisitos

- Java 17 o superior
- Node.js
- npm

---

## Instalación

Abrir una terminal dentro de la carpeta `MiAnalizador`.

Ejecutar:

```bash
npm install
```

---

## Ejecución

Ejecutar:

```bash
npm start
```

---

## Archivo de entrada

El archivo utilizado como entrada es:

```text
input.txt
```

---

## Ejemplos

### Ejemplo válido

```c
if (1) {
    printf("Hola");
    return;
}
```

### Ejemplo inválido

```c
if (1 {
    printf("Hola");
    return;
}
```

---

## Generación del parser

El parser fue generado utilizando:

```bash
java -jar antlr-4.13.2-complete.jar -Dlanguage=JavaScript -visitor -listener -o generated MiniC.g4
```