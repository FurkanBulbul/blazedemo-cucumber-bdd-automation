# BlazeDemo E2E Test Automation Framework (Cucumber & TestNG)

This repository features a professional, enterprise-grade web test automation framework developed for the **BlazeDemo** flight booking application. It transitions a traditional sequential testing approach into a scalable, behavior-driven ecosystem.

The framework is structured using the **Page Object Model (POM)** design pattern and leverages **Behavior-Driven Development (BDD)** principles to ensure maximum code reusability, high maintainability, and clear business readability.

---

## 🛠️ Tech Stack & Dependencies

* **Language:** Java (JDK 17)
* **Automation Tool:** Selenium WebDriver (v4.19.1)
* **Test Approach:** Cucumber (v7.15.0) / Gherkin Syntax
* **Test Engine:** TestNG (v7.9.0)
* **Build Tool:** Maven

---

## 📐 Framework Architecture & Directory Structure

The project isolates test logic from UI elements, making it robust against UI changes:

```text
src/
└── test/
    ├── java/
    │   ├── pages/           --> Page Object classes containing WebElements & core UI actions
    │   ├── runners/         --> TestRunner configuration extending TestNG support
    │   └── stepdefinitions/ --> Cucumber step translations linking Gherkin to Java code
    └── resources/
        └── features/        --> Human-readable Gherkin feature files (Given-When-Then)