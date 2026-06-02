# BlazeDemo E2E Test Automation Framework (Cucumber & TestNG)

This repository features a professional, enterprise-grade web test automation framework developed for the **BlazeDemo** flight booking application. It implements a scalable, behavior-driven ecosystem engineered with advanced architectural patterns.

The framework is strictly structured using the **Page Object Model (POM)** design pattern integrated with **PageFactory** lazy initialization. It leverages **Behavior-Driven Development (BDD)** principles to ensure maximum code reusability, decoupled test layers, and high business readability.

---

## 🛠️ Tech Stack & Dependencies

* **Language:** Java (JDK 17)
* **Automation Tool:** Selenium WebDriver (v4.19.1)
* **Design Patterns:** Singleton (Driver Management) & Inheritance (BasePage Architecture)
* **Test Approach:** Cucumber (v7.15.0) / Gherkin Syntax
* **Test Engine:** TestNG (v7.9.0)
* **Reporting Tool:** Allure Report (v2.24.0) via Allure Maven Plugin
* **Build Tool:** Maven

---

## 📐 Framework Architecture & Directory Structure

The project strictly isolates test logic, object repositories, and execution controls. By leveraging an abstract `BasePage` and Cucumber `Hooks`, it optimizes the browser lifecycle and guarantees robust execution against UI changes:

```text
src/
└── test/
    ├── java/
    │   ├── pages/
    │   ├── runners/
    │   ├── stepdefinitions/
    │   └── utils/
    └── resources/
        └── features/