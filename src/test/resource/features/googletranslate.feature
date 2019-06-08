@tag
Feature: Google Translate
  As a web user
  I want to use Google Translate
  to translate words between different languages

  @tag2
  Scenario Outline: Translate words from English to Spanish
    Giventhat que susan wants to translate a word
    When she translates the word  <wordinenglish> from English to Spanish
    Then she should see the word <wordinspanish> in the screen  

    Examples: 
      | wordinenglish  | wordinspanish |
      | cheese         | queso         |