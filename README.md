# 📝 NoteApp - Application de Gestion de Notes

## Description
NoteApp est une application mobile développée en **Kotlin** permettant aux utilisateurs de créer, modifier et supprimer des notes facilement.

## Stack Technique

- **Langage** :  
  ![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)

- **Frameworks & Bibliothèques** :  
  ![AndroidX](https://img.shields.io/badge/AndroidX-3DDC84?style=for-the-badge&logo=android&logoColor=white)
  ![Material UI](https://img.shields.io/badge/Material_UI-757575?style=for-the-badge&logo=material-design&logoColor=white)
  ![Gson](https://img.shields.io/badge/Gson-FF6F00?style=for-the-badge&logo=google&logoColor=white)

- **Outils de développement** :  
  ![Android Studio](https://img.shields.io/badge/Android_Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
  ![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

- **Version Control** :  
  ![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
  ![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

## Fonctionnalités Principales

- ✍️ **Créer et modifier des notes** avec un titre et un contenu.
- 🔄 **Mise à jour en temps réel** après modification d’une note.
- 🗑️ **Suppression des notes** avec confirmation pour éviter les pertes accidentelles.
- 📂 **Stockage et récupération** des notes en JSON via Gson.

## Prérequis

- **Android Studio** (dernière version recommandée)
- **Gradle** pour la gestion des dépendances

## Installation et Configuration

1. **Cloner le dépôt** :

   ```bash
   git clone https://github.com/ThomasBerbigier/NoteApp.git
   cd NoteApp
   
2. **Ouvrir le projet dans Android Studio** :
   - Lance **Android Studio**
   - Sélectionne **"Open an existing project"** et ouvre le dossier `NoteApp`
   - Attends la synchronisation de **Gradle**

3. **Exécuter l'application** :
   - Assurez-vous d’avoir un **émulateur** ou un **appareil physique connecté**
   - Cliquez sur ▶️ **Run App** dans Android Studio

## Personnalisation

Vous pouvez modifier les fichiers suivants pour personnaliser l’application :

- `MainActivity.kt` : Gestion de l'affichage et des interactions avec l'utilisateur.
- `Note.kt` : Modèle de données utilisé pour stocker les notes.
- `NoteAdapter.kt` : Gestion de l'affichage des notes dans une liste.

---

---

💡 **Développé par [Thomas Berbigier](https://github.com/ThomasBerbigier) !** 🚀

