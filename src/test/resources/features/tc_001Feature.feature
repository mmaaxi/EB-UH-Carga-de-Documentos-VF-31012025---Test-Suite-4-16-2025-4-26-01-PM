Feature: Validar inicio de sesión con credenciales válidas

  Scenario: Usuario inicia sesión con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa el nombre de usuario "usuarioValido"
    And el usuario ingresa la contraseña "contraseñaValida"
    And el usuario hace clic en el botón "Iniciar sesión"
    Then el usuario es redirigido al dashboard