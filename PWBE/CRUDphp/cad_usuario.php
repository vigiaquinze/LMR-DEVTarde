<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de usuário</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Cadastro de usuário</h1>
        <form action="processa_usuario.php" method="post">
            <div class="col">
                <label for="nome">Nome completo:</label>
                <input type="text" name="nome" id="nome" class="form-control">
            </div>
            <div class="col">
                <label for="dataNascimento">Data de nascimento:</label>
                <input type="date" name="dataNascimento" id="dataNascimento" class="form-control" value="27-01-2003">
            </div>
            <div class="col">
                <label for="telefone">Telefone:</label>
                <input type="tel" name="telefone" id="telefone" class="form-control">
            </div>
            <div class="col">
                <label for="email">E-mail:</label>
                <input type="email" name="email" id="email" class="form-control">
            </div>
            <div class="col">
                <label for="senha">Senha:</label>
                <input type="password" name="senha" id="senha" class="form-control">
            </div>
            <button type="submit" name="enviarDados" class="button">Cadastrar-se</button>
        </form>
    </div>
</body>
</html>