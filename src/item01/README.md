# Item 1: Consider static factory methods instead of constructors
<hr>

Item 1 stats that using static factory methods instead of constructor is better because :

1. Because they have names which makes the code more readable and reduces the time
that client should spend reading the documentation.
   
1. You can make your class [*instance-controlled*](https://stackoverflow.com/questions/25354112/instance-controlled-classes-and-multithreading).
One such example is ```java.lang.Boolean.valueOf()``` method.

1. They can return any subtype of their return type.

1. The class of the returned object can vary from call to call and as a function of their input parameters.

<hr>

The book also gives detailed information on the disadvantages of static factory methods too.