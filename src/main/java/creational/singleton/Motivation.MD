# Singleton Patter #
* For some components it only makes sense to have one in the system
  * Database repository
  * Object factory
* E.g the constructor call is expensive
  * We only do it once
  * We provide everyone with the same instance
* Want to prevent anyone creating additional copies
* Need to take care of lazy instantiation and thead safety
  ***A component which is instantiated only once.***