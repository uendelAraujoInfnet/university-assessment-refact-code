# university-assessment-refact-code

# 🧠 Legacy Refactoring & Test Coverage – Assessment Project

Welcome to this repository! 👋 This project contains solutions and refactorings for a series of legacy code challenges provided during a technical assessment focused on **clean code**, **refactoring**, and **automated testing** using **Java**, **JUnit 5**, and **AssertJ**. Below is a full summary of the work completed so far.

---

## ✅ Question 1 – Simple Code Refactoring

🔍 **Objective:** Refactor a legacy classification system that used poor naming and mixed responsibilities.

### 🛠️ Key Improvements:
- Replaced cryptic names like `X`, `y`, and `z` with meaningful names (`Classifier`, `classify`, `value`)
- Introduced method extraction for `determineLevel()`
- Added support for a new category: `"MEDIUM"` when the value is exactly 10
- Wrote 8 comprehensive unit tests using **AssertJ**
- Achieved ✅ **100% test coverage**

### 📁 Main Files:
- `Classifier.java`
- `ClassifierTest.java`

---

## 🧾 Question 2 – Bad Smell Identification and Refactoring

🔍 **Objective:** Identify code smells in a fiscal invoice system and refactor one of them completely.

### ⚠️ Code Smells Identified:
- 🧱 Data Class (public fields)
- 🔢 Primitive Obsession (`int` for invoice type)
- 🔁 Duplicated Code (repeated conditional branches)
- 📏 Long Method (`process`)
- 🧩 Mixed Responsibilities (sending emails inside the domain)
- ☠️ Dead Code (`type == -1`)

### 🛠️ Refactoring Highlights:
- Introduced `InvoiceType` enum to eliminate primitive obsession
- Moved email logic into an `EmailService`
- Simplified and clarified the `process()` method
- Ensured immutability and encapsulation

### ✅ Tests:
- AssertJ-based tests for type mapping, email validation, and content generation

---

## 🛒 Question 3 – Improving Pricing Logic Readability

🔍 **Objective:** Refactor a pricing function from an e-commerce platform that applied customer and holiday discounts.

### 🛠️ Refactoring Approach:
- Introduced `CustomerType` enum (e.g., `REGULAR`, `VIP`, `GUEST`)
- Split logic into `calculateFinalPrice()` and `getTotalDiscount()` methods
- Removed magic numbers and increased semantic clarity

### ✅ Tests:
- AssertJ tests for all combinations of customer types and holiday flags
- Full coverage of discount scenarios

---

## 🧪 Testing & Coverage

- ✔️ Tests written with **JUnit 5**
- 🎯 Fluent assertions using **AssertJ**
- 📊 Coverage reports generated with **JaCoCo**
- 🧼 Clean code and testable architecture

---
## 🚀 Technologies Used

- Java 17 ☕
- Maven 📦
- JUnit 5 ✅
- AssertJ 🧪
- JaCoCo 📊

---

## Versão em PORTUGUÊS
# 🧠 Refatoração de Código Legado e Cobertura de Testes – Projeto de Avaliação

Bem-vindo a este repositório! 👋 Este projeto contém soluções e refatorações para uma série de desafios com código legado, propostos em uma avaliação técnica com foco em **código limpo**, **refatoração** e **testes automatizados**, utilizando **Java**, **JUnit 5** e **AssertJ**. Abaixo, segue um resumo completo do que foi realizado até o momento.

---

## ✅ Questão 1 – Refatoração de Código Simples

🔍 **Objetivo:** Refatorar um sistema legado de classificação com nomes ruins e responsabilidades misturadas.

### 🛠️ Melhorias Aplicadas:
- Substituição de nomes obscuros (`X`, `y`, `z`) por nomes semânticos (`Classifier`, `classify`, `value`)
- Extração de método `determineLevel()`
- Adição do novo caso `"MÉDIO"` quando o valor for 10
- 8 testes automatizados escritos com **AssertJ**
- Cobertura de testes ✅ **100%**

### 📁 Arquivos principais:
- `Classifier.java`
- `ClassifierTest.java`

---

## 🧾 Questão 2 – Identificação e Refatoração de Bad Smells

🔍 **Objetivo:** Identificar maus cheiros em um sistema fiscal legado e refatorar um deles por completo.

### ⚠️ Bad Smells Identificados:
- 🧱 Data Class (atributos públicos)
- 🔢 Obsessão por Primitivos (`int` para tipo de nota)
- 🔁 Código Duplicado
- 📏 Método Longo (`process`)
- 🧩 Responsabilidade Misturada (envio de email dentro da entidade)
- ☠️ Código Morto (`type == -1`)

