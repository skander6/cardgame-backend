## CARD GAME

This Card Game project is a web application . The application is divided into 2 parts:  This project is the back end part which contains Rest APIs.

### Technical Stack

- Java 11
- Spring Boot 2.6.0
- Junit 5

### Functional requirements

In this game, a player randomly draws a 10-card hand. Each card has a suit ("Diamonds (Carreaux)", for example) and a value ("10", for example). 
Randomly a 10 card hand will be built and then the 10 cards will be sorted according color and value.

## Architecture
### Logical architecture
The backend part has a 4-layer logical architecture:
-  controllers layer
-  services layer
-  models layer
-  utils layer

### Physical architecture
For the physical architecture, our application has a 3-tier architecture:
-back end
-front end
-user browser

### How to run the project
First, download the Project form "develop" branch. If your IDE couldn't download the depencies mentionned in the pom.xml directly, you can run the command 

```bash
mvn clean install -U
```

Then just run your project using your IDE.