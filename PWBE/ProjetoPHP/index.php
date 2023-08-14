<?php
echo "vhchefe em php";
echo "\n";
?>
<?php
$a = "5";
echo $a + 2;
echo "\n";
echo $a + '5';
echo ' carros';
echo "\n";
?>
<?php
$numeroDado = mt_rand(1, 6);
$numeroTexto = "";
switch ($numeroDado) {
	case 1:
		$numeroTexto = "Um";
		break;
	case 2:
		$numeroTexto = "Dois";
		break;
	case 3:
		$numeroTexto = "Três";
		break;
	case 4:
		$numeroTexto = "Quatro";
		break;
	case 5:
		$numeroTexto = "Cinco";
		break;
	case 6:
		$numeroTexto = "Seis";
		break;
}
echo $numeroDado;
echo " (";
echo $numeroTexto;
echo ")";
?>