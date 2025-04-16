Feature: Recuperación de contraseña
  Asegurar que el usuario pueda solicitar la recuperación de su contraseña

  Scenario: Validar función de recuperación de contraseña
    Given el usuario está en la pantalla de inicio de sesión
    When el usuario hace clic en 'Olvidé mi contraseña'
    Then el sistema redirige a la pantalla de recuperación

    When el usuario ingresa un email registrado
    Then el sistema acepta el email ingresado

    When el usuario hace clic en 'Enviar enlace de recuperación'
    Then se muestra mensaje de confirmación del envío del enlace