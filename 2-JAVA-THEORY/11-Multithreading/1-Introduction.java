MultithreadingIntroduction:-  ratna5256@gmail.com

 Thread:- it is a user defined process , a lightwait process is called thread.

 Thread concept:-
		1.Thread :- one thread is run at a time
		2.Multithreading:- Executing morethan one thread run at a time. each and every thread separete independent part  of the same application (Example:- Gaming Applications.)

		1.Multi tasking:- executing more than one task is called multitasking.(Ex- media players, gaming)

	How to create Thread:
			
			Here We follow two approaches
				
					1.Extending thread class 
					2.Implementing runnable interface 

				I. Single Thread:-
					
					Example:

					class SingleThread
					{
						 public static void main (String[] args) // main thread starting
						{
							 System.out,println("This is Akhil");
							 System.out,println("This is Akhil");
							 System.out,println("This is Akhil");// main thread executing
							 System.out,println("This is Akhil");
							 System.out,println("This is Akhil");
						}//main thread ended
					}
						
					1.Extending Thread class

					Step 1:- Extend thread class
							
							class MyThread extends Thread
							{
							}
					
					Step 2:- To write the bussing logics override run method
							
							class MyThread extends Thread
									{
										public void run()
										{
											//thread logics
										}
									}

					Step 3:- Initiating thread class 
								
								MyThread t = new MyThread();

					Step 4:- starting thread class
								
							t.start();


					Example 2:-

						class MyThread extends Thread
									{
										public void run()
										{
											for(int i=0;i<10;i++;)
											{
												System.out.println("User Thread");
											}
										}
									}	

*** Importance of main thread:- suppose my application contains 100 threads to start 99 user threads we need 1 main thread is required.
		

		***Example 3:-
					class MyThread extends Thread
									{
										public void run()
										{
											for(int i=0;i<10;i++;)
											{
												System.out.println("User defined Thread");
											}
										}
									}	

						class ThreadDemo 
						{
							public static void main(String[] args) // main thread
							{
								//User thread starting code
								MyThread t= new MyThread;
								t.start(); // 2 threads
								//logics of main method
								for(int i=0;i<10;i++;)
								{
								System.out.println("Main Thread");
								}
							}
						}



*** Application contains more than one thread thread execution is decided by thread scheduler, thread scheduler is component of the JVM

Thread scheduler follows 2 types of algorithms to allocate CPU
	1.Premptive Algorithm
	2.Time Slicing Algorithm.

	Whenever thread class start method is executed it performs 2 actions
			
			1. when ever thread class start method is executed then only your thread is registred into thread scheduler then ony say your thread is created.
			   Your thread is not registred in thread scheduler your thread is not created.
			2.that thread class internal code it automatically called run() method will be executed.


	Thread Scheduler:-
			Thread scheduler is a mental patient, it is not possible to say exact output, it is possible to say possible outputs
			because of unexpected behaviour of thread scheduler
			
			Example 4:- 
			
			class MyThread extends Thread
			{
				public void run()
				{
					for(int i=0;i<10;i++)
					{
						System.out.println("User defined Thread");
					}
				}
			}
			
			class ThreadDemo 
			{
				public static void main(String[] args)
				{
					MyThread t = new MyThread();
					t.run(); //replacing start method with run method
					for(int i=0;i<10;i++)
					{
						System.out.println("Main Thread");
					}
				}
			}
	
			*** Difference between start() method and run() method

			
			start():- When I start start() method thread class start method is executed your thread is registred into thread
			scheduler then decide your thread is created 
			
			
			
			run():- When I start run() method it is present in MyThread class it checks run method in MyThread class 
			it is available here now MyThread class run method will be executed. here thread is not started

			Example 5:-

				class MyThread extends Thread
			{
				
			}
			
			class ThreadDemo 
			{
				public static void main(String[] args)
				{
					MyThread t = new MyThread();
					t.run(); //replacing start method with run method
					for(int i=0;i<10;i++)
					{
						System.out.println("Main Thread");
					}
				}
			}
			
			** Here we are not overriding run method, thread class run method is executed with empty implementation
			always main thread will be executed.

			Example 6:-			
			
			class MyThread extends Thread
			{
				public void start() // Here MyThread class start() method is executed, Thread class start() method is not executed
									// so here thread is not created.
				{
					for(int i=0;i<10;i++)
					{
						System.out.println("User defined Thread");
					}
				}
			}
			
			class ThreadDemo 
			{
				public static void main(String[] args)
				{
					MyThread t = new MyThread();
					t.start(); 
					for(int i=0;i<10;i++)
					{
						System.out.println("Main Thread");
					}
				}
			}

