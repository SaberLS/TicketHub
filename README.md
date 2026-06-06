# TicketHub – System Rezerwacji Biletów

## 📌 Opis projektu

TicketHub to prosta aplikacja webowa napisana w Spring Boot, umożliwiająca
przeglądanie wydarzeń (filmów i koncertów) oraz dodawanie nowych wydarzeń do
systemu.

Projekt wykorzystuje:

- Spring Boot
- Spring MVC (Thymeleaf)
- Spring Data JPA
- H2 Database
- Lombok
- Bean Validation
- Bootstrap (UI)

---

## 🚀 Funkcjonalności

- wyświetlanie listy wydarzeń
- dodawanie nowych wydarzeń
- walidacja danych formularza
- zapis danych w bazie H2 (in-memory)
- automatyczne dane startowe przy uruchomieniu aplikacji

---

## 🛠️ Wymagania

- Java 21+
- Maven 3+

---

## ▶️ Uruchomienie projektu

### 1. Sklonuj repozytorium

```bash
git clone https://github.com/SaberLS/TicketHub.git
cd tickethub
```

---

### 2. Uruchom aplikację

```bash
mvn spring-boot:run
```

---

### 3. Otwórz aplikację w przeglądarce

```
http://localhost:8080
```

---

## 🗄️ H2 Database Console

Panel bazy danych dostępny pod:

```
http://localhost:8080/h2-console
```

---

## 📂 Struktura projektu

```Plaintext
.
├── pom.xml
├── README.md
└── src
    └── main
         ├── java
         │   └── pl
         │       └── wszib
         │           └── java
         │               └── advanced
         │                   └── tickethub
         │                       ├── config
         │                       │   └── DataInitializer.java
         │                       ├── controller
         │                       │   └── EventController.java
         │                       ├── entity
         │                       │   └── event
         │                       │       ├── Event.java
         │                       │       └── EventCategory.java
         │                       ├── repository
         │                       │   └── EventRepository.java
         │                       ├── service
         │                       │   └── EventService.java
         │                       └── TicketHubApplication.java
         └── resources
             ├── application.properties
             └── templates
                 ├── add-event.html
                 └── events.html
```
