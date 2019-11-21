# infixa-posfixa
==============
Conversor de expressão infixa para posfixa.

### Explicação
O software realiza a conversão de expressões infixas, também conhecidas como notação tradicional (quando o operador aparece entre os operandos), para expressões posfixas, conhecidas como notação polonesa inversa (quando o operador aparece após os seus operandos respeitando as suas prioridades).

### Demonstração
Exemplos de conversões da notação Infixa para Posfixa:

Ex 1: a+b => ab+ <br>
Ex 2: a+b*c => abc*+ <br>
Ex 3: a-b/c^d+e => abcd^/-e+ <br>
Ex 4: (a+b)/c	=> ab+c/ <br>

### Instalação

1. Faça o clone do projeto utilizando: `$ git clone https://github.com/AndersonRezende/infixa-posfixa.git`

### Testando
1. Abra o terminal na pasta do projeto.
2. Compile o arquivo Main.java usando o seguinte comando: `$ javac Main.java`
3. Rode a aplicação usando o seguinte comando: `$ java Main`
