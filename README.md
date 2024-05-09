# Builder-Design

Builder-Design is a project that uses the builder design pattern to 
create a pizza. It contains several interface and implementation files, however,
there are only three main levels to this builder design.
There is the class that actually contains the pizza attributes, the builder class
that blueprints the desired pizza attributes and sets them, and the
engineer class that directs the actions of the builder and instructs it
to create the actual pizza object. Finally, in BaseClass, we test our design 
pattern by using a builder and engineer to construct a pizza and print out the
attributes of that pizza.

## Build Instructions

To build the project, simply build the java files found in src if they are
not already compiled on your machine. Then, run src/BaseClass.java to test the program.