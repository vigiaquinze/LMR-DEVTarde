<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <?php if (!empty($_GET['msgErro'])) { ?>
            <div class="erro" role="alert">
                <?php echo $_GET['msgErro']; ?>
            </div>
        <?php } ?>
        <?php if (!empty($_GET['msgSucesso'])) ?>
            <div class="erro" role="alert">
        <h1>Olá, seja bem-vindo!</h1>
        <form action="processa_login.php" method="post">
            <div class="col">
                <label for="email">E-mail:</label>
                <input type="email" name="email" id="email" class="form-control">
            </div>
            <div class="col">
                <label for="senha">Senha:</label>
                <input type="password" name="senha" id="senha" class="form-control">
            </div>
            <button type="submit" name="enviarDados" class="button">Entrar</button>
            <a href="cad_usuario.php" class="button-red">Cadastrar-se</a>
        </form>
    </div>
</body>
</html>