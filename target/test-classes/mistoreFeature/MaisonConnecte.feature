#Author: Ines Joudi
Feature: MCSelection MiStore

  Scenario: effectuter un tri et cliquer sur un pdt
    Given acceder a la page de la maison connecte
    When utilisateur selectionne le tri "Tri par popularité" et clique pour choisir un element "Mi Camera 2K Magnetic Mount"
    Then utilisateur est dirigee vers la page "Mi Camera 2K Magnetic Mount"
