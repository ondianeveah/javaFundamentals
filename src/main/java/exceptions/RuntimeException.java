package exceptions;

public class RuntimeException {
    /*1. RuntimeException
A runtime exception happens due to a programming error. They are also known as unchecked exceptions.

These exceptions are not checked at compile-time but run-time. Some of the common runtime exceptions are:

Improper use of an API - IllegalArgumentException
Null pointer access (missing the initialization of a variable) - NullPointerException
Out-of-bounds array access - ArrayIndexOutOfBoundsException
Dividing a number by 0 - ArithmeticException
You can think about it in this way. “If it is a runtime exception, it is your fault”.

The NullPointerException would not have occurred if you had checked whether the variable was initialized or not before using it.

An ArrayIndexOutOfBoundsException would not have occurred if you tested the array index against the array bounds.
    * */
}
