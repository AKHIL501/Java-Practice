	Collections

		key concepts:-
						arrays
						interface:- abstract methods and abstract modifiers
						typecasting
						auto-boxing
						wrapperclasses
						innerclasses
						***toString()
						instanceof
						for-each (1.5)
						abstract classes
						implementation class (implements particular class)

	Collection :- Collections and Arrays both are almost same, Arrays  are used to represent group of elementsas as a single entity 
				  that elements must be same(homogeneous) and must be fixed number, 
				  Collections also used to represent group of objects as a single entity that elements are hetrogeneous
				  Collection framework is providing very good architecture to store the data and to manipulate the data.


				  Arrays:
						1.Represents:- Group of objects as a single entity these elements are homogeneous.
						2.Data Types:- Primitive time:-int[] and Object type :- Emp[]
						3.Size:- Fixed
						5.Memory:- Wastage is Heavy (this is the problem with fixed size)
						6.With respect the memory arrays are not recomended.
						7.Opertations:- Storing and retriving.
						8.Operations :- Operations are not possible.
						9.Methods:- Not supports no methods. (with out methods the operatins becomes complex).
						10.Perfomance:- With respect perfomance arrays are good.

				 Collections:
						1.Represents:- Group of objects as a single entity these elements are may be homogeneous and hetrogeneous
						2.Data Tyeps:- only object data
						3.Size:- Growable in nature 
						5.Memory:- With respect the memory collections are very good.
						6.With respect the memory arrays are not recomended.
						7.Opertations:- Storing and retriving.
						8.Operations :- Operations are  possible.
						9.Methods:-  supports predefined methods. 
						10.Perfomance:- Compated to arrays little bit low perfomance.


				Key interfaces of the collection framework:
						1.Collection
						2.List
						3.Set
						4.SortedSet
						5.NavigableSet
						6.Map
						7.SortedMap
						8.NavigableMap
						9.Queue
						10.Enumeration
						11.Iterator
						12.ListIterator
						13.Map.Entry
						14.Comparable (java.lang)
						15.Comparator

				Collection framework containsn group of classes and interfaces, that are presentd in on package the package name is called 
				java.util

				The root interface of the collection framework is Collection (15 methods). The root class of all java classes is Object class (11 methos).

				To check collection predefined support use javap java.util.Collection

				public interface java.util.Collection<E> extends java.lang.Iterable<E> {
				  public abstract int size();
				  public abstract boolean isEmpty();
				  public abstract boolean contains(java.lang.Object);
				  public abstract java.util.Iterator<E> iterator();
				  public abstract java.lang.Object[] toArray();
				  public abstract <T extends java/lang/Object> T[] toArray(T[]);
				  public abstract boolean add(E);
				  public abstract boolean remove(java.lang.Object);
				  public abstract boolean containsAll(java.util.Collection<?>);
				  public abstract boolean addAll(java.util.Collection<? extends E>);
				  public abstract boolean removeAll(java.util.Collection<?>);
				  public abstract boolean retainAll(java.util.Collection<?>);
				  public abstract void clear();
				  public abstract boolean equals(java.lang.Object);
				  public abstract int hashCode();
				}

				
				****TreeSet and TreeMap deosn't support hetrogeneous data


				Legacy Classes: 
								The classes are introduced in 1.0 version those classes are cleed legacy classes.



									(1.2)
								Collection (I)

						(extends)/		\

							List(I)
				(implements)/	/	\ 
				ArrayList(C)LinkedList(C)Vector(C)(1.0)
												|
											Stact(C)(1.0)
					
						
						I-----> Interface
						C-----> Class 
					
					
					
					Characterstics:-
									1.Version:- Every class is indroduced in different version
									2. Every collection able to hold hetrogeneous data but in entire collection 2 class are not support
									hetrogeneous data 1.Treeset 2.TreeMap
									3.Some classes are allows duplicate objects but some classes are not allowed duplicate objects.
									4.Some classes allows Null insertion (Empty data)
									5.Insertion order:- in which order we inserted the object in same order output will be printed. (Preserved or not)
									6.Methods are synchronized or non synchronized
									7.Supports predefined methods.
									8.to retrive the data from collections we use cursors

					List Interfaces common properties:

					1.All classes allow hetrogeneous data.
					2.All classes allows null insertion.
					3.All classes allows duplicate objects.
					4.Every class is preserved insertion order.
					

					


				
	
						
