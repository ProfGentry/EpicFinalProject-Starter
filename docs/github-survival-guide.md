# GitHub Survival Guide
## The 5 Git Commands You Need for This Course

Git may look complicated, but for this project you only need **five core commands**. These commands allow you to download your project, create weekly branches, save your work, and upload it to GitHub.

If you remember these **five** commands, you can complete the entire project.

# The Git Workflow (Big Picture)

Every week you will follow the same development pattern:
<img width="903" height="173" alt="image" src="https://github.com/user-attachments/assets/fceda35e-1b32-4be6-92fd-bbc6560092dc" />
That’s it. Five steps.

---

# 1. Clone — Download Your Repository

Clone your repository **once** at the beginning of the project. This downloads your GitHub repository to your computer.
### Command
```git clone REPOSITORY_URL```

### Example
git clone https://github.com/jdoe/java-final-project.git

Then move into the project folder:

```cd java-final-project```

Now the project is ready to open in your IDE.

---

# 2. Branch — Create a Weekly Deliverable Branch

Branches allow you to work on new features without affecting the main project.

Create a branch for each week.

### Command
```git checkout -b branch-name```

### Example
```git checkout -b week1-structure```


### Branch Names Used in This Project

| Week | Branch |
|-----|------|
| Week 1 | `week1-structure` |
| Week 2 | `week2-core-actions` |
| Week 3 | `week3-collections` |
| Week 4 | `week4-game-logic` |
| Week 5 | `week5-final-build` |

---

# 3. Add — Stage Your Changes

Before saving your work, Git needs to know which files changed.

### Command
```git add```

This tells Git to include **all modified files** in the next commit.

Think of this step as **selecting files to save**.

---

# 4. Commit — Save Your Work

A commit records your work in the project history.

### Command
```git commit -m "message describing what you changed"```
### Example
```git commit -m "Added main menu and game loop"```

### Good Commit Messages
- Added Player class and attack method
- Implemented enemy damage system
- Created inventory ArrayList
### Bad Commit Messages
- upage
- stuff
- idk

Commit your work **regularly as you develop features**.

---

# 5. Push — Upload Your Work to GitHub

Push sends your commits from your computer to GitHub.

### Command
```git push origin branch-name```
### Example
```git push origin week1-structure```


Your code is now stored safely on GitHub.

---

# The Weekly Workflow (Example)

Here is what a typical development cycle might look like:

```git pull origin main
git checkout -b week2-core-actions
git add .
git commit -m "Added player attack system"
git push origin week2-core-actions
```

After pushing your code, submit your **GitHub repository link and branch name in Canvas**.

---

# Minimum Commit Expectations

Your repository should show **consistent development over time**.

Minimum commits each week: **3 commits**

### Example Commit History
- Created Player class
- Implemented attack method
- Added enemy damage system

Avoid committing everything at the last minute.

---

# If Something Breaks

Git mistakes happen. Even experienced developers occasionally summon chaos.

### See what changed
```git status```

### See commit history
```git log```


### Ask for help

If something seems wrong, ask your instructor or classmates before trying random commands from the internet.

---

# Quick Command Reference

| Command | Purpose |
|------|------|
| `git clone` | downloads the repository |
| `git checkout -b` | creates a new branch |
| `git add .` | stages changes |
| `git commit` | saves changes |
| `git push` | uploads work to GitHub |

Memorize these five commands and you can complete the entire project.

---

# Final Advice

Commit often. Push regularly. Keep your code organized.

GitHub is not just a place to store files — it shows **how you built your project over time**, which is exactly how professional software development works.
