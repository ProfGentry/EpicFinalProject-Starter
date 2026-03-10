# GitHub First-Time Setup Guide
## Getting Your Computer Ready for the Final Project

Before you begin working on your final project, you must set up **Git** and connect it to your **GitHub account**.

This process only needs to be completed **once**.

After setup is complete, you will be able to clone repositories, track code changes, and submit work using GitHub.

---

# Step 1 — Create a GitHub Account

If you do not already have a GitHub account:

1. Go to:
[https://github.com](https://github.com)


2. Click **Sign Up**
3. Choose a professional username
4. Verify your email address

Your GitHub account will host your project repository.

---

# Step 2 — Install Git

Git is the software that manages version control on your computer.

### Windows

Download Git from:
[https://git-scm.com/download/win](https://git-scm.com/download/win)


Run the installer and accept the default settings.

During installation you will see options about editors and PATH settings.  
The default selections are fine for this course.

---

# Step 3 — Configure Git

Git needs to know your name and email address so it can label your commits.

Run the following commands in a terminal.

### Set Your Name
```git config --global user.name "Your Name"```

### Example:
```git config --global user.name "Jane Doe"```

---

### Set Your Email
Use the same email associated with your GitHub account.

```git config --global user.email "your-email@example.com"```

### Example
```git config --global user.email "jane.doe@email.com"```

---

### Verify Configuration
```git config --list```

You should see your name and email in the list.

---

# Step 4 — Fork the Starter Repository

Your instructor will provide the **starter repository link**.

### Example:
```https://github.com/ECPI-SDC/java-final-project-starter```


Click **Fork** in the top-right corner of the page.

This creates your own copy of the repository in your GitHub account.

### Example:
```https://github.com/yourusername/java-final-project```


This is the repository you will work in for the entire project.

---

# Step 5 — Clone Your Repository

Cloning downloads the repository to your computer.

Make sure you are in the file location you want to save your repository (i.e. Documents)

Open a terminal or Git Bash and run:
```git clone https://github.com/yourusername/java-final-project.git```

Move into the project folder:
```cd java-final-project```

Your project is now on your computer.

---

# Step 6 — Create and Open the Project in Eclipse

Once you have cloned your repository, you need to open it as a **Java project in Eclipse**.

Eclipse organizes code into **workspaces and projects**, so we will import the repository as a project.

<img width="903" height="202" alt="image" src="https://github.com/user-attachments/assets/376c133f-372e-4245-8bda-381eb7994145" />

---

## 6.1 Open Eclipse

Start Eclipse and select your workspace location when prompted.

### Example 
workspace: ```Documents/eclipse-workspace```

Click **Launch**.

---

## 6.2 Create a New Java Project

In Eclipse:

1. Click **File**
2. Select **New**
3. Click **Java Project**

You will see the New Java Project window.

---

## 6.3 Name the Project

Use the same name as your repository.

### Example:
- Project Name: ```epic_final_project```


Make sure the following options are enabled:

✔ Use default JRE  
✔ Use project folder as root for sources and class files (Project Layout)

Click **Finish**.

---

## 6.4 Add the Repository Files to the Project

Now we will copy the files from your cloned GitHub repository into the Eclipse project.

1. Locate the cloned repository on your computer.

### Example location:
```epic-final-project```

Inside the folder you should see something like: 
- src/
- docs/
- screenshots/
- README.md

---

## 6.5 Copy the Source Files

Inside the repository folder:

Open the `src` folder.

You should see the Java files:
- Main.java
- Game.java
- Player.java
- GameMode.java
- Utils.java

Select all of these files and **copy them**.

---

## 6.6 Paste the Files into Eclipse

In Eclipse:

1. Expand your project in the **Package Explorer**
2. Select **Paste**

Eclipse will now add the Java files to your project.

---

## 6.7 Verify the Package Structure

Your files should now appear like this:

src

├── Main.java

├── Game.java

├── Player.java

├── GameMode.java

└── Utils.java


If the package appears correctly, Eclipse has imported the files successfully.

---

## 6.8 Run the Program

To verify everything works:

1. Right-click **Main.java**
2. Select **Run As**
3. Click **Java Application**

The console should display the program menu.

Example output:

Welcome to the Java Adventure

=== Main Menu ===

1. Start Adventure
2. View Player Stats
3. View Game Mode

4. Exit


If you see this menu, your project setup is complete.

---

# Important Tip

Do **not** rename the package:

edu.ecpi.finalproject


---

# Step 7 — Verify Git Is Working

Run this command in the project folder:
```git status```


You should see something like:
```On branch main
nothing to commit, working tree clean
```


This means Git is working correctly.

---

# Optional — Install GitHub Desktop

If you prefer a graphical interface instead of command line tools, you may install **GitHub Desktop**.

Download:
```https://desktop.github.com```


GitHub Desktop allows you to:

- clone repositories
- commit changes
- push code to GitHub
- manage branches

The command line workflow will still be demonstrated in this course.

---

# What Happens Next

Once setup is complete, you will begin the **weekly development workflow**.

Typical workflow:
```git checkout -b week1-structure
git add .
git commit -m "Created main menu"
git push origin week1-structure
```


Full instructions are available in:
[docs/github-survival-guide.md](docs/github-survival-guide.md)


---

# Common Problems

## Git command not found

Git may not have been installed correctly.  
Reinstall Git and restart your terminal.

---

## Permission denied when pushing

Make sure you are pushing to **your forked repository**, not the original starter repository.

---

## Repository not found

Check that the repository URL is correct and that you are logged into GitHub.

---

# Final Advice

Take your time during setup and make sure everything works before starting the project.

Once Git is configured correctly, it becomes a powerful tool for managing your code and tracking your development progress.
