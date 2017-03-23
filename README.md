## Item 30: Use enums instead of int constants

Enums provide many advantages:
* effectively singletons
* string representation of a object, from _int_ it's difficult
* methods, constructors, fields
* compile type safety (APPLE != PLANET)
* they implements _Comparable_, _Serializable_, _Object_ methods

Instead of using one method with `switch` over enum entries, 
use abstract method and implement in for every entry (#code).

If you overriding `toString()` implementation, also add utility `fromString` method (#code) 
