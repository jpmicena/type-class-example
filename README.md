# Type Classes Example

This is supposed to be a simple example of type classes on Scala,
heavily inspired by the
[Scala with Cats](https://www.scalawithcats.com/) book

In this example,
you should understand the `external` classpath as if it was some dependency,
a external lib you do not control.

The idea is to provide a domain with some generic methods
that can be used regardless of the underlying "library".
For instance, Pokemon Gen1 and Gen2 could be two different versions of a library,
the domain stays the same as long as you provide type classes implementations for both versions.

