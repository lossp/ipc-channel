### Intro

This little project is inspired by MappedBus, but the `unsafe`  class used inside the MappedBus is not clear to me. In other words, I cannot quite understand this class at the moment. So in order to understand its idea. I used `Memory-Mapped-File` to achieve this goal, which is the Iternal Processes Communication. aka IPC

### Package Tool

This little project is used Ant to pack. Before Ant, I mainly use Maven, but I found maven is a little heavy for things like this. Therefore, Ant is more apporiate for situation like this.

Ant is a tool assembling the .java into a executable jar anywhere anytime. Easy to use and easy to deploy



### Brief

Demo is written in the sample package.

There are something you can pick up from here like I did

> RandomAccessFile
>
> Interface Programming

RandomAccessFile class is a little tricky at the beginning, especially comes to read, if you write something through the RandomAccessFile, you have to read it as the exact same sequence as you wrote it. You have to know each character`s order, in some situation, it may be a problem.



Interface Programming also takes time to learn



### IPC tips

Internal Processes Communications mainly achieve by following means

> Socket
>
> Shared-File
>
> Redis
>
> Message-Queue (etc. RabbitMQ)
>
> ….