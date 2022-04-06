package automationtest;
/* 5.1 Create the class with the name "ArrayList_Q5"
5.2	Create the main method
5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
5.4 Print the list using a forEach loop.
OutPut
Scrum
Java
Jira
Selenium
Cucumber
Postman
Rest Assured
*/

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String>name = new ArrayList<String>();
        name.add("Scrum");
        name.add("Java");
        name.add("Jira");
        name.add("Selenium");
        name.add("CUCUMBER IS THE BEST ");
        name.add("Postman");
        name.add("Rest Assured");
        for(String namelist:name){
            System.out.println(namelist);
        }
    }
}
