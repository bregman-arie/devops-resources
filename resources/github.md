# GitHub

## Common Issues

* 'can't sync because main is not tracking [PROJECT NAME]'

This happens the branch is no longer tracking main from upstream. Can be fixed with this command: `git push --set-upstream origin main`.

## Cheat Sheet

### Repository

* Clone repository: `gh clone <REPO NAME>`
* Sync your fork from source repo: `gh repo sync --source <USERNAME>/<REPONAME>`

### Pull Requests

* Create PR: `gh pr create --title "Some Pull Request ;)`
* List PRs: `gh pr list`
* Change to PR (aka checkout): `gh pr checkout <PR NUMBER>`
* Update PR: `git push`

### CI

* List builds/workflow runs: `gh run list`

### Rebase

* Rebase current branch commits on top of latest changes in main branch: `git rebase origin/main`
