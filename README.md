# COMP373-VisitorPattern

This is Nida Hameed and Molly Dunn's implementation of an example of the Visitor pattern. Our implementation resembles that of a boutique inventory room. 

We implement a Client class (Client.java) as the consumer of the classes, with a Visitor Interface (StorageRoomVisitor.java) which declares the visit operations. We then used the StorageRoomn.java class as the ConcreteVisitor to implement the visit methods.
For the visitable interface we created the Item.java interface to serve as the "entry point" to enable the visitor object. 
Finally as our ConcreteVisable classes, we implemented thw Dress.java and Heels.java classes.
To finish up we implemented JUnit Testing files which can be found in the Testing source folder, model.testing package.

To Run: Open and run the Client.java file in the view package.

To Test: Run the testDress.java adn the testHeels.java files in teh model.testing package. 
