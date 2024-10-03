Feature: Validar la funcionalidad del carrito de compras


@COMPRAR
#  Scenario: Agregar productos al carrito de compras y validar actualización
#    Given estoy en la aplicación de SauceLabs
#    Then valido que el carrito de compras actualice correctamente






  Scenario Outline: Agregar productos al carrito de compras y validar actualización
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galería
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido que el carrito de compras actualice correctamente

    Examples:
      | PRODUCTO                | UNIDADES |
      | Sauce Labs Backpack      | 1        |
      | Sauce Labs Bolt T-Shirt  | 1        |
      | Sauce Labs Bike Light    | 2        |