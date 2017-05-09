## Class :

A `Class` is a template in which we can define objects. One class can have many objects.  
 
A `class` is nothing but a blueprint or a template for creating different objects which defines its properties and behaviors. Java class objects exhibit the properties and behaviors defined by its class. A class can contain fields and methods to describe the behavior of an object.

## Object : 

It consists of Attribute and Behaviour. Attributes/state ( datatypes ) and Behaviour (Methods)
Example: Mobile is a `class`. color, price, brand, module ID are some of the attributes of module. Call, message, facecall etc are           some of the behaviour.  
```
class mobile{ //this is called creating a class

double price; // declaring variables /State of mobile
String color,brand,moduleID;

public void call(){ // creating a method which is basically a behaviour. 

}

public void message(){

}

}
```
## Inheritance

When a new class (Sub Class) is derived from exisiting class (super class), this process is called inheritance. The new class uses the behavoiur of exisiting class. You can resume sone of the attributes of exisiting class. The format to add sub class is class subclass name extends super class name.

Suppose A is super class and B is sub class then the format will be as below. 
class B extends A {}

## Variable

A variable is consider as a container in which we store the value/data throught the program. Every variable is assigned to a data type which will say that what and which kind of value will be stored. 

Below is the list of data types:

* int : Plainly used for numbers 
> int myNumber;
> myNumber = 5;

* boolean : Only used for true or false
> boolean rain=true;

* char:Used for single chanrecter 
>char initial='P';

* double : Used for number with decimal 
>double percentage =73.5;

* float
* long
* short
* byte
* String


## Refrence Link

http://docs.oracle.com/javase/tutorial/java/TOC.html
