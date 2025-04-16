Feature: Validación del límite de tamaño en carga de documentos
  Como usuario del sistema
  Quiero recibir un mensaje de error al intentar cargar un documento que supere el tamaño permitido
  Para corregir la carga con un archivo de tamaño adecuado

  Scenario: Intentar cargar un documento que supere el tamaño permitido
    Given el usuario está en la página de carga de documentos
    When el usuario intenta cargar un documento que supera el tamaño permitido
    Then el sistema rechaza el archivo y muestra un mensaje de error indicando el límite de tamaño