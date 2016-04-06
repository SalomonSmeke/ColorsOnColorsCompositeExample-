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
<br>
Sounds good. Lets do it.
<br>
<pre>
Color a = new Color("ff88dd",5);<
                             ^
                             this specifies granularity
</pre>
<pre>
a.generateChildren("ff00dd");
a.getChildren(); <- this contains colors that you might like better.
</pre>
the color at index 3 is nicer than what i had... but I kinda wish it had more blue.<br>
<pre>
a = a.getChildren.get(1).dumpParent(a);
a.generateChildren("ff99ff");
</pre>
etc. etc. etc.
