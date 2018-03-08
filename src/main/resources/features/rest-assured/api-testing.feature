Feature: I want to test the response for BA and IAG Home Pages

  @response-codes @api
  Scenario Outline: Verify Response Code
    Given I verify the response code of the <page>
    Examples:
    | page |
    | BA   |
    | IAG  |

  @response-data @api
  Scenario Outline: Verify Data Response
    Given I verify the response data of the <page>
    Examples:
     | page |
     | BA   |
     | IAG  |


  @response-time @api
  Scenario Outline: Verify Performance
    Given I verify the performance of the <page>
    Examples:
     | page |
     | BA   |
     | IAG  |