# refactor-example-exam
An example exercise for the exam

## What is wrong in this code and how can you improve it?

Problems to fix:
- Shape and Rectangle expose their fields as public
- Shape has functionality that belongs in Rectangle: calculation of the area of a random shape is not the same as for a rectangle
- The Rectangle constructor allows you to make a square, without it being of the type Square
- The area function and the lengths assumes that we only use integers.
- Square has functionality to keep the 2 lengths equal, but the fields are still exposed.
- We aren't programing to an interface

Other considerations:
- what if we want to use Shape as the parent for a circle? Taking into account the Liskov substitution principle: objects of a superclass should be able to be replaced with objects of a subclass without affecting the correctness of the program.

## How to refactor
Please note that on the exam there isn't always a unique best answer. Multiple possibilities can be correct, as long as you can tell me the pros and cons of them.

In this case, the easiest refactor might be to make Shape an Interface that contains the function area and remove the inheritance. Advantage: easy, Disadvantage: area of a rectangle needs 2 parameters and square only 1, is harder to add different shapes.

Another possible refactor is to remove the inheritance and make a class that calculates the area of a given shape. Shape can be an empty interface in this case. If you expect that many more shapes will be included in the program in the future, you could use a factory that returns a calculator class. Advantage: easy to expand, disadvantage: less legible, might be overkill.