## Item 30: Use enums instead of int constants

Enums provide many advantages:
* effectively singletons
* string representation of a object, from _int_ it's difficult
* methods, constructors, fields
* compile type safety (APPLE != PLANET)
* they implements _Comparable_, _Serializable_, _Object_ methods

Instead of using one method with `switch` over enum entries, 
use abstract method and implement in for every entry (#code).

If you overriding `toString()` implementation, also add utility `fromString` method (#code).
 
Also remember about strategy pattern - enum with strategy logic inside main enum.

## Item 31: Use instance fields instead of ordinals

Never rely on `ordinal()` - the position of enum constant may change. 
Use instance field for that purpose.

## Item 32: Use EnumSet instead of bit fields

Bit fields are mostly obsolete these days, use `EnumSet.of()` to represent Set<EnumType>