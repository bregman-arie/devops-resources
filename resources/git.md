# Git

## Learn Git

Name | Comments
:------|:------:
[git-scm](https://git-scm.com) | The best place (imho) to learn everything about Git (through reading)
[Interactive Git Branching Learning](https://learngitbranching.js.org/) | Visual and interactive way to learn Git branching
[Learn git concepts, not commands](https://dev.to/unseenwizzard/learn-git-concepts-not-commands-4gjc) | Article on Git concepts
[Codeacademy Learn Git](https://www.codecademy.com/learn/learn-git) | Not Free 
[Git for Computer Scientists](https://eagain.net/articles/git-for-computer-scientists/) |
[shortcutfoo](https://www.shortcutfoo.com/app/dojos/git) |  interactive learning 

## Best Practices

* Use a descriptive commit message
* Make each commit a logical unit
* Incorporate others' changes frequently
* Share your changes frequently
* Coordinate with your co-workers
* Don't commit generated files

## CheatSheet

* Clone a repository: `git clone https://github.com/bregman-arie/devops-resources.git`
* Pull changes from remote repository: `git pull`
* Pull changes without trying to merge the changes between the local branch and the remote one: `git pull --ff-only`

### Branches
* Switch to a branch called "main": `git checkout main`
* Create (if doesn't exists) and switch to a branch called `devel`: `git checkout -b devel`
* List branches: `git branch`
* Update based on status of remote branches: `git remote prune origin`
* Delete local branch: `git branch -d some-branch`
* What are the changes if merging branch y into x: `git merge-tree $(git merge-base x y) x y`

### Staging

* See what the current status in the repository: `git status`
* Add changes to the staging area: `git add <FILE>` or `git add .` to add everything

### Commits
* Create a commit: `git commit`
* List of latest commits: `git log --oneline`
* Push commits to the remote branch: `git push origin main`
* Revert to commit X

```
git revert --no-commit X..HEAD
git commit
```

### References

* All references in current repository: `find .git/refs/`
* Update master reference: `git update-ref refs/heads/master <SOME_COMMIT>`

### Tags

* Create a new tag: `git tag -a "v0.0.1" -m "First release...yay`
