grammar SimpleScript;

script: command;

command: printCmd | addCmd | substractCmd | exitCmd;

printCmd: 'print' (WORD | 'result');
addCmd: 'add' NUMBER NUMBER;
substractCmd: 'substract' NUMBER NUMBER;
exitCmd: 'exit';

WORD: [a-zA-Z]+;
NUMBER: [0-9]+;
WHITESPACE: [ \t\r\n]+ -> skip;