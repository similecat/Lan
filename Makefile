antlr4=java -jar /usr/local/lib/antlr-4.0-complete.jar
grun=java org.antlr.v4.runtime.misc.TestRig
Program=apron
init=program
all:run

test:compile
	java Test <sample.txt
tree:run

gui:compile
	$(grun) $(Program) $(init) -gui <sample.txt

run:compile
	$(grun) $(Program) $(init) -tree <sample.txt
compile:generate
	javac *.java
generate:
	$(antlr4) -visitor $(Program).g4
clean:
	rm -f *Lexer.java *Parser.java *Listener.java *.class *.tokens
