Feature: Validar mensaje de error con datos parcialmente incorrectos

  Scenario: Usuario intenta iniciar sesión con contraseña incorrecta
    Given El usuario está en la página de inicio de sesión
    When El usuario ingresa un nombre de usuario válido
    And El usuario ingresa una contraseña incorrecta
    And El usuario hace clic en "Iniciar sesión"
    Then Se muestra un mensaje informativo de error