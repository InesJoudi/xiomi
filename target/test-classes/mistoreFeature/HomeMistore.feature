#Author: Ines Joudi
Feature: home Page MiStore

  Scenario: Acceder aux differents menu de la page Home
    Given acceder a la page dacceuil
    When utilisateur survol sur le menu "Smart Home" et clique sous le sous menu "Maison Connectée"
    Then utilisateur se dirige vers le maison connectee et verifie le message "Maison Connectée"
