# tractor-manager-backup

# Tractor Manager OOP Project

This is my Object-Oriented Programming final project for college. The app is a simple command-line Java program that manages a list of tractors using the four main principles of OOP.

---

##  How to Run

1. Clone the repository or download it.
2. Open it in GitHub Codespaces or your IDE.
3. Make sure your Java version is 21 or above.
4. Compile the files (they're all in `ie.atu.tractormanager` package).
5. Run `Main.java`.

---

## What the App Does

- Lets you add tractors with details like VIN, age, registration status, and horsepower.
- You can choose between two types: Farm or Industrial tractors.
- Stores tractors in a fixed-size array (you set the max at startup).
- You can search, delete, count, and list tractors.
- You can also sort them by VIN or run maintenance on all of them.

---

## OOP Features Used

This app follows the 4 Pillars of Object-Oriented Programming:

- **Encapsulation** – Variables are private and accessed via getters/setters.
- **Inheritance** – `Tractor` extends `Vehicle`. `FarmTractor` and `IndustrialTractor` extend `Tractor`.
- **Polymorphism** – Maintenance is handled differently depending on the type of tractor.
- **Abstraction** – `Vehicle` and `Tractor` are abstract classes that can’t be directly created.

---

##  Features

| Feature | Included |
|--------|----------|
| Add, Delete, Find, Count, List Tractors |
| Sort tractors by VIN | ✅ |
| Perform Maintenance (Polymorphism) |
| Fixed array with user-defined size |
| Clean, modular code |
| Console-based user menu |
| Separate files for each class |

---

## Extra Enhancements

- Tractors can be sorted alphabetically by VIN.
- Maintenance behavior is unique per tractor type using overridden methods.
- User chooses the number of tractors at runtime.
- Fully uses arrays (no collections like ArrayList).

---

# Notes

- Project follows the required GitHub structure and commit frequency.
- All class files are in the `ie.atu.tractormanager` package.

---

# Screencast Link

[SCREENCAST LINK HERE]

---

# Submission

- All source code and documentation are stored in this GitHub repository.
- A zip file of this repo will be uploaded to Moodle as instructed.

