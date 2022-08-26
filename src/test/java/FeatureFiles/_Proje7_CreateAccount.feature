Feature:Create Account Functionality

  Scenario: create a account

    Given Navigate to Magento

    When Click a Create an Account
      | createAnAccount |
    And fill in the information

      | firstname            | grup2               |
      | lastname             | proje7              |
      | emailaddress         | esargl149@gmail.com |
      | password             | qweasd.123          |
      | passwordconfirmation | qweasd.123          |

    When Click a Create an Account
      | createAccountButton |

    Then Verify that your account has been opened
      | verifyLogin | thank you |