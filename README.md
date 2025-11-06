Ivo Giovarruscio
4° Informática
ETec

# Juego de Reciclaje - Guía de Instalación y Ejecución
Este proyecto es un juego educativo de reciclaje desarrollado en Kotlin utilizando Gradle como herramienta de construcción.
## Requisitos Previos
Antes de comenzar, asegúrate de tener instalado:

Java Development Kit (JDK) 21 o superior
- Puedes verificar tu versión con: java -version
- Descargar desde: Oracle JDK o OpenJDK



## Instalación y Ejecución
1. Clonar o Descargar el Proyecto
Si tienes el proyecto en un repositorio Git:
bashgit clone <url-del-repositorio>
cd reciclaje
Si descargaste un archivo ZIP:
bashunzip reciclaje.zip
cd reciclaje
2. Dar Permisos de Ejecución (Linux/Mac)
En sistemas Unix (Linux/Mac), es necesario dar permisos de ejecución al script de Gradle:
```bash
chmod +x gradlew
```
3. Compilar el Proyecto
```bash
# En Linux/Mac:
./gradlew build
# En Windows:
./gradlew.bat build
```
4. Ejecutar el Juego
```bash
# En Linux/Mac:
./gradlew run

# En Windows:
gradlew.bat run
```
## Cómo Jugar

Al iniciar el juego, verás un mensaje de bienvenida
Se te presentará un producto (ej: "Botella de agua")
Debes elegir el contenedor correcto ingresando un número del 1 al 5:

1. Plástico (contenedor naranja)
2. Vidrio (contenedor verde)
3. Papel (contenedor azul)
4. Metal (contenedor amarillo)
5. Orgánico (contenedor gris)

El juego te dirá si acertaste o no
Continúa clasificando productos hasta que no queden más
Al final verás tu puntuación total
