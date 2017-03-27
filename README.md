## Item 30: Use enums instead of int constants

Enums provide many advantages:
* effectively singletons
* string representation of a object, from _int_ it's difficult
* methods, constructors, fields
* compile type safety (APPLE != PLANET)
* they implements _Comparable_, _Serializable_, _Object_ methods

Instead of using one method with `switch` over enum entries, 
use abstract method and implement in for every entry (#code).

If you overriding `toString()` implementation, also add utility `fromString(String s)` method (#code).
 
Also remember about strategy pattern - enum with strategy logic inside main enum.

## Item 31: Use instance fields instead of ordinals

Never rely on `ordinal()` - the position of enum constant may change. 
Use instance field for that purpose.

## Item 32: Use EnumSet instead of bit fields

Bit fields are mostly obsolete these days, use `EnumSet.of()` to represent a set of enum values.

## Item 33: Use EnumMap instead of ordinal indexing

Never use ordinals, vol.2. `EnumMap<Enum, Object>` will help you to group objects by enum type.

## Item 34: Enums can implement interfaces

You can not extend an enum, but you can implement an interface. As a client, you may implement your
own enum realization of a library interface.