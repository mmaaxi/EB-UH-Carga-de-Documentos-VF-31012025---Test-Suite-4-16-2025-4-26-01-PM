Feature: Validar eliminación de documento

  Scenario: Eliminar un documento cargado
    Given que hay un documento previamente cargado
    When selecciono el documento
    Then el documento se resalta o se selecciona en la interfaz
    When hago clic en 'Eliminar documento'
    Then se muestra un mensaje de confirmación para eliminar el documento
    When confirmo la eliminación
    Then el documento se elimina de la lista de documentos cargados