*** Here MyThread class start() method is executed, Thread class start() method is not executedso here thread is not created.
here over riding start method , thread will be created whenever thread class startmethod is executed.

			Example 7:-

			class MyThread extends Thread
			{
				public void run()// overriding run method, JVM always calls 0 arg run method.
				{
					for(int i=0;i<10;i++)
					{
						System.out.println("0-arg User defined Thread");
					}
					run(10); //calling 1-arg run method. 
				}
				public void run(int a)
				{
					for(int i=0;i<10;i++)
					{
						System.out.println("1-arg User defined Thread");
					}
				}
			}
			
			class ThreadDemo 
			{
				public static void main(String[] args)
				{
					MyThread t = new MyThread();
					t.start(); 
					for(int i=0;i<10;i++)
					{
						System.out.println("Main Thread");
					}
				}
			}
			
			Example 8:- Business logics out side of the run method  

			class MyThread extends Thread
			{
				public void run()
				{
					m1();
					m2();
					m3();
				}
				void m1(){System.out.println("m1 method");}
				void m2(){System.out.println("m2 method");}
				void m3(){System.out.println("m3 method");}
			}
			
			class ThreadDemo 
			{
				public static void main(String[] args)
				{
					MyThread t = new MyThread();
					t.start(); 
				}
			}


			Example 9:- Three threads are performing single task.

				class MyThread extends Thread
			{
				public void run()
				{
					System.out.print("This is Akhil");
				}

			}
			
			class ThreadDemo 
			{
				public static void main(String[] args)
				{
					MyThread t = new MyThread();
					t.start(); 
					MyThread t1 = new MyThread();
					t1.start(); 
					MyThread t2 = new MyThread();
					t2.start(); 
				}
			}
		// method calls are stored in stack memory


		Example 9:- Three threads are performing different task.

			class MyThread extends Thread
			{
				public void run()
				{
					System.out.print("This is Akhil");
				}

			}
			
			class MyThread1 extends Thread
			{
				public void run()
				{
					System.out.print("This is Akhil-1");
				}

			}

			class MyThread2 extends Thread
			{
				public void run()
				{
					System.out.print("This is Akhil-2");
				}

			}

			class ThreadDemo 
			{
				public static void main(String[] args)
				{
					MyThread t = new MyThread();
					t.start(); 
					MyThread1 t1 = new MyThread1();
					t1.start(); 
					MyThread2 t2 = new MyThread2();
					t2.start(); 

					/* Name less object calling , real time calling
					new MyThread().start();
					new MyThread()1.start();
					new MyThread()2.start();
					
					*/
				}
			}

	***each and every thread contains name, execution always starts from main thread. Default name of the main thread is main only, the default name of the user defined thread starts from thread-0, next one thread-1 etc...

			it is possible to set the thread name by using "setname()" method.
			it is possible to get the name by using "getname()" method. 


