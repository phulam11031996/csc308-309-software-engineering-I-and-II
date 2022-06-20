# ocp-templatemethod-lab
CSC 309 Lab on the Open-Closed Principle and Template Method Design Pattern

*A software artifact (e.g., module, class, package, component) should be open for extension but closed for modification*

*Apply the template method design pattern to define an extensible skeleton (i.e., template) of an algorithm and allow subclasses to redefine certain steps of the algorithm (that's being open for extension) without changing its structure and without having to change other classes in the design (that's being closed for modification).*

## Overview of this repo

Inside you will find the beginnings of a ground-breaking coffee brewery. Unfortunately in the rush to get features completed the main CoffeeMaker class is starting to turn into a big ball of mud.

You'll start by adding one more feature to it to get it into a right mess, then we'll fix it up good.

There's also an example before and after refactoring placed in separate folders (the House Template example presented in class).

## Getting started

1. Duplicate this repo so you can have this starter code. Don't clone it because you won't push to this repo and don't fork it because you won't be able to make your fork private.
   * There are different ways to do duplicate this repo, and perhaps the simplest one is to download this code using GH download ZIP button in this page.
   * Then, you unzip it locally in a new folder that will represent your new repo.
   * To make this new folder a git folder, run *git init* in that folder.
   * Go to github.com and create a new repository at GitHub. Mark the repository as private.
   * Follow GH instructions to link your local git repo to this newly created GH repo.
      * git remote add origin https://github.com/<your_user>/<your_new_repo>.git
      * git branch -M main
      * git push -u origin main
   * Add me to your GH repo so I can access your solution later. My GH username: bcdasilv
2. Start working on the code (move to next section).

## Making the situation worse...

### Feature: Making a new type of coffee -- Americano

* **As a** WWII veteran
* **I want** to drink an Americano coffee
* **So that** I can remind the old times during the WWII in Italy when we had to dilute espresso with hot water

Add a new type of coffee to ```CoffeMaker``` that follows this recipe: first, ```boilWater()``` and then ```brewEspresso()``` like the other types of coffee, then ```addIngredients()``` (which in this case it means to add more hot water -- ```System.out.println("Add more hot water")```), and the ```finalTouch()``` is to add sugar and cream (```System.out.println("Add sugar and cream")```).

## ...What's gone wrong?

Even though it is doable to keep adding multiple methods every time you need different types of coffee, it is error-prone, code duplication increases, the class becomes too large, and one day you may not be able to evolve your CoffeeMaker class to another version while you still want to accomodate new types of coffee.

## How to fix it?

*Apply the Open-Closed Principle to make the CoffeeMaker class open for extension and closed for modification by implementing the Template Method design pattern on this design*
