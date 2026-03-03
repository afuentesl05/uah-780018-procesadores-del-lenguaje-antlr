# Procesadores del Lenguaje (780018) — ANTLR

Repositorio dedicado exclusivamente a las prácticas de la asignatura **Procesadores del Lenguaje (780018)** de la **Universidad de Alcalá**.

El objetivo principal es el diseño e implementación de:

- Gramáticas formales
- Análisis léxico
- Análisis sintáctico
- Análisis semántico
- Generación de árboles sintácticos (Parse Trees / AST)
- Validaciones semánticas mediante Listeners o Visitors

---

## 🎯 Enfoque

Este repositorio está centrado exclusivamente en el uso de **ANTLR4** para la construcción de procesadores del lenguaje.

No incluye otros frameworks ni herramientas externas fuera del ecosistema ANTLR.

---

## 🛠️ Tecnologías utilizadas

- ANTLR4
- Java (runtime)
- Gramáticas `.g4`

---

## 📂 Estructura del repositorio

```text
/practica1
/practica2
/practica3
/grammars
/docs
```

Cada práctica incluye:

- Definición de la gramática
- Código generado por ANTLR
- Implementación semántica (si procede)
- Código de pruebas
- Casos de test

---

## 🛠️ Cómo compilar y ejecutar una gramática ANTLR

Este proyecto utiliza **ANTLR4** con runtime en Java.

### 1️⃣ Generar el parser a partir de la gramática

```bash
antlr4 MiGramatica.g4
```

Esto generará automáticamente:

- `MiGramaticaLexer.java`
- `MiGramaticaParser.java`
- `MiGramaticaListener.java`
- `MiGramaticaBaseListener.java`
- `MiGramaticaVisitor.java` (si está habilitado)
- Archivos `.tokens` e `.interp`

---

### 2️⃣ Compilar los archivos generados

```bash
javac *.java
```

---

### 3️⃣ Ejecutar el parser con TestRig (grun)

```bash
grun MiGramatica reglaInicial -gui
```

Donde:

- `MiGramatica` → nombre del archivo `.g4`
- `reglaInicial` → regla de entrada definida en la gramática

Ejemplo:

```bash
grun MiGramatica programa -gui
```

Para ejecución en consola (sin interfaz gráfica):

```bash
grun MiGramatica programa
```

---

### 4️⃣ Ejecutar con archivo de entrada

```bash
grun MiGramatica programa -gui input.txt
```

---

## 📌 Requisitos

- Java 8 o superior  
- ANTLR4 instalado y configurado en el `PATH`  
- Alias `antlr4` y `grun` correctamente definidos  

---

## 👥 Autoría y contribuciones

- **PL1** — Realizada íntegramente por **Álvaro Fuentes Lozano**
- **PL2** — Realizada conjuntamente con:
  - David Cubas Martí
  - Diana Torrico Lopez
- **PL3** — Realizada conjuntamente con:
  - David Cubas Martí
  - Diana Torrico Lopez

---

## 🤝 Contributors

Este repositorio incluye contribuciones de:

- David Cubas Martí
- Diana Torrico Lopez

---

Universidad de Alcalá — Ingeniería Informática