Example 10:- Set the thread name and get the thread name

		class Mythread extends Thread
		{
			public void run()
				{
				}

		class MyThreadDemo
		{
			public static void main(String[] args)
			{
				
				Mythread t = new Mythread();
				t.start();
				
				Mythread t1 = new Mythread();
				t1.start();
				
				System.out.println(t.getName());// Thread-0
				System.out.println(t1.getName());// Thread-1
				
				t.setName("Akhil Thread 1");
				System.out.println(t.getName());// Akhil Thread 1
				
				// main thread doesn't contain any reference variable, currentThread() method is used for to get the main thread name
				
				System.out.println(Thread.currentThread().getName());// main is output
				Thread.currentThread().settName("Akhil Main thread");//Akhil Main thread
			
				// get thread id by using getId() function

				System.out.println(t.getId());// displays thread Id	
				System.out.println(t1.getId());// displays thread Id	

				// Checking thread is alive or not

				System.out.println(t.isAlive());// thread is running it displays true other wise false.

				// checking threads running count

				System.out.println(t.activeCount());// displays t1 count	
				System.out.println(Thread.activeCount());// displays no.of active threads count				
			}
		}

		***Threads priority


		 each and every thread having its own priority. the default priority of the main thread is 5

		thread range is 1-10, here constants are 3 types

		1.MAX_PRIORITY=>10
		2.MIN_PRIORITY=>1
		3.NORM_PRIORITY=>5

		if multiple threads are having same priority then thread execution is decide by thread scheduler, before starting the thread can please set the thread priority.


	Example 11:- Thread priority

				class Mythread extends Thread
		{
			public void run()
				{
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				}

		class MyThreadDemo
		{
			public static void main(String[] args)
			{

				//setting thread priority
				
				Mythread t = new Mythread();
				//t.setpriority(10);
				t.setpriority(Thread.MAX_PRIORITY);// static constants are called with class name
				
				Mythread t1 = new Mythread();
				//t1.etpriority(1);
				t.setpriority(Thread.MIN_PRIORITY); // static constants are called with class name // here we can use numbers or constants.

				// Starting the thread
				t.start();
				t1.start();

		// windows operating system priorities are not working.


							
			}
		}



			Example 12:- Thread priority

				class Mythread extends Thread
		{
			public void run()
				{
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				}

		class MyThreadDemo
		{
			public static void main(String[] args)
			{

				//setting thread priority
				
				Mythread t = new Mythread();
				t.setpriority(10);//t.setpriority(18); ---> illegal orgument exception priority range is 1-10 only 
				//t.setpriority(Thread.MAX_PRIORITY);// static constants are called with class name
				
				Mythread t1 = new Mythread();
				t1.etpriority(1);
				//t.setpriority(Thread.MIN_PRIORITY); // static constants are called with class name // here we can use numbers or constants.

				// Starting the thread
				t.start();
				t1.start();

		// windows operating system priorities are not working.
							
			}
		}


				*** LIFE CYCLE OF THREAD ***
			1.New state   ---> Instantiation. when we create object it goes to ready state (Born state) (Ex:- MyThread t = new MyThread )
			2.Ready state ---> Thread is ready to execute (Ex:- t.start)
			3.Running state ---> Thread Scheduler allocates CPU. (run() method is executed)
			4.Dead state


				*** HOOK THREAD ***

			 Hook Thread: - it is also a normal thread
				
				Spaciality:- assume t1 is hook thread , the hook thread is executed just before  termination of the 
					JVM normally or abnormally.

					Example 13:-

						class MyThread extends Thread
						{
							public void run()
							{
								System.out.println("Hook Functionality");
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								Runtime r = new Runtime.getRuntime	();
								r.addShutdownHook(t); //addShutdownHook() belongs ro Runtime class

								//logics of main

								for (int i=0;i<10 ;i++ )
								{
									System.out.println("Main Thread");
								

								try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								if (i==5)
								{
									System.exit(0);
								}
							}
							}
						}


			*** DEAMON THREAD (Background threads) ***

				Deamon threads are executed in background they are giving support to the forground thread. (EX- garbage collector, thread scheduler , default exception handler).

				Example 14:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<10 ;i++ )
								{
								System.out.println("Deamon Functionality");
								try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								t.setdeamon(true); // default it is false
								t.start();

								for (int i=0;i<10 ;i++ )
								{
									System.out.println("Main Thread");
									
									try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}

								}
								
							}
						}

		//** main thread stops execution automatically deamon thread stops execution.
		// once main thread is completed the demon threads are automatically completed wheher it is completed or not.

		Example 14:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<10 ;i++ )
								{
								System.out.println("Deamon Functionality");
								try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								t.setdeamon(true); // default it is false
								t.start();

								for (int i=0;i<5 ;i++ )
								{
									System.out.println("Main Thread");
									
									try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}

								}
								
							}
						}

						*** JOINS ***

							to stop the current executing thread until completion of the target thread.

						
			Example 15:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<5 ;i++ )
								{
								System.out.println(Thread.currentThread().getName()+"--"+i);
								try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								Mythread t1 = new Mythread();
								t.start();
								t1.start();
								for(int i=0;i<5;i++)
								{
									System.out.println(i);
									try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
								
							}
						}
						-------------------------------------------------------------------

		Example 16:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<5 ;i++ )
								{
								System.out.println(Thread.currentThread().getName()+"--"+i);
								try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								Mythread t1 = new Mythread();
								t.start();
								t1.start();
								try
								{
									t.join(); // main thread executing this line, here main has to wait until completion of the t1 thread
								}
								catch (InterruptedException ie)
								{
									ie.printStackTrace();
								}
								for(int i=0;i<5;i++)
								{
									System.out.println(i);
									try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
								
							}
						}

						----------------------------------------------------------------------

			Example 17:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<5 ;i++ )
								{
								System.out.println(Thread.currentThread().getName()+"--"+i);
								try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								Mythread t1 = new Mythread();
								t.start();
								try
								{
									t.join(); // main thread executing this line, here main has to wait until completion of the t1 thread
								}
								catch (InterruptedException ie)
								{
									ie.printStackTrace();
								}
								t1.start();
								for(int i=0;i<5;i++)
								{
									System.out.println(i);
									try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
								
							}
						}




						---------------------------------------------------------------

	Example 18:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<5 ;i++ )
								{
								System.out.println(Thread.currentThread().getName()+"--"+i);
								try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								Mythread t1 = new Mythread();
								t.start();
								try
								{
									t.join(2000); // we can pass arguments here ex:- 2000 main thread has to wait 2 seconds
								}
								catch (InterruptedException ie)
								{
									ie.printStackTrace();
								}
								t1.start();
								for(int i=0;i<5;i++)
								{
									System.out.println(i);
									try { t.sleep(1000);}
								catch (InterruptedException ie) {
								ie.printStackTrace();
								}
								}


								
							}
						}




	*** Interrupted Exception or Interrupted Thread ***

		possible  to interrupt the thread by using interrupt, thread is not entered into sleeping mode the thread wont to be interrupt.

	
								
	Example 19:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<5 ;i++ )
								{
								System.out.println("User Thread");
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								t.start();	
								t.interrupt(); // here interrupt method is wasted because here we not used sleep method
							}
						}

						-------------------------------------------------------

						Example 20:-

						class MyThread extends Thread
						{
							public void run()
							{
								for (int i=0;i<5 ;i++ )
								{
								System.out.println("User Thread");
								try
								{
									Thread.sleep(1000);
								}
								catch (InterruptedException ie)
								{
									System.out.println("Thread is Interrupted");
								}
								}
							}
						}
						class ThreadDemo
						{
							public static void main(String[] args)
							{
								Mythread t = new Mythread();
								t.start();	
								t.interrupt();	
							}
						}

		******  Implementing Runnable Interface ******

	

		Step 1:- Our normal java class become a thread class  when we implements Runnable interface 
			
				class MyThread implements Runnable
				{
				}

		Step 2:- it contains only one method

			class MyThread implements Runnable
				{
					public void run()
					{
						// logics of thread
					}
				}
		Step 3:- Instantiation (object creation)

			MyThread t = new MyThread();

		Step 4:- Satrt the thread
			t.start();


				Example 21:- doubt

				class MyRunnable implements Runnable
				{
					public void run()
					{
					for (int i=0;i<5 ;i++ )
								{
								System.out.println("User Thread");
								}
					}
				}
				class ThreadDemo
				{
					public static void main (String[] args)
					{
						MyRunnable r = MyRunnable();
						r.start();
					}
				}



		Example 22 :- Solution

				class MyRunnable implements Runnable
				{
					public void run()
					{
					for (int i=0;i<5 ;i++ )
								{
								System.out.println("User Thread");
								}
					}
				}
				class ThreadDemo
				{
					public static void main (String[] args)
					{
						MyRunnable r = MyRunnable();
						Thread t = new Thread(r); // register r thread into thread scheduler
						t.start();
						for (int i=0;i<5 ;i++ )
						{
						System.out.println("Main Thread");
						}
					}
				}


