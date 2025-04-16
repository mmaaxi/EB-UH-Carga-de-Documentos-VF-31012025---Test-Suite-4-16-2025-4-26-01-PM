Feature: Validar carga de documentos

  Scenario: Cargar un documento exitosamente
    Given el usuario está en la sección 'Carga de Documentos'
    When el usuario selecciona un archivo para cargar
    And hace clic en 'Cargar documento'
    Then el documento se sube correctamente y se muestra una confirmación