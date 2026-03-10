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

# Step 6 — Open the Project in Your IDE

Create a project folder using your preferred IDE.

Create a Java project:
- Project Name: epic_final_project

Open the folder that contains the repository files.

You should see folders such as:

- src/
- docs/
- screenshots/
- README.md


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