### 🛠️ Refatorações Aplicadas:
- Criação do `enum InvoiceType`
- Isolamento do envio de email na classe `EmailService`
- Clareza e encapsulamento na classe `Invoice`

### ✅ Testes:
- Testes com AssertJ para validação de tipo, email e conteúdo

---

## 🛒 Questão 3 – Melhorando a Legibilidade do Cálculo de Preço

🔍 **Objetivo:** Refatorar função de precificação de uma plataforma de e-commerce.

### 🛠️ Melhorias Aplicadas:
- Criação do `enum CustomerType` (`REGULAR`, `VIP`, `GUEST`)
- Separação entre `calculateFinalPrice()` e `getTotalDiscount()`
- Remoção de números mágicos

### ✅ Testes:
- Testes com AssertJ cobrindo todos os cenários de cliente e feriado

---

## 🧪 Testes & Cobertura

- ✔️ Testes com **JUnit 5**
- 🎯 Asserções fluentes com **AssertJ**
- 📊 Relatórios de cobertura com **JaCoCo**
- 🧼 Código limpo e arquitetura testável

---
## 🚀 Tecnologias Utilizadas

- Java 17 ☕
- Maven 📦
- JUnit 5 ✅
- AssertJ 🧪
- JaCoCo 📊

---

## Version Française
# 🧠 Refactorisation de Code Hérité et Couverture des Tests – Projet d'Évaluation

Bienvenue dans ce dépôt ! 👋 Ce projet contient les solutions et refactorisations d’une série de défis portant sur du code hérité, réalisés dans le cadre d’une évaluation technique axée sur le **Clean Code**, la **refactorisation** et les **tests automatisés** avec **Java**, **JUnit 5** et **AssertJ**. Voici un résumé complet du travail réalisé jusqu’à présent.

---

## ✅ Question 1 – Refactorisation d'un Code Simple

🔍 **Objectif :** Refactorer un ancien composant de classification comportant des noms peu clairs et des responsabilités mélangées.

### 🛠️ Améliorations Apportées :
- Remplacement des noms obscurs (`X`, `y`, `z`) par des noms sémantiques (`Classifier`, `classify`, `value`)
- Extraction de la méthode `determineLevel()`
- Ajout du cas `"MEDIUM"` quand la valeur est exactement 10
- 8 tests unitaires écrits avec **AssertJ**
- Couverture de tests ✅ **100%**

### 📁 Fichiers principaux :
- `Classifier.java`
- `ClassifierTest.java`

---

## 🧾 Question 2 – Identification et Refactorisation des Code Smells

🔍 **Objectif :** Identifier les mauvaises odeurs dans un système de facturation et en refactorer une complètement.

### ⚠️ Code Smells Identifiés :
- 🧱 Data Class (attributs publics)
- 🔢 Obsession pour les types primitifs (`int` pour le type de facture)
- 🔁 Code dupliqué
- 📏 Méthode trop longue (`process`)
- 🧩 Responsabilités mélangées (email dans l’entité métier)
- ☠️ Code mort (`type == -1`)

### 🛠️ Refactorisations Appliquées :
- Création de l'énumération `InvoiceType`
- Service `EmailService` pour l’envoi d’e-mails
- Encapsulation et lisibilité dans `Invoice`

### ✅ Tests :
- Tests AssertJ pour la validation du type, email et contenu généré

---

## 🛒 Question 3 – Amélioration de la Lisibilité du Calcul de Prix

🔍 **Objectif :** Refactorer une fonction de calcul de prix dans une plateforme e-commerce.

### 🛠️ Refactorisations Apportées :
- Introduction de l’énumération `CustomerType` (`REGULAR`, `VIP`, `GUEST`)
- Séparation de la logique entre `calculateFinalPrice()` et `getTotalDiscount()`
- Élimination des nombres magiques

### ✅ Tests :
- Tests AssertJ couvrant tous les scénarios clients + jours fériés

---

## 🧪 Tests & Couverture

- ✔️ Tests avec **JUnit 5**
- 🎯 Assertions fluides avec **AssertJ**
- 📊 Rapport de couverture via **JaCoCo**
- 🧼 Architecture propre et testable

---
## 🚀 Technologies Utilisées

- Java 17 ☕
- Maven 📦
- JUnit 5 ✅
- AssertJ 🧪
- JaCoCo 📊

---


