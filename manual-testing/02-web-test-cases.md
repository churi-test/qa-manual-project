## Casos de prueba manual - Web UI

**Versión:** 1.0 | **Fecha:** Septiembre 2026 | **Autor:** Jhon Churivanti | **Web de prueba:** [SauceDemo](https://www.saucedemo.com/)

---

## Resumen

| Módulo | Casos | Pasaron | Fallaron | Estado |
|--------|-------|---------|---------|--------|
| Login | 5 | 5 | 0 | ✅ Automatizado |
| Catálogo de productos | 2 | 2 | 0 | ✅ Completo|
| Carrito de compras | 1 | 1 | 0 | ✅ Automatizado |
| Checkout | 1 | 1 | 0 | ✅ Automatizado |
| Logout | 1 | 1 | 0 | ✅ Completo |
| Pruebas exploratorias | 3 | 0 | 3 | ⚠️ Bug encontrado |

 
**Total ejecutados manualmente:** 5 | **Pasaron:** 2 | **Fallaron:** 3

---
## Módulo 1 - Login

> Casos cubiertos por automatización — ver `src/test/java/tests/LoginTest.java`

### LOG-SAUD01 · Login con usuario y contraseña válidas

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Llenar en el campo Username: `standard_user`</li><li>Llenar en el campo Password: `secret_sauce`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema permita iniciar sesión de manera exitosa, y redirija al usuario a la pantalla principal, listado de productos (`/inventory.html`)|
|**Resultado obtenido**| ✅ Automatizado - pasando|
|**Estado**|  ✅ Automatizado|

---
### LOG-SAUD02 · Login con usuario y contraseña inválidas

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password incorrecto: secret_sauce1</li></ol>|
|**Pasos**|<ol><li>Llenar en el campo Username: `standard_user`</li><li>Llenar en el campo Password: `secret_sauce1`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error: `Epic sadface: Username and password do not match any user in this service`|
|**Resultado obtenido**| ✅ Automatizado - pasando|
|**Estado**|  ✅ Automatizado|

---
### LOG-SAUD03 · Login con usuario bloqueado

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: locked_out_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Llenar en el campo Username: `locked_out_user`</li><li>Llenar en el campo Password: `secret_sauce`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error indicando: `Epic sadface: Sorry, this user has been locked out.`|
|**Resultado obtenido**| ✅ Automatizado - pasando|
|**Estado**|  ✅ Automatizado|

---
### LOG-SAUD04 · Login de usuario con campos vacíos (usuario y password)

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: vacío</li> <li>Password: vacío</li></ol>|
|**Pasos**|<ol><li>Dejar vacío el campo Username: `""`</li><li>Dejar vacío el campo Password: `""`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error indicando que el `Username` es un campo requerido: `Epic sadface: Username is required`|
|**Resultado obtenido**| ✅ Automatizado - pasando|
|**Estado**|  ✅ Automatizado|

---
### LOG-SAUD05 · Login con username sin password

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: vacío</li></ol>|
|**Pasos**|<ol><li>Lenar en el campo Username: `standard_user`</li><li>Dejar vacío el campo Password: `""`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error indicando que el `Password` es un campo requerido: `Epic sadface: Password is required`|
|**Resultado obtenido**| ✅ Automatizado - pasando|
|**Estado**|  ✅ Automatizado|

---
## Módulo 2 - Catálogo de productos

> Casos cubierto por automatización — ver `src/test/java/tests/InventoryTest.java`

### LIST-PROD-SAUD01 · Visualizar el agregado de un producto en el icono del carrito

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li>El usuario debe estar logueado en el sistema</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Hacer clic en el botón "Add to cart" de un producto</li></ol>|
|**Resultado esperado**|Se espera que el sistema cambié el botón a `Remove` y muestre el icono del carrito la cantidad de `1`|
|**Resultado obtenido**| ✅ Automatizado - pasando|
|**Estado**|  ✅ Automatizado|

---
### LIST-PROD-SAUD02 · Ordenar los productos por su precio (Bajo a Alto)

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li>El usuario debe estar logueado en el sistema</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Hacer clic en el botón del filtro</li><li>Hacer clic en la opción de `Price (low to high)`</li></ol>|
|**Resultado esperado**|Se espera que el sistema ordene los productos por su precio de forma ascendente,  mostrando como primer elemento de la lista el 'Sauce Labs Onesie' con precio $7.99|
|**Resultado obtenido**| El sistema ordenó los productos por su precio (bajo a alto) |
|**Estado**| Aprobado ✅ |

---
## Módulo 3 - Carrito de compras

> Caso cubierto por automatización — ver `src/test/java/tests/CartTest.java`

### CART-SHOP-SAUD01 · Continuar la verificación de productos con el Checkout

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li><li>El usuario debe estar logueado en el sistema</li><li>Encontrarse en la pantalla de carrito de compras</li><li>Se tenga al menos un producto agregado en el carrito</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Hacer clic en el botón "Checkout"</li></ol>|
|**Resultado esperado**|Se espera que el sistema redirija al usuario a la pantalla de Checkout (`/checkout-step-one.html`)|
|**Resultado obtenido**| ✅ Automatizado - pasando |
|**Estado**|  ✅ Automatizado |

---
## Módulo 4 - Checkout de compra de productos

> Caso cubierto por automatización — ver `src/test/java/tests/CheckoutTest.java`

### CHECK-SHOP-SAUD01 · Completar con datos válidos para la verificación (Checkout)

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li><li>El usuario debe estar logueado en el sistema</li><li>Hayan productos en el carrito</li><li>Encontrarse en la pantalla de Checkout `/checkout-step-one.html`</li></ul>|
|**Datos de prueba**|<ul><li>First Name: Juan</li><li>Last name: Lopez C.</li><li>Zip/Postal Code: 20711</li></ol>|
|**Pasos**|<ol><li>Llenarr el campo First Name: `Juan`</li><li>Llenar el campo Last Name: `Lopez C.`</li><li>Llenarr el campo Zip/Postal Code: `20711`</li><li>Hacer clic en el botón "Continue"</li><li>Hacer clic en el botón "Finish"</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre el mensaje de compra y orden exitosa, `Thank you for your order!`|
|**Resultado obtenido**| ✅ Automatizado - pasando |
|**Estado**|  ✅ Automatizado |

---
## Módulo 5 - Logout

### LOGOUT-SAUD01 · Cerrar sesión correctamente

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li><li>El usuario debe estar logueado en el sistema</li><li>Encontrarse en la pantalla de catálogo de productos `/inventory.html`</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Hacer clic en el botón de menú</li><li>Hacer clic en "Logout"</li></ol>|
|**Resultado esperado**|Se espera que el sistema redirija al usuario a la página de login `(https://www.saucedemo.com/)`|
|**Resultado obtenido**| El sistema permite cerrar sesión correctamente |
|**Estado**| Aprobado ✅ |


## Pruebas exploratorias usando usuarios (problem_user, error_user)


### EXPL-SAUD01 · Visualizar el catálogo de productos con usuario problem_user

|**Campo**|**Detalle**|
|--------|------|
|**Datos de prueba**|<ul><li>Usuario: problem_user</li> <li>Password: secret_sauce</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre el catálogo sin error visual|
|**Estado**| Fallido ❌ |
|**IDs BUG**| BUG-001 |

---
### EXPL-SAUD02 · Visualizar el agregado y disminución de producto en el carrito con el usuario error_user

|**Campo**|**Detalle**|
|--------|------|
|**Datos de prueba**|<ul><li>Usuario: error_user</li> <li>Password: secret_sauce</li></ol>|
|**Resultado esperado**|Se espera que los botones "Add to cart" y "Remove" funcionen correctamente cuando el usuario agregue o quite un producto al carrito|
|**Estado**| Fallido ❌ |
|**IDs BUG**| BUG-002 |

---
### EXPL-SAUD03 · Visualizar la confirmación de compra (Chekout) con usuario error_user

|**Campo**|**Detalle**|
|--------|------|
|**Datos de prueba**|<ul><li>Usuario: error_user</li> <li>Password: secret_sauce</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre para cada campo: `First Name, Last Name, Zip/Postal Code` un mensaje de que son obligatorios|
|**Estado**| Fallido ❌ |
|**IDs BUG**| BUG-003 |

---
Proyecto QA Trainee | Jhon Churivanti | Salmos 51:10 `~ Dios mío, no me dejes tener malos pensamientos, cambia todo mi ser`




