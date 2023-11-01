# CircleGenerator

This Java program generates circles that you can print and enjoy. You can create circles with customizable properties.

## Features

- Create cirlces with a specified number of the radius of the circle.
- Customize the decoration of the circle with your choice of characters.

## Usage

You can use the `CircleGenerator` class to create Circles:

### Creating a Circle

To create a cirlce with a specified radius of the circle using the default decoration (asterisks `*`), you can use the `drawCircle` method:

```java
String circle = CirlceGenerator.drawCircle(radius, symbol);
```

## Printing the Circle
You can then print the generated circle using System.out.println() or save it to a file.

## Example

Here's a simple example of how to use the CircleGenerator class to create a circle:
```java
public class Main {
    public static void main(String[] args) {
    String circle = CircleGenerator.drawCircle(5,"*");
    System.out.println(circle);
    }
}
```
This will generate and print a circle with a radius of 5 using asterisks as decoration.

## Disclaimer

The circle will not look perlectly round in a standard text file, due to the representation of the text editor.

# BUT WHY???
IDK dude, just wanted to show that i'm better than c4vxl
```
     *     
  *******  
 ********* 
 ********* 
 ********* 
***********
 ********* 
 ********* 
 ********* 
  *******  
     *
```
---
## Developer
This Project was developed by [rusticmouse]
