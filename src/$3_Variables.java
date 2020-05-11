public class $3_Variables {
    public static void main(String[] args) {
        // dataType variableName = value;
//        String firstName; // Declare a variable of type string
//        firstName = "Doe"; // assign a value to it

//        String lastName = "David"; // Declare a variable of type string and assign a value to it.

//        int num1; // Declare a variable of type integer
//        num1 = 10; // assign a value to it

//        int num2 = 20;
//        num2 = 30; //reassign new value
//        System.out.println(num2);

//        final double PI = 3.14; // Declare a constant variable, also known as final variable
//        PI = 1.2; //here you try to reassign value to a constant variable
//        which cause an error.

//        String name = "Dua Lipa";
//        int age = 20;
//        String salary1 = "2000";
//        int salary2 = 5000;
//        System.out.println(name+" is "+age+" years old");
//        System.out.println(salary1+salary2);


        //How to declare multiple variable of the same type in one line
        int a = 10;
        int b = 20;
        int c = 30;

        int d = 20, e = 30, f=40; // we should prefer this way if all the variables have the same
        // data type. It's more concise than the above code.

    }
}

/*
 Syntax: dataType variableName = value;
 Example: int num = 10;
 Where dataType can be int, char, float, String, boolean ... similar to C programming

 By default, all variables in Java are mutable which mean it can be reassigned or changed later in
 the program.
 To declare a immutable variable or a constant variable, we use final keyword.

 To declare multiple variables with the same type
 Syntax: dataType variable1 = value1, variable2 = value2, variable3 = value3, .... ,variableN = valueN
*/
