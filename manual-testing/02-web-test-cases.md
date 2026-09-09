## Casos de prueba manual - Sauce Demo

**Versión:** 1.0 | **Fecha:** Septiembre 2026 | **Autor:** Jhon Churivanti | **Web de prueba:** [SauceDemo](https://www.saucedemo.com/)

---
## Módulo 1 - Login

### LOG-SAUD01 · Login con usuario y contraseña válidas

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Llenar en el campo Username: `standard_user`</li><li>Llenar en el campo Password: `secret_sauce`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema permita iniciar sesión de manera exitosa, y redirija al usuario a la pantalla principal, listado de productos (`/inventory.html`)|

### LOG-SAUD02 · Login con usuario y contraseña inválidas

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password incorrecto: secret_sauce1</li></ol>|
|**Pasos**|<ol><li>Llenar en el campo Username: `standard_user`</li><li>Llenar en el campo Password: `secret_sauce1`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error: `Epic sadface: Username and password do not match any user in this service`|

### LOG-SAUD03 · Login con usuario bloqueado

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: locked_out_user</li> <li>Password: secret_sauce</li></ol>|
|**Pasos**|<ol><li>Llenar en el campo Username: `locked_out_user`</li><li>Llenar en el campo Password: `secret_sauce`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error indicando: `Epic sadface: Sorry, this user has been locked out.`|

### LOG-SAUD04 · Login de usuario con campos vacíos (usuario y password)

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: vacío</li> <li>Password: vacío</li></ol>|
|**Pasos**|<ol><li>Dejar vacío el campo Username: `""`</li><li>Dejar vacío el campo Password: `""`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error indicando que el `Username` es un campo requerido: `Epic sadface: Username is required`|

### LOG-SAUD05 · Login con username sin password

|**Campo**|**Detalle**|
|--------|------|
|**Precondición**|<ul><li>Conexión a internet estable</li> <li> Se accede al login del sistema: https://www.saucedemo.com/</li></ul>|
|**Datos de prueba**|<ul><li>Usuario: standard_user</li> <li>Password: vacío</li></ol>|
|**Pasos**|<ol><li>Lenar en el campo Username: `standard_user`</li><li>Dejar vacío el campo Password: `""`</li><li>Presionar el botón "Login".</li></ol>|
|**Resultado esperado**|Se espera que el sistema muestre un mensaje de error indicando que el `Password` es un campo requerido: `Epic sadface: Password is required`|