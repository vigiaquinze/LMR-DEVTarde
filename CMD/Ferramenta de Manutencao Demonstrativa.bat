@echo off
cls
:menu
cls
color F0

date /t

echo Computador: %computername% Usuario: %username%

echo            MENU TAREFAS              
echo =====================================
echo * 1. Esvaziar a lixeira             *
echo * 2. Fazer backup                   *
echo * 3. Escanear disco local           *
echo * 4. Abrir painel de controle       *
echo * 5. Sair                           *
echo =====================================

set /p opcao= Escolha uma opcao:
echo -------------------------------------
if %opcao% equ 1 goto opcao1
if %opcao% equ 2 goto opcao2
if %opcao% equ 3 goto opcao3
if %opcao% equ 4 goto opcao4
if %opcao% equ 5 goto opcao5
if %opcao% geq 6 goto opcao6

:opcao1
cls
rd /S /Q c:\$recycle.bin
echo =====================================
echo *         LIXEIRA ESVAZIADA         *
echo =====================================
pause
goto menu

:opcao2
cls
xcopy /T /C C:\Users\Aluno\Documents\*.* C:\Users\Aluno\Desktop
echo =====================================
echo *          BACKUP CONCLUIDO         *
echo =====================================
pause
goto menu

:opcao3
cls
echo =====================================
echo *       ESCANEAMENTO DE DISCO       *
echo =====================================
chkdsk c:
pause
goto menu

:opcao4
cls
control.exe
pause
goto menu

:opcao5
cls
exit

:opcao6
cls
echo =====================================
echo *         OPCAO INVALIDA            *
echo =====================================
pause
goto menu