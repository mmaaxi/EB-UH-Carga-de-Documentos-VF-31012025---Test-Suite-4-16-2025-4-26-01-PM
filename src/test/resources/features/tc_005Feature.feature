Feature: Validar bloqueo tras múltiples intentos fallidos

  Scenario: Bloqueo de cuenta tras tres intentos fallidos
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa credenciales incorrectas tres veces consecutivas
    Then el sistema registra los intentos fallidos
    When el usuario intenta iniciar sesión nuevamente
    Then la cuenta se bloquea y se muestra mensaje de bloqueo