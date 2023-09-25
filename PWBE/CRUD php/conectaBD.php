<?php
$endereco = 'localhost';
$banco = 'postgres';
$usuario = 'postgres';
$senha = 'postgres';

try {
    $pdo = new PDO("pgsql:host=$endereco;port=5432;dbname=$banco", $usuario, $senha, [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]);

    echo "Conectando no banco de dados...";
    
} catch (PDOException $e) {
    echo "Falha ao conectar no banco de dados.";
    die($e->getMessage());
}
?>