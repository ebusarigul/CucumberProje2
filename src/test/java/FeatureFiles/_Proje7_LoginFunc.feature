Feature: Login Func

  Scenario: Valid Login

    Given Navigate to Magento

    When Click a Button
      | signIn |

    And fill in the information
      | email | esargl147@gmail.com |
      | pass  | qweasd.123          |

    When Click a Button
      | send2 |

    Then Verify that your account has been opened
      | welcome |Welcome|
