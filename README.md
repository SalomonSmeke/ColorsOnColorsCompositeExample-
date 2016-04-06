##Clrs: Composite edition!
<pre>
Greetings!.generateChildren()

   Greetings!
     |    |
Greets    Salutations
|    | 
yo! [hi]

hi.dumpParent(Greetings!).generateChildren()

        hi
     |      |
   hello [howdy]

howdy.dumpParent

Howdy!
</pre>
Its like that but for colors! You start of with any color youd like. then you can generate permutations of it.
I like the color "FF88DD" but I wish it was a little less green. Closer to "FF00DD".

Sounds good. Lets do it.

Color a = new Color("ff88dd",5);
                             ^
                             this specifies granularity

a.generateChildren("ff00dd");
a.getChildren(); <- this contains colors that you might like better.

the color at index 3 is nicer than what i had... but I kinda wish it had more blue.

a = a.getChildren.get(1).dumpParent(a);
a.generateChildren("ff99ff");

etc. etc. etc.
