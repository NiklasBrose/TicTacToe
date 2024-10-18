# TicTacToe

Ein einfaches TicTacToe-Spiel mit einer grafischen Benutzeroberfläche (GUI), das in Java entwickelt wurde. Spiele gegen einen Freund auf demselben Computer und genieße die klassische Strategie von "Drei gewinnt"!

## Inhaltsverzeichnis
1. [Über das Projekt](#über-das-projekt)
2. [Features](#features)
3. [Voraussetzungen](#voraussetzungen)
4. [Installation](#installation)
5. [Verwendung](#verwendung)
6. [Spielanleitung](#spielanleitung)

## Über das Projekt

Dieses Projekt ist eine einfache Implementierung des TicTacToe-Spiels in Java. Das Spiel verwendet Swing für die grafische Oberfläche und ermöglicht es zwei Spielern, auf einem 3x3-Raster abwechselnd X- und O-Symbole zu setzen. Es gibt außerdem eine einfache Spiellogik, um den Gewinner zu bestimmen.

## Features

- GUI-basierte Spielfläche mit einem 3x3-Raster von Buttons
- Wechselt zwischen "X" und "O" bei jedem Klick
- Automatische Überprüfung, ob ein Spieler gewonnen hat
- Möglichkeit, das Spielfeld nach einem Spiel zurückzusetzen
- Intuitive und einfache Benutzeroberfläche mit Swing

## Voraussetzungen

Stelle sicher, dass du die folgenden Softwarekomponenten installiert hast, bevor du das Spiel startest:

- **Java JDK 8 oder höher**
- Ein Java-kompatibler Editor oder IDE (z.B. IntelliJ, Eclipse)

## Installation

### 1. Repository klonen

Klone dieses Repository auf deinen lokalen Rechner:

```bash
git clone https://github.com/NiklasBrose/TicTacToe.git
```

### 2. Kompilieren und ausführen

1. Wechsle in das Verzeichnis des Projekts:
   ```bash
   cd TicTacToe
   ```

2. Kompiliere den Code:
   ```bash
   javac src/*.java
   ```

3. Starte das Spiel:
   ```bash
   java -cp src Main
   ```

## Verwendung

Nach dem Start der Anwendung öffnet sich ein Fenster mit einem 3x3-Gitter. Jeder Spieler klickt abwechselnd auf ein freies Feld, um ein "X" oder "O" zu platzieren. Der erste Spieler, der drei seiner Symbole in einer Reihe, Spalte oder Diagonale platziert, gewinnt das Spiel.

Wenn ein Spieler gewinnt, erscheint eine Nachricht, und das Spielfeld wird automatisch zurückgesetzt.

## Spielanleitung

1. **Spielstart**:  
   Das Spiel beginnt automatisch, sobald das Fenster geöffnet wird.

2. **Zug machen**:  
   Klicke auf ein leeres Feld, um dein Symbol ("X" oder "O") zu platzieren. Der erste Spieler setzt "X", der zweite "O".

3. **Spielende**:  
   Sobald ein Spieler drei Symbole in einer Reihe (horizontal, vertikal oder diagonal) platziert hat, wird dieser als Gewinner bekannt gegeben.

4. **Spiel zurücksetzen**:  
   Nach jeder Runde wird das Spielfeld automatisch zurückgesetzt, um eine neue Partie zu starten.
