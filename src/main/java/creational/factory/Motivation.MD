# Factory Patter #
* Object creation logic becomes too convoluted
* Constructor is not descriptive
* Having an object with 10 constructor arguments is not productive
  * Name mandates by name of containing type 
  * Cannot overload with same sets of arguments with different names
  * Can turn into 'overloading hell'
* Wholesale object creation (non-piecewise, unlike Builder) can be outsourced to a factory
  * A separate function (Factory Method)
  * That may exist in a separate class (Factory)
  * Can create hierarchy of factories with Abstract Factory
***A component responsible solely for the wholesale (not piecewise) creation of objects.***