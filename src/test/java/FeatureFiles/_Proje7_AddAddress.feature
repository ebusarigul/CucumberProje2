Feature: Add Adress Func

  Background:
    Given Navigate to Magento
    When Click a Button
      | signIn |
    And fill in the information
      | email | esargl149@gmail.com |
      | pass  | qweasd.123          |
    When Click a Button
      | send2 |

    And wait text to be welcome

    Then Verify that your account has been opened
      | welcome | welcome |

  Scenario Outline: Add Adresses
    When Click a Button
      | menu            |
      | myAccount       |
      | manageAddresses |
      | addNewAddress   |

    And fill in the information
      | firstname | <firstname> |
      | lastname  | <lastname>  |
      | street_1  | <street_1>  |
      | city      | <city>      |
      | telephone | <telephone> |
      | zip       | <zip>       |

    When Click a Button
      | country           |
      | <ulke>            |
      | saveAddressButton |

    Then Verify that your account has been opened
      | addressVerify | saved |
    Examples:
      | firstname | lastname | street_1  | city   | telephone | zip   | ulke    |
      | sukru     | kilic    | techno sk | bursa  | 234235    | 12425 | turkey  |
      | ebu       | sarigul  | kale sk   | london | 2423542   | 23423 | england |
      | hakan     | tasdelen | techno ds | manisa | 3464564   | 53453 | ukraine |
