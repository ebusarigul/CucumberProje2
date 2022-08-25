Feature: Payment Func

  Background:
    Given Navigate to Magento
    When Click a Button
      | signIn |
    And fill in the information
      | email | esargl147@gmail.com |
      | pass  | qweasd.123          |
    When Click a Button
      | send2 |

    And wait text to be welcome

    Then Verify that your account has been opened
     | welcome | welcome |

  Scenario: product purchase
    When Click a Button
      | fusionBackpack |
      | addToCart      |

    Then Verify that your account has been opened
      | addToCartConfirm | You added |

    When Click a Button
      | showcart         |
      | prodecedCheckout |

    And invisible loading

    When Click a Button
      | next |

    And invisible loading

    When Click a Button
      | placeOrder |

    Then Verify that your account has been opened
      | thankYouOrder | Thank you |

