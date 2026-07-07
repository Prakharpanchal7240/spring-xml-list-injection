# Spring Framework - List Collection Injection (XML Configuration)

This project demonstrates **List Collection Injection** in the Spring Framework using **XML configuration**.

The example shows how to inject a `List` of values into a Java POJO using the `<list>` element inside the Spring configuration file.

No annotations (`@Autowired`, `@Component`) are used. Everything is configured using classic XML configuration.

---

## 📚 What You'll Learn

- Spring IoC Container
- Dependency Injection (DI)
- XML Bean Configuration
- List Collection Injection
- Property Injection
- Creating and Loading Beans
- Maven Project Structure

---

## 🛠 Technologies Used

- Java
- Spring Framework
- Maven
- Eclipse IDE

---

## 📂 Project Structure

```
src
│
├── main
│   ├── java
│   │   └── spring
│   │       └── injecting_list
│   │           ├── App.java
│   │           └── Student.java
│   │
│   └── resources
│       └── com
│           └── configuration
│               └── application-context.xml
```

---

## XML Configuration

```xml
<bean id="student" class="spring.injecting_list.Student">
    <property name="list">
        <list>
            <value>Prakhar</value>
            <value>Mohit</value>
            <value>Parth</value>
            <value>Suraj</value>
        </list>
    </property>
</bean>
```

---

## Java Code

```java
ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "com/configuration/application-context.xml");

Student student = context.getBean("student", Student.class);

System.out.println(student);
```

---

## Expected Output

```
Student{
    list=[Prakhar, Mohit, Parth, Suraj]
}
```

*(Output format depends on the `toString()` implementation.)*

---

## Key Concepts

### List Collection Injection

Spring allows injecting multiple values into a Java `List` using the `<list>` element.

Example:

```xml
<property name="list">
    <list>
        <value>Java</value>
        <value>Spring</value>
        <value>Maven</value>
    </list>
</property>
```

Spring automatically creates the `List` object and injects it into the bean.

---

## Advantages

- No hardcoded values in Java classes
- Easy to maintain
- Externalized configuration
- Supports any number of values
- Promotes loose coupling

---

## Prerequisites

- Java 8+
- Maven
- Spring Framework
- IDE (Eclipse/IntelliJ)

---

## How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/spring-xml-list-injection.git
```

2. Import as a Maven project.

3. Update Maven dependencies.

4. Run:

```
App.java
```

---

## Future Enhancements

- Set Injection
- Map Injection
- Properties Injection
- Constructor Injection
- Reference Collection Injection
- Autowiring using XML

---

## License

This project is created for learning and educational purposes.