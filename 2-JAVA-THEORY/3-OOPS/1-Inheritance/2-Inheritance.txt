Inheritance: (Is-a relation ship)



Adv : Reduce  the length of the code and reduce the redundency of code.

Application with out Inheritance
---------------------------------------
class A{
void m1(){}
void m2(){}
}

class B{
void m1(){}
void m2(){}
void m3(){}
void m4(){}
}
class C{
void m1(){}
void m2(){}
void m3(){}
void m4(){}
void m5(){}
void m6(){}
}

Application with  Inheritance
---------------------------------------
class A{ //2   parent or super or base class
void m1(){}
void m2(){}
}

class B extends A{ //4 child or sub or derived class
void m3(){}
void m4(){}
}
class C extends B{ //6
void m5(){}
void m6(){}
}
---------------------------------------------------
extends--> provides relation between two classes.
----------------------------------------------------

class A{ //2
void m1(){}
void m2(){}
}

class B extends C{ //6
void m3(){}
void m4(){}
}
class C extends A{ //4
void m5(){}
void m6(){}
}

---------------------------------------------------
class A{ //2
void m1(){}
void m2(){}
}

class B { //6
void m3(){}
void m4(){}
}
class C extends A{ //4
void m5(){}
void m6(){}
}
--------------------------------------------------------
class A{ 
void m1(){}
void m2(){}
}

class B { 
void m3(){}
void m4(){}
}
class C extends A,B{ // Not allowed, Java not support multiple inheritance.
void m5(){}
void m6(){}
}

---------------------------------
object creation

class A{ 
void m1(){}
void m2(){}
}

class B { 
void m3(){}
void m4(){}
}
class C extends B
void m5(){}
void m6(){}

C c=new C();
c.m1();c.m2();
c.m3();c.m4();
c.m5();c.m6();
}
------------------------------------------

Root class of all java classes is Object (java.lang.*)

class A extends Object{ 
void m1(){}
void m2(){}
}

class B { 
void m3(){}
void m4(){}
}
class C extends B
void m5(){}
void m6(){}
}