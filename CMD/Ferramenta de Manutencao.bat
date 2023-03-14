@echo off
cls
:menu
cls
color F0

date /t

echo Computador: %computername% Usuario: %username%

echo            MENU TAREFAS              
echo ==================================================================
echo * 1. Esvaziar a lixeira                                             *
echo * 2. Alterar data                                                   *
echo * 3. Alterar hora                                                   *
echo * 4. Escanear disco local                                           *
echo * 5. Abrir painel de controle                                       *
echo * 6. Verificar versao do Windows                                    *
echo * 7. Abrir configuracoes de controle de conta de usuario            *
echo * 8. Abrir a central de seguranca e manutencao do Windows           *
echo * 9. Abrir o painel de controle da solucao de problemas             *
echo * 10. Acessar e verificar eventos e gerenciar discos e particoes    *
echo * 11. Abrir informacoes de hardware e software do sistema           *
echo * 12. Abrir o painel de visualizacao de eventos do sistema          *
echo * 13. Desinstalar ou alterar programas                              *
echo * 14. Exibir as propriedades da rede conectada                      *
echo * 15. Abrir o monitor de recursos avancado                          *
echo * 16. Gerar relatório detalhado do status de hardware               *
echo * 17. Restaurar arquivos e configuracoes de fabrica do Windows      *
echo * 18. Reparar integridade do sistema de arquivos do disco           *
echo * 19. Verificar e corrigir todos os arquivos corrompidos do sistema *
echo * 20. Reparar arquivos ausentes do sistema operacional              *
echo * 21. Sair                                                          *
echo ==================================================================

set /p opcao= Escolha uma opcao:
echo -------------------------------------
if %opcao% equ 1 goto opcao1
if %opcao% equ 2 goto opcao2
if %opcao% equ 3 goto opcao3
if %opcao% equ 4 goto opcao4
if %opcao% equ 5 goto opcao5
if %opcao% equ 6 goto opcao6
if %opcao% equ 7 goto opcao7
if %opcao% equ 8 goto opcao8
if %opcao% equ 9 goto opcao9
if %opcao% equ 10 goto opcao10
if %opcao% equ 11 goto opcao11
if %opcao% equ 12 goto opcao12
if %opcao% equ 13 goto opcao13
if %opcao% equ 14 goto opcao14
if %opcao% equ 15 goto opcao15
if %opcao% equ 16 goto opcao16
if %opcao% equ 17 goto opcao17
if %opcao% equ 18 goto opcao18
if %opcao% equ 19 goto opcao19
if %opcao% equ 20 goto opcao20
if %opcao% equ 21 goto opcao21
if %opcao% geq 22 goto opcao22

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
echo =====================================
echo *            ALTERAR DATA           *
echo =====================================
date
date /t
pause
goto menu

:opcao3
cls
echo =====================================
echo *            ALTERAR HORA           *
echo =====================================
time
time /t
pause
goto menu

:opcao4
cls
echo =====================================
echo *       ESCANEAMENTO DE DISCO       *
echo =====================================
chkdsk c:
pause
goto menu

:opcao5
cls
control.exe
pause
goto menu

:opcao6
cls
winver
pause
goto menu

:opcao7
cls
useraccountcontrolsettings
pause
goto menu

:opcao8
cls
wscui.cpl
pause
goto menu

:opcao9
cls
control.exe /name Microsoft.Troubleshooting
pause
goto menu

:opcao10
cls
compmgmt.msc
pause
goto menu

:opcao11
cls
msinfo32.exe
pause
goto menu

:opcao12
cls
eventvwr
pause
goto menu

:opcao13
cls
appwiz.cpl
pause
goto menu

:opcao14
cls
inetcpl.cpl
pause
goto menu

:opcao15
cls
resmon.exe
pause
goto menu

:opcao16
cls
perfmon /report
pause
goto menu

:opcao17
cls
rstrui.exe
pause
goto menu

:opcao18
cls
echo =====================================
echo *       REPARACAO DE DISCO          *
echo =====================================
chkdsk /r
pause
goto menu

:opcao19
cls
echo ======================================
echo * VERIFICACAO DE ARQUIVOS DO SISTEMA *
echo ======================================
sfc /scannow
pause
goto menu

:opcao20
cls
echo ======================================================
echo * REPARANDO ARQUIVOS AUSENTES DO SISTEMA OPERACIONAL *
echo ======================================================
dism /online /cleanup-image /restore-health
pause
goto menu

:opcao21
cls
exit

:opcao22
cls
echo =====================================
echo *         OPCAO INVALIDA            *
echo =====================================
pause
goto menu