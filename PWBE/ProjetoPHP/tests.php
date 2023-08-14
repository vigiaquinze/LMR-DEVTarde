<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>testes de php</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<h1>Variáveis</h1>
	<?php
	$name = "vigia";
	$age = "20";
	echo "Nome: ";
	echo $name;
	echo "</br>";
	echo "Idade: ";
	echo $age;
	?>
	<h1>Contas matemáticas</h1>
	<?php
	$a = 2;
	$b = 4;
	$c = $a*$b;
	$d = $b-$a;
	$e = $a+$b;
	echo "A:";
	echo $a;
	echo "</br>";
	echo "B:";
	echo $b;
	echo "</br>";
	echo "C: AxB ";
	echo "(";
	echo $c;
	echo ")";
	echo "</br>";
	echo "D: B-A ";
	echo "(";
	echo $d;
	echo ")";
	echo "</br>";
	echo "E: A+B ";
	echo "(";
	echo $e;
	echo ")";
	?>
	<h1>Verificador de idade</h1>
	<?php
	$idade = 17;
	if(){}
	?>
</body>
</html>