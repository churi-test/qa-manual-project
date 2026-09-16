## Reporte de bugs - Web UI

**Versión:** 1.0 | **Fecha:** Septiembre 2026 | **Autor:** Jhon Churivanti | **Web de prueba:** [SauceDemo](https://www.saucedemo.com/)

---
## Bugs funcionales (encontrados en ejecución manual)

### BUG-001 · El sistema muestra imágenes iguales en el catálogo de productos
| Campo | Detalle |
|-------|---------|
| **ID** | BUG-001 |
| **Módulo** | UI - Catálogo de prodcutos |
| **Severidad** | Alto |
| **Fecha** | Septiembre 2026 |
| **Descripción** | El sistema al visualizar el listado del catálogo de productos, no muestra a cada producto con su respectiva imagen, sino que todos tienen la misma imagen de producto. |
| **Pasos para reproducir** | 1. Iniciar sesión con el usuario `problem_user` y password `secret_sauce` · 2. Visualizar el catálogo de productos |
| **Resultado esperado** | El sistema debería mostrar cada producto con su respectiva imagen |
| **Resultado obtenido** | Para cada producto solo se muestra una imagen que no pertenece al producto correspondiente |
| **Evidencia** | [BUG-001](/manual-testing/evidence/BUG-001.png) |

---
### BUG-002 · El sistema no permite agregar o quitar un producto al carrito
| Campo | Detalle |
|-------|---------|
| **ID** | BUG-002 |
| **Módulo** | UI - Catálogo de prodcutos |
| **Severidad** | Alto |
| **Fecha** | Septiembre 2026 |
| **Descripción** | El sistema cuando el usuario dentro del catálogo de productos, intenta hacer clics en los botones de "Add to cart" o "Remove" para agregar o quitar un producto, no permite hacer ninguna acción. |
| **Pasos para reproducir** | 1. Iniciar sesión con el usuario `error_user` y password `secret_sauce` · 2. Visualizar el catálogo de productos ·  3. Hacer clic en el botón de "Add to cart" ·  4. Hacer clic en el botón de "Remove"    |
| **Resultado esperado** | Se espera que los botones "Add to cart" y "Remove" funcionen correctamente cuando el usuario agregue o quite un producto al carrito|
| **Resultado obtenido** | Los botones de "Add to cart" y "Remove" al hacer clics, no ejecuta ninguna acción |
| **Evidencia** | [BUG-002](/manual-testing/evidence/BUG-002.png) |

---
### BUG-003 · El sistema permite realizar la verificación (Checkout) sin el campo "Last Name"
| Campo | Detalle |
|-------|---------|
| **ID** | BUG-003 |
| **Módulo** | UI - Checkout |
| **Severidad** | Alto |
| **Fecha** | Septiembre 2026 |
| **Descripción** | El sistema cuando el usuario llena los campos `First Name, Zip/Postal Code`, y deja vacío el campo `Last Name` no muestra el mensaje de que el campo es requerido (obligatorio) |
| **Pasos para reproducir** | 1. Iniciar sesión con el usuario `problem_user` y password `secret_sauce` · 2. Clic en el icono de carrito ·  3. Hacer clic en el botón de "Checkout" ·  4. Llenar el campo `FistName: Juan, Zip/Postal Code: 13021`  ·  5. Hacer clic en el botón de "Continue" |
| **Resultado esperado** | Se espera que el sistema muestre un mensaje error adecuado de `Error: Last Name is required` |
| **Resultado obtenido** | El sistema permite pasar a la siguiente confirmación, sin mostrar el mensaje de error de campo obligatorio |
| **Evidencia** | [BUG-003](/manual-testing/evidence/BUG-003.png) |