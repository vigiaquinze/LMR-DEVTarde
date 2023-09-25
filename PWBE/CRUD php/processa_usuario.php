<?php
require_once 'conectaBD.php';
if(!empty($_POST)) {
    try {
        $sql = "INSERT INTO usuario
        (nome, dataNascimento, telefone, email, senha)
        VALUES (:nome, :dataNascimento, :telefone, :email, :senha)";
        $stmt = $pdo->prepare($sql);
        $dados=array(
            ':nome' => $_POST['nome'],
            ':dataNascimento' => $_POST['dataNascimento'],
            ':telefone' => $_POST['telefone'],
            ':email' => $_POST['email'],
            ':senha' => md5($_POST['senha']),
        );
        if ($stmt->execute($dados)) {
            header("Location: index.php?msgSucesso=Cadastro realizado com sucesso!");
        }
    } catch (PDOException $e) {
        header("Location: index.php?msgErro=Falha ao cadastrar!");
    }
}
else {
    header("Location: index.php?msgErro=Erro de acesso.");
}
die();
?>