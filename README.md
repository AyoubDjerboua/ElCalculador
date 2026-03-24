# ElCalculador

Projet Java configure avec Gradle et JUnit 5.

## Prerequis

- Java (JDK installe)
- Gradle (Option A via `apt`)

## Installation de Gradle (Option A)

```zsh
sudo apt update
sudo apt install -y gradle
gradle -v
```

## Utilisation

Depuis la racine du projet:

```zsh
gradle wrapper
./gradlew test
./gradlew run
```

## Structure

- `src/main/java/com/elcalculador/Calculator.java`
- `src/main/java/com/elcalculador/Main.java`
- `src/test/java/com/elcalculador/CalculatorTest.java`

## Notes

- Le package a ete renomme en `com.elcalculador`.
- JUnit 5 est configure via `build.gradle` avec `useJUnitPlatform()`.
