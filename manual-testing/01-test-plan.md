## Test plan - Sauce Demo

**Versión:** 1.0 | **Fecha:** Septiembre 2026 | **Autor:** Jhon Churivanti | **Web de prueba:** [SauceDemo](https://www.saucedemo.com/)

---
## 1. Objetivo y alcance 

### Objetivo

Validar la funcionalidad de la plataforma Sauce Demo a través de pruebas manuales y automatizadas, cubriendo los flujos críticos. Identificando defectos funcionales y documentar todo el proceso.

Este proyecto forma parte de mi portafolio como QA Trainee. Tiene la intención de demostrar base en QA Manual. Una introducción a la automatización como complementaria para flujos repetitivos.

### Alcance - Dentro
| # | Canal |
|------|------|
|  Login y autenticación (usuario válido, inválido y bloqueado) | Web UI |
|  Listado y detalle de productos | Web UI |
|  Filtro de productos por nombre y precio | Web UI |
|  Agregar y eliminar productos al carrito | Web UI |
|  Procesar compra (información del comprador, resumen de compra y confirmación) | Web UI |
|  Logout usuario | Web UI |


### Alcance - Fuera

- Testing de compatibilidad (distintos a Chrome)
- Testing seguridad
- Testing performance/carga
- Testing de accesibilidad

---
## 2. Estrategia de pruebas

| Tipos de prueba | Descripción |
|------|------|
|  Funcional positiva | Verifican que cada funcionalidad del sistema hace lo que debe hacer con  datos válidos |
|  Funcional negativa | Verifican cómo se comporta el sistema  ante datos inválidos, campos vacios y credenciales incorrectas |
|  Exploratoria manual | Sesión de exploración libre para identificar comportamientos inesperados |

### Herramientas

| Propósito | Herramienta |
|------|------|
|  Prueba manual UI | Carpeta (/manual-testing) |
|  Automatización UI | Selenium + Java |
| Patrón de diseño | POM (Page Object Model) |
|  Gestión de casos y bugs | carpeta (/manual-testing) |

### Datos de prueba

- Navegador: Chrome (versión actual)
- Usuarios de prueba disponibles

| Usuario | Password | Comportamiento esperado |
|------|------|------|
| standard_user | secret_sauce | Se espera que el sistema acepte al usuario
| locked_out_user | secret_sauce | Se espera que el sistema rechace al usuario (usuario bloqueado) |
| error_user, problem_user | secret_sauce | Se espera que el sistema muestre Bugs de UI |

---
## 3. Análisis de riegos
| # | Riesgo | Mitigación |
|------|------|------|
|R01 | Cambios en el DOM que afecta a selectores UI (automatización)  | Usar selectores semánticos (personalizado para test)|
| R02 | Confusión entre bug intencional y bug real | Centrarse en los flujos conocidos |
| R03 | No completar el flujo de compra exitosa | Escenarios y pruebas centrados en flujo principal de negocio |


---
## 4. Criterios de entrada y salida

### Criterios de entrada - condiciones para iniciar pruebas

- Entorno disponible y accesible: https://www.saucedemo.com/

- Lista de usuarios con credenciales

### Criterios de salida - condiciones para considerar pruebas completas

- El 100% de las pruebas manuales ejecutadas
- Tests automatizados con criterio
- Todos los bugs documentados con su severidad y pasos para reproducir

## 5. Entregables

- Test plan (`/manual-testing/01-test-plan.md`)
- Casos de pruebas manuales - Web (`/manual-testing/02-web-test-cases.md`)
- Reporte de bugs - Web (`/manual-testing/03-bug-reports.md`)
- Automatización de pruebas - Web (`/src/test/java/tests`)

---
Proyecto QA Trainee | Jhon Churivanti | Agradece a Dios por el nuevo día, Él siempre está a la espera de cada uno de nosotros°






