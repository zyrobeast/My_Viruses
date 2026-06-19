# Java System Disruption Experiments

A collection of small Java programs I created around Class 10 while learning about event automation and system interaction using the Java `Robot` class.

These programs are **not real viruses or malware**. They are standalone applications that must be manually installed and executed. Their purpose was to help me understand how software can generate artificial user input and how poorly designed programs can negatively affect a system's usability.

## Learning Objectives

* Understanding Java's `Robot` class
* Generating artificial keyboard and mouse events
* Exploring system-level user interaction
* Learning about software misuse and system disruption
* Gaining practical experience with event-driven programming

## Projects

### 1. Blocker Virus

**Description:**
A Java application that disables normal user interaction after startup by continuously intercepting or generating input events.

**Observed Behavior:**

* Prevents effective use of the mouse
* Prevents normal keyboard input
* Makes the system difficult to control until the process is terminated

---

### 2. Clicker Virus

**Description:**
A Java application that continuously generates rapid mouse-click events using the `Robot` class.

**Observed Behavior:**

* Repeatedly clicks the mouse at high speed
* Opens multiple applications and windows unintentionally
* Can significantly slow down the system
* May lead to application crashes due to excessive input events

---

## Technologies Used

* Java
* Java AWT `Robot` Class

## Disclaimer

These projects were created purely for educational purposes while learning Java programming. They are demonstrations of how automated input can affect a computer system and should not be used to disrupt or interfere with other users' devices.

This repository is intended for learning and historical reference only. The programs are simple experiments in input automation and are not designed for malicious use.
