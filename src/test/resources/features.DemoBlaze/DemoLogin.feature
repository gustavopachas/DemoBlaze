Feature: Realizarlogin

  @Ingresarlogin
  Scenario Outline: Ingresar a login
    Given Inicializando la pagina de demoblaze
    When hago click a Login
    And ingreso el usuario login "<User>"
    And ingreso la clave login "<pass>"
    And click boton login
    When click de laptop
    When click de sony
    And agregar carrito
    Then validar el carrito

    Examples:
      | User | pass |
      | apolo| apolo|