interface Runable
{
	public abstract run();
}

class Thread implements Runnable
{
	public void run()
	{
		//empty implementation
	}
}

class MyThread extends Thread
{
	public void run()
	{
		//logics of thread
	}
}


		---Anonymous inner class ------

			/* Example 23:- without anonymous inner class 


				class MyThread extends Thread
					{
						public void run()
						{
						//logics of thread
						}
					}
				class ThreadDemo 
				{
					public static void main (String[] args)
					{
						//logics of main
					}
				}	*/
				

				Example 23:- anonymous innerclass 
				
					class ThreadDemo 
					{
						public static void main (String[] args)
						{
							Thread t = new Thread()
							{
								public void run()
								{
									System.out.println("First Thread");
								}
							}; // semicolon is mandatory

							Thread t1 = new Thread()
							{
								public void run()
								{
									System.out.println("Second Thread");
								}
							}; // semicolon is mandatory

							t.start();
							t1.start();
						}
					}


				Example 24:- anonymous innerclass 
				
					class ThreadDemo 
					{
						public static void main (String[] args)
						{
							 new Thread()
							{
								public void run()
								{
									System.out.println("First Thread");
								}
							}.start(); // semicolon is mandatory

							 new Thread()
							{
								public void run()
								{
									System.out.println("Second Thread");
								}
							}.start(); // semicolon is mandatory
						}
					}


					Example 25:- anonymous innerclass 
				
					class ThreadDemo 
					{
						public static void main (String[] args)
						{
							Thread  t =new Thread()
							{
								public void run()
								{
									System.out.println("First Thread");
								}
							};
							t.start();
							t.start(); // error IllegalThreadStateException
						}
					}

					======== Interface ==================


