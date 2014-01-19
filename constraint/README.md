Apron_J
==============================================================================

  Complier (In java) for permission description language(specific for Apron). 

Install
==============================================================================

This compiler is generated by ANTLR. So you need to add ANTLR to you CLASSPATH.

You could get information about ANTLR at www.antlr.org

OR Just:
    $cd /usr/local/lib
    
    $curl -O http://www.antlr4.org/download/antlr-4.0-complete.jar
    Or
    $wget http://www.antlr4.org/download/antlr-4.0-complete.jar

    $export CLASSPATH=".:/usr/local/lib/antlr-4.0-complete.jar:$CLASSPATH"


Obviously, you should install JDK first.

Runing
=============================================================================

1)permission description should be writen in sample.txt

2)make
This will test the syntax and generate a syntax tree in LISP-like style.

3)make gui
This will test the syntax and generate a syntax tree in GTK.

4)make test
This will test the syntax and generate a syntax tree. Then run the Test to go through the tree with a simple api call check.

