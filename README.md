# 📚 OnlineLibraryApp

Aplicación móvil Android que simula una **librería online**, permitiendo a los usuarios explorar libros, ver detalles de cada uno y navegar entre diferentes vistas.

## 🚀 Características principales
- Pantalla de inicio con logo de la aplicación.
- Pantalla de listado de libros, utilizando CardView.
- Cada libro incluye: portada, título, descripción breve y botón de "Más detalles".
- Pantalla de detalles que muestra portada, título y descripción completa.
- Barra de navegación inferior con tres secciones:
  - Inicio
  - Listado de libros
  - Créditos del equipo

## 🛠️ Tecnologías utilizadas
- **Android Studio** (Java + XML)
- **Navigation Component** para manejo de vistas y argumentos entre fragments
- **CardView** y **ConstraintLayout** para diseño de interfaz
- **GitHub** para control de versiones

## 📂 Estructura del proyecto
- `HomeFragment` → Vista inicial con logo.
- `ListFragment` → Listado de libros con sus tarjetas.
- `DetailsFragment` → Muestra los detalles del libro seleccionado.
- `CreditsFragment` → Información del autor.
- `res/drawable/` → Imágenes y recursos gráficos.
- `res/values/strings.xml` → Textos reutilizables.

## ⚙️ Instalación y ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/usuario/OnlineLibraryApp.git
   ```
2. Abrir el proyecto en Android Studio.

3. Ejecutar en un emulador o dispositivo físico con Android 7.0 (API 24) o superior.
