@stories
  Feature: Academy Choucair
     AS an user, I want to learn how to automate in screenplay at the Choucair Academy with the automation
     @scenario1
     Scenario: Search for a automation course
       Given that Rose want to learn automation at the Academy choucair
       | strUser   | strPassword |
       | TuUsuario | TuClave     |
       When she search for the course on the Choucair Academy platform
       |strCourse                |
       |Metodologia Bancolombia  |
       Then she finds the course called
       |strCourse                |
       |Metodologia Bancolombia  |

       Example
       |strUser|  StrPassword |  strCourse |
       | scenciso | Agosto,2021 | Metodología Bancolombia|