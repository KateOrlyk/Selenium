@Certificate
Feature: Test https://certificate.ithillel.ua/

  Scenario Outline:
    When I open site "https://certificate.ithillel.ua/"
    And Enter certificate code "<cer>"
    Then Check result
    Examples:
      | cer       |
      | 111111111 |
      | 22222222  |
      | 33333333  |
      | 4444444   |
      | 55555555  |