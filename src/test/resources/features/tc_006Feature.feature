Feature: Validar cierre de sesión

  Scenario: Validar proceso de cierre de sesión
    Given el usuario ha iniciado sesión con credenciales válidas
    When el usuario hace clic en "Cerrar sesión"
    Then el sistema cierra la sesión y redirige al usuario a la página de login
    When el usuario intenta acceder a una página protegida sin iniciar sesión
    Then el sistema redirige al usuario a la página de inicio de sesión