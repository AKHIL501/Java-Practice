Servlets:- Servlets are used to write the programs at server side. or servlet is a object executed at server side, servlets are used to develop the web applications.

	Features of Servlets:-	
						
						1.Robust
						2.Scalable

		CGI :- Before Servlets, CGI (Common Gateway Interface) scripting language was popular as a server-side programming language. But there was many disadvantages of this technology.
		CGI technology enables the web server to call an external program and pass HTTP request information to the external program to process the request. For each request, it starts a new process.

				Disadvantages:-

				There are many problems in CGI technology:

					1.If number of clients increases, it takes more time for sending response.
					2.For each request, it starts a process and Web server is limited to start processes.
					3.It uses platform dependent language e.g. C, C++, perl.
	

	Advantage of Servlet:-

			There are many advantages of servlet over CGI. The web container creates threads for handling the multiple requests to the servlet. Threads have a lot of benefits over the Processes such as they share a common memory area, lightweight, cost of communication between the threads are low. The basic benefits of servlet are as follows:

				1.Better performance: because it creates a thread for each request not process.
				2.Portability: because it uses java language.
				3.Robust: Servlets are managed by JVM so we don't need to worry about memory leak, garbage collection etc.
				4.Secure: because it uses java language
	 