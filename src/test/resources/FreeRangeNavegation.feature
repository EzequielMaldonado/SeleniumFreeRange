@Navigation
Feature: Navigation
    To see the subpages
    Without logging in
    I can click the navigation bar links

    Background: I am on the FreeRangeTesters web without logging in.
        Given I navigate to www.freerangetesters.com

    Scenario Outline: I can access the subpages throug the navigation bar
        When I go to <section> using the navigation bar
        Examples:
            | section              |
            | Cursos               |
            | Recursos             |
            | Blog                 |
            #| Programas de estudio |
            | Mentorías            |
            | Udemy                |

    Scenario: Courses are presented correctly to potential customers
        When I go to Cursos using the navigation bar
        Then Select Introducción al Testing

    @Plans
    Scenario: Users can select a plan when signing up
        When The user select Elegir Plan
        Then The user can validate the options in the checkout page