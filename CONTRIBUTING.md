As the interest in our SSO implementation grows, we receive requests on how to contribute to our applications... and we are very happy about these requests!

# Our model

We chose to adopt a model similar to that of the Apache Software Foundation, which involves contributors signing and submitting a contributor license agreement. These represent a license that the contributor grants to Hochschule Heilbronn and covers contributions to all of our projects. That is, it is it not limited to 
Helpdesk or our Welcome application, but also covers a growing set of additional projects.

To this end, we adapted the contributor agreements used at the Apache Software Foundation for our purposes. In particular, we replaced mentions of the Foundation with mentions of the University (Hochschule Heilbronn) and added a clause that the agreement is governed by German law. Please read the license agreements carefully before signing them.

The primary contributor agreement is the Individual Contributor License Agreement which is submitted by each individual contributing person. However, if that person is working under contract, we ask that their employer sign and file an additional Corporate Contributor License Agreement which certifies the consent of the employer with the actions of the contributing person.

We ask that you discuss the topic of contribution with your employer even if you plan to create your contributions in your spare time. Being open from the start will avoid problems later and your employer will likely be happy to sign the corporate contributor license agreement after you have discussed the particulars.

The contributor license agreement represents a license that the contributor gives to Hochschule Heilbronn and which allows us to sublicense the contribution.

The contribution might be a first step towards a more generic extension of the framework which we would eventually like to have licensed under the Apache License to maximize its usability. 

Having separate contributor license agreements allows us to refactor such contributions and to eventually move them from a GPL module to an Apache-licensed module.

# Contributor license agreements
Details on how and where to submit the agreements are included in their respective texts.

- [Individual Contributor License Agreement (ICLA) - always required](templates/ccla.txt)
- [Corporate Contributor License Agreement (CCLA) - strongly recommended when contributor is employed](templates/icla.txt)

# How to make contributions

Contributions should be submitted by sending a pull request to the project to which you wish to contribute. If your contribution addresses an existing bug or feature request listed in the project’s issue tracker, please reference it. (If not, consider opening a new issue before sending your pull request.)

Prolific contributors may eventually be granted write access to the code repositories. Access to the repositories is granted on a per-project basis.

# Copyright
All contributions remain under the copyright of the original authors (or their employers).

# Integrating third-party code
Code integrated from third parties by others than their original authors may not have any copyright notice, @author tags, nor other kind of attribution removed.

In general, integration of third-party code should be avoided. Instead, the required libraries should be specified as dependencies.

Third-party code that is integrated must be compatible with our license. For Apache-licensed modules, it must be compatible with the Apache license.

# Preparing a pull request

In order to contribute to the project, you need to create a pull request. This section briefly guides you through the best way of doing this:
 
- Before creating a pull request, create an issue in the issue tracker of the project to which you wish to contribute
- Fork the project on GitHub
- Create a branch based on the branch to which you wish to contribute. Normally, you should create this branch from the master branch of the respective project. In the case you want to fix a bug in the latest released version, you should consider to branch off the latest maintenance branch (e.g. 1.2.x). If you are not sure, ask via the issue you have just created. Do not make changes directly to the master or maintenance branches in your fork. The name of the branch should be e.g. feature/[ISSUE-NUMBER]-[SHORT-ISSUE-DESCRIPTION] or bugfix/[ISSUE-NUMBER]-[SHORT-ISSUE-DESCRIPTION].
- Now you make changes to your branch. When committing to your branch, use the format shown below for your commit messages. Note that # normally introduces comments in git. You may have to reconfigure git before attempting an interactive rebase and switch it to another comment character.

```
#[ISSUE NUMBER] - [ISSUE TITLE]
[EMPTY LINE]
- [CHANGE 1]
- [CHANGE 2]
- [...]
```
- You can create the pull request any time after your first commit. I.e. you do not have to wait until you are completely finished with your implementation. Creating a pull request early tells other developers that you are actively working on an issue and facilitates asking questions about and discussing implementation details.