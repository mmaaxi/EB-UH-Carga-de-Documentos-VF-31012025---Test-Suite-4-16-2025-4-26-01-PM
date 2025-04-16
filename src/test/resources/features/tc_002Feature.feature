Feature: Validar inicio de sesión con credenciales inválidas

  Scenario: Inicio de sesión con nombre de usuario inválido
    Given el usuario está en la página de inicio de sesión
    When ingresa nombre de usuario "usuario_invalido"
    And ingresa contraseña "contraseña_valida"
    And hace clic en "Iniciar sesión"
    Then se muestra un mensaje de error "Credenciales incorrectas"