# QA Project - Sauce Demo

Este proyecto forma parte de mi portafolio como QA Trainee. Abarcando desde un plan de prueba, documentación manual de todo el flujo para la plataforma de [Sauce Demo.](https://www.saucedemo.com/) Una introducción a la automatización (Selenium + POM) como complementaria para flujos repetitivos.

---
## 1. Objetivo 
Demostrar y practicar conocimiento QA aplicada a plataforma web:

- Análisis y estrategia de pruebas
- Diseño de casos de pruebas funcionales (positivo, negativo)
- Automatización base con criterio
- Ejecución de pruebas
- Reporte de bugs

## 2. Resumen - proyecto

| # | Valor |
|---------|-------|
| Total de tests automatizados | 8 |
| Casos de pruebas manuales | 5 |
| Bugs documentados | 3 |
| **Total de casos** | 13 |

---

## 3. Stack 

| Área | Herramienta |
|------|-------------|
| Automatización | Selenium WebDriver + Java |
| Patrón de diseño | Page Object Model (POM) |
| Gestor de dependencias | Maven |
| Testing Framework & Aserciones | JUnit 5 (Jupiter) |

---

## 3. Estructura - proyecto

```
sauce-qa-porject/
├── manual-testing/
    ├── 01-test-plan.md       (Objetivo, alcance y estrategia)
    ├── 02-web-test-cases.md  (Casos de prueba UI)
    ├── 03-bug-reports.md     (Bugs documentados con severidad)
    ├── 04-test-scenarios.md  (Lista de escenarios descritos)
└── src/
    ├── pages/CartPage.java       (Page object - carrito)
    ├── pages/CheckoutPage.java   (Page object - checkout)
    ├── pages/InventoryPage.java  (Page object - catálogo)
    ├── pages/LoginPage.java      (Page object - login user)
    ├── tests/CartTest.java       (1 test)
    ├── tests/CheckoutPage.java   (1 test)
    ├── tests/InventoryPage.java  (1 test)
    ├── tests/LoginPage.java      (5 tests)
└──  README.md
```

---

## 4. Documentación

| **Documento** | **Descripción** |
|--------|------|
| [Test Plan](/manual-testing/01-test-plan.md)    | Estrategia, objetivo y alcance   |
| [Casos de prueba - Web UI](/manual-testing/02-web-test-cases.md)   | Casos exploratorios manuales y automatizados   |
| [Reporte de bugs](/manual-testing/03-bug-reports.md)   | 3 bugs UI documentados con severidad   |

---
## Proyecto
~ Elaborado por Jhon Churivanti Alva

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jhon-churivanti-alva/)
[![Gmail](https://img.shields.io/badge/Gmail-EA4335?style=flat&logo=gmail&logoColor=white)](mailto:churivantialvajhonn@gmail.com)

---

*Gracias señor mío, por permitirnos conocer todo lo que hoy existe, porque sé que tú eres el dueño del conocimiento y de la vida | Somos seres humanos, pero aún hay tiempo para buscarlo diaramente. Dios te bendiga, solo ora y él te escuchará.*