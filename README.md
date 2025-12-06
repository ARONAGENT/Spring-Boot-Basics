# 🚀 Introduction to Spring and Spring Boot


![Visitor Badge](https://visitor-badge.laobi.icu/badge?page_id=ARONAGENT.Spring-Boot-Basics)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-Proprietary-red?style=flat-square)](#license)


*"Spring is to Java what rails is to Ruby - a way to make development faster, easier, and more enjoyable."*


## 📖 Overview

A comprehensive guide to understanding **Spring Framework** and **Spring Boot** fundamentals. This project covers the evolution of Spring from its early days to modern Spring Boot, exploring core concepts like Beans, Dependency Injection, Auto-Configuration, and Maven build lifecycle with practical demonstrations.

### 🎯 What You'll Learn

- 📜 History and evolution of Spring Framework (Early 2000s → 2004 → 2017 → 2014+)
- 🫘 Bean lifecycle, creation patterns, and scope management
- 💉 Dependency Injection techniques and best practices
- ⚡ Spring vs Spring Boot comparison
- 🔧 Auto-configuration mechanisms
- 🏗️ Maven project structure and lifecycle
- 🚀 Complete Spring Boot application startup process

---

## ✨ Features

- 🔍 **Deep Dive into Spring History** - Understand the framework's evolution over two decades
- 🫘 **Bean Management** - Master bean creation, lifecycle hooks, and scope configurations
- 💉 **Dependency Injection Mastery** - Learn field, constructor, and setter injection patterns
- 🎯 **Auto-Configuration Magic** - Explore how Spring Boot simplifies configuration
- 🔄 **Application Lifecycle** - Complete breakdown from JVM startup to application ready state
- 🛠️ **Maven Integration** - Practical examples of Maven commands and lifecycle phases
- 📸 **Visual Learning** - 14+ execution screenshots demonstrating key concepts
- 🎨 **Multiple Bean Resolution Strategies** - Using @Primary, @Qualifier, and @ConditionalOnProperty

---

## 🛠️ Technologies

<div align="center">

| Technology | Version | Purpose |
|------------|---------|---------|
| ☕ **Java** | 17+ | Core Language |
| 🍃 **Spring Framework** | 6.x | IoC Container |
| 🚀 **Spring Boot** | 3.x | Rapid Application Development |
| 📦 **Maven** | 3.8+ | Build & Dependency Management |
| 🎯 **Spring Context** | Latest | Bean Management |
| ⚙️ **Spring Boot Starter** | Latest | Auto-Configuration |

</div>

---

## 🏗️ Spring Boot Application Startup Flow

```
JVM Startup
    ↓
main() method execution
    ↓
SpringApplication.run(MyApp.class, args)
    ↓
@SpringBootApplication Detection
    ├── @SpringBootConfiguration
    ├── @ComponentScan
    └── @EnableAutoConfiguration
    ↓
SpringApplication Object Creation
    ├── ApplicationContext Setup
    ├── Environment Setup
    └── Listeners & Initializers Registration
    ↓
ApplicationContext Creation
    ↓
Environment Preparation
    ├── application.properties
    ├── Command line args
    └── Active profiles
    ↓
Bean Scanning & Registration
    ├── @ComponentScan beans
    └── Auto-configured beans
    ↓
ApplicationContext Refresh
    ├── Bean instantiation
    ├── Dependency injection
    └── Lifecycle callbacks
    ↓
Embedded Web Server Start (Tomcat)
    ↓
CommandLineRunner/ApplicationRunner Execution
    ↓
✅ Application Ready
```

---

## 📸 Project Screenshots

### 1. Traditional Bean Creation — *Creating beans manually with new instances*
<img width="1777" height="921" src="https://github.com/user-attachments/assets/16fbf9a8-511b-44de-a032-ca720d1f0aa4" />

### 2. Configuration-Based Bean Creation — *Using @Configuration and @Bean annotations*
<img width="1778" height="1018" src="https://github.com/user-attachments/assets/e3f982de-81e4-4a6b-bdf6-933b03bdcb30" />

### 3. Component Scanning — *Automatic bean discovery with @Component*
<img width="1776" height="928" src="https://github.com/user-attachments/assets/58fb4b7e-81b0-4e14-867a-9ce0b8885b80" />

### 4. @PostConstruct Lifecycle Hook — *Initialization before bean usage*
<img width="1777" height="921" src="https://github.com/user-attachments/assets/67a48cea-6c4f-42e9-8a1b-711125522601" />

### 5. @PreDestroy Lifecycle Hook — *Cleanup during application shutdown*
<img width="1787" height="983" alt="3 Predestroy is Called When the Application is Stop and want to destroy the Beans" src="https://github.com/user-attachments/assets/7b7d50ac-3a6b-480f-8b9b-f06a483d2967" />

### 6. Prototype Scope — *New instance on every request*
<img width="1818" height="988" src="https://github.com/user-attachments/assets/f2fcb9c7-13a4-4d4d-a815-a1b83bb4e573" />

### 7. Dependency Injection — @Primary — *Resolve multiple bean candidates*
<img width="1793" height="1023" src="https://github.com/user-attachments/assets/02e8fabd-71aa-4040-8686-be7866170806" />

### 8. Dependency Injection — @ConditionalOnProperty — *Conditional bean creation*
<img width="1788" height="995" src="https://github.com/user-attachments/assets/3d2b18fb-006d-4ccc-a029-0ce1d67d976b" />

### 9. Field Injection — *Using @Autowired on fields*
<img width="1781" height="1018" src="https://github.com/user-attachments/assets/fe062726-0ddf-4086-aaac-c339241cce1b" />

### 10. Constructor Injection — *Dependency injection via constructor*
<img width="1833" height="1012" src="https://github.com/user-attachments/assets/55e01cb6-0c24-4851-90f4-c1c7149c645a" />

### 11. Final Fields with Constructor — *Immutable dependency pattern*
<img width="1783" height="1017" src="https://github.com/user-attachments/assets/6e3211bb-6b13-43b2-9293-c210b93eab2b" />

### 12. Bean Map Interface — *Retrieve all bean instances as Map*
<img width="1821" height="1017" src="https://github.com/user-attachments/assets/b18ddd17-f642-4348-822e-ee23d38fd206" />

### 13. Maven — Compile Command — *Compile source code*
<img width="1918" height="1028" src="https://github.com/user-attachments/assets/b824aefc-4890-4429-ae3c-aa3e62872237" />

### 14. Maven — Clean Command — *Remove build artifacts*
<img width="1918" height="1026" src="https://github.com/user-attachments/assets/411b1bee-7c02-4b96-8e4f-6eec16c21d82" />

### 15. Maven — Package Command — *Build JAR/WAR*
<img width="1918" height="1010" src="https://github.com/user-attachments/assets/e8430129-0e98-439b-ada2-d2b42e138d4d" />

### 16. Maven — Install Command — *Install to local repository*
<img width="1822" height="931" src="https://github.com/user-attachments/assets/fad10f5a-dca5-4474-89bf-f12f397ca8ce" />

## 📥 Installation

### Prerequisites

- Java JDK 17 or higher
- Maven 3.8+
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Clone the Repository

```bash
git clone https://github.com/ARONAGENT/Spring-Boot-Basics.git
cd Spring-Boot-Basics
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

Or run directly:

```bash
java -jar target/spring-boot-basics-1.0.0.jar
```

---

## 🎯 Usage

### Example 1: Creating Beans with @Configuration

```java
@Configuration
public class AppConfig {
    
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}
```

### Example 2: Component Scanning

```java
@Component
public class UserService {
    
    @PostConstruct
    public void init() {
        System.out.println("Bean initialized!");
    }
    
    @PreDestroy
    public void cleanup() {
        System.out.println("Bean destroyed!");
    }
}
```

### Example 3: Constructor Injection (Recommended)

```java
@Service
public class OrderService {
    
    private final PaymentService paymentService;
    
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```

### Example 4: Conditional Bean Creation

```java
@Configuration
public class DatabaseConfig {
    
    @Bean
    @ConditionalOnProperty(name = "db.type", havingValue = "mysql")
    public DataSource mysqlDataSource() {
        return new MySQLDataSource();
    }
    
    @Bean
    @ConditionalOnProperty(name = "db.type", havingValue = "postgres")
    public DataSource postgresDataSource() {
        return new PostgreSQLDataSource();
    }
}
```

---

## 🔧 Maven Lifecycle Commands

| Command | Description | Usage |
|---------|-------------|-------|
| `mvn compile` | Compiles source code | Development phase |
| `mvn clean` | Removes target directory | Clean build |
| `mvn test` | Runs unit tests | Testing phase |
| `mvn package` | Creates JAR/WAR file | Deployment preparation |
| `mvn install` | Installs to local repository | Sharing locally |
| `mvn deploy` | Deploys to remote repository | Production deployment |

---

## 🤝 Contributing

Contributions are always welcome! Here's how you can help:

1. 🍴 Fork the repository
2. 🌿 Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the branch (`git push origin feature/AmazingFeature`)
5. 🔃 Open a Pull Request

### Code of Conduct

Please be respectful and constructive in all interactions.

---

## 📄 License
```
Copyright (c) 2024 ARONAGENT

This project and its source code are the exclusive property of the author.
Unauthorized copying, modification, distribution, or commercial use is strictly prohibited.
Limited use is granted for learning, reviewing, and non-commercial demonstration purposes only.
No warranties are provided; use at your own risk.
For permissions beyond this notice, contact: rohanuke1@gmail.com

```

## 🙏 Acknowledgments

- 🍃 **Spring Team** - For creating an amazing framework
- 🌐 **Open Source Community** - For continuous inspiration and support
- 📚 **Spring Documentation** - Comprehensive guides and references
- 🎓 **Java Community** - For best practices and knowledge sharing
- 💻 **Maven Contributors** - For powerful build automation
- 🚀 **Spring Boot Team** - For simplifying Spring development

---
<div align="center">
   
## 📞 Connect & Support

[![GitHub](https://img.shields.io/badge/GitHub-ARONAGENT-181717?style=flat-square&logo=github)](https://github.com/ARONAGENT)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-aronagent-0A66C2?style=flat-square&logo=linkedin)](https://www.linkedin.com/in/aronagent/)
[![Gmail](https://img.shields.io/badge/Gmail-rohanuke1@gmail.com-D14836?style=flat-square&logo=gmail)](mailto:rohanuke1@gmail.com)

### 🌟 Star this repo if you find it helpful! ⭐

**Built with ❤️ by [ARONAGENT](https://github.com/ARONAGENT)**
   
**Happy Coding! 💻✨**

*"The best way to predict the future is to implement it."* 

</div>
