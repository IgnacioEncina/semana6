Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion
Given Abrir Chrome
When ingresa Username "jaime" y Password "1234"
Then ir a registrar