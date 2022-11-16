Feature: ingresar

  @Ingresarlogut
  Scenario Outline: Ingresar a demo
    Given Inicializando la pagina de demoblaze
    When hago click a sign up
    And ingreso el usuario demo "<Usuario>"
    And ingreso la clave "<Clave>"
    Then click boton

    Examples:
      | Data | Usuario | Clave |
      | 1    | pastilla   | pastilla |

