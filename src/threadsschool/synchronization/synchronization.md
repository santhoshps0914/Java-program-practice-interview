Synchronization in Java 

used to control the execution of multiple process or threads so that shared resources can be access in time.

Types of Synchronization

1. Synchronized Method

Locks entire method so that only one thread can have access to that method, 
then release lock after it completes

- locks the whole method, not just a part of it.

- uses the object level lock (instance lock).

2. Synchronized Blocks

Allowing only specific section of code instead of the entire method

Locks only critical section of code, not entire method
provides better performance

3. static synchronization

static data or methods needs to be protected in MT-environment.
ensures only one thread can access class level resource at a time.