/*			Example 26:-	class MyRunnable implements  Runnable
//					{
//						public void run()
//						{
//						// run logocs
//						}
//					}
//					class ThreadDemo
//					{
//						public static void main(String[] args)
//						{
//						// main logics
//						}
				}*/	



				Example 26:- 

					class ThreadDemo
					{
						public static void main (String[] args)
						{
							Runnable r = new Runnable();
							{
								public void run()
								{
									System.out.println("First Thread");
								}
							};

							Runnable r1 = new Runnable();
							{
								public void run()
								{
									System.out.println("Second Thread");
								}
							};

							Thread t = New Thread(r);
							t.start();
							Thread t1 = New Thread(r1);
							t1.start();
						}
					}



							Example 27 :- 

				class MyRunnable implements Runnable
				{
					public void run()
					{
					for (int i=0;i<5 ;i++ )
								{
								System.out.println("User Thread");
								}
					}
				}
				class ThreadDemo
				{
					public static void main (String[] args)
					{
						/* MyRunnable r = MyRunnable();
						Thread t = new Thread(r); // register r thread into thread scheduler
						t.start();*/
						// optimizing code
						new Thread (new MyRunnable()).run();
						for (int i=0;i<5 ;i++ )
						{
						System.out.println("Main Thread");
						}
					}
				}




				Example 28:-

				class MyThread  extends Thread
				{
					public void run()
					{
						System.out.println("first approach to create a thread");
					}
				}

				class MyRunnable implements Runnable
				{
					public void run()
					{
						System.out.println("second approach to create a thread");
					}
				}

				class ThreadDemo 
				{
					public static void main (String[] args)
					{
						new MyThread().start();
						new Thread(new MyRunnable()).start();
					}
				}





				*** Synchronization ***

			Non-synchronized:-	Method by default is nonSynchronized.,Method is non synchronized multiple persons are access at a time, Method is non-synchronized data inconsistency problem is occured.
			not a thread safe method. to get thread safety to this method just declare this method with synchronized method. perfomance of cpu is increased
			
				
			synchronized:- only one thread is access the data, it is thread safe. waiting time is increased perfomance is decreased.


			Example 29:- without synchronized
			
			class A
			{
				static void msg(String str);
				{
					for (int i=0;i<4 ;i++ )
					{
						System.out.println("hi="+str);
						try
						{
							Thread.sleep(1000);
						}
						catch (InterruptedException ie)
						{
							ie.printStacttrace();
						}
					}
					
				}
			}
			class MyThread extends Thread
			{
				public void run()
				{
					//System.out.println("MyThread");
					A.msg("Akhil");
				}
			}
			class MyThread1 extends Thread
			{
				public void run()
				{
					//System.out.println("MyThread-1");
					A.msg("Abhi");
				}
			}
			class MyThread2 extends Thread
			{
				public void run()
				{
					//System.out.println("MyThread-2");
					A.msg("AA");
				}
			}

			class ThreadDemo 
			{
				public static void main (String[] args)
				{
					new Mythread().start();
					new Mythread1().start();
					new Mythread2().start();
				}
			}




			Example 30:- Synchronized
			
			class A
			{
				synchronized static void msg(String str);
				{
					for (int i=0;i<4 ;i++ )
					{
						System.out.println("hi="+str);
						try
						{
							Thread.sleep(1000);
						}
						catch (InterruptedException ie)
						{
							ie.printStacttrace();
						}
					}
					
				}
			}
			class MyThread extends Thread
			{
				public void run()
				{
					//System.out.println("MyThread");
					A.msg("Akhil");
				}
			}
			class MyThread1 extends Thread
			{
				public void run()
				{
					//System.out.println("MyThread-1");
					A.msg("Abhi");
				}
			}
			class MyThread2 extends Thread
			{
				public void run()
				{
					//System.out.println("MyThread-2");
					A.msg("AA");
				}
			}

			class ThreadDemo 
			{
				public static void main (String[] args)
				{
					new Mythread().start();
					new Mythread1().start();
					new Mythread2().start();
				}
			}


 Volatile  :- it is modifier it is only applicable for variables
			if variable declared with volatile for each and every thread one local copy of its original value is created.
			modifications are done in local copy not the local copy, once the thread (before termination of the thread) is completed then only the master copy is updated.
			


