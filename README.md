# Student Management System API

## 📌 Описание проекта
Student Management System API — это RESTful API для управления студентами. API позволяет выполнять CRUD-операции: создание, чтение, обновление и удаление информации о студентах.

## 🛠️ Технологии
- Java 17
- Spring Boot
- Hibernate (JPA)
- Lombok
- REST API
- Maven

## 🚀 Запуск проекта
### 1. Клонирование репозитория
```sh
git clone https://github.com/Melnk/StudensSystem
cd StudensSystem
```

### 2. Настройка базы данных
В файле `src/main/resources/application.yaml` настрой параметры доступа к базе данных:
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/your_database_name
    username: your_username
    password: your_password
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    database: postgresql
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    show-sql: true
    properties:
      hibernate:
        format_sql: true
```

### 3. Запуск
```sh
mvn spring-boot:run
```

## 🌍 API Эндпоинты
| Метод | URL | Описание |
|--------|-------------------------|------------------------------|
| GET | `/api/v1/students` | Получить список всех студентов |
| POST | `/api/v1/students/save_student` | Добавить нового студента |
| GET | `/api/v1/students/{email}` | Найти студента по email |
| PUT | `/api/v1/students/update_student` | Обновить данные студента |
| DELETE | `/api/v1/students/delete_student/{email}` | Удалить студента |

## 📸 Скриншоты
![image](https://github.com/user-attachments/assets/c348e667-9b6e-4b77-aa5f-573208d76ec6)


![image](https://github.com/user-attachments/assets/0e3bed61-ecc6-4a1b-9a5f-e5bc271ddabf)






