package com.pluralsight;

public class NameFormatter {
    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        return firstName + " " + lastName;

    }

    public static String format (String prefix, String firstName, String middleName, String lastName, String suffix){
        String line = "";
        if (prefix != null && !prefix.isEmpty()) {
            line += prefix +". ";
        }

        line += firstName;
        line += " ";

        if (middleName != null && !middleName.isEmpty()){
            line += middleName + " ";
            }

        line += lastName;

        if (suffix != null && !suffix.isEmpty()){
            line += ", " + suffix;
        }

        return line;
    }

    public static String format(String fullName){
        String [] parts = fullName.split(" ");

        String prefix = "";
        String first = "";
        String middle = "";
        String last = "";
        String suffix = "";

        if (fullName.contains(",")){
            String[] split = fullName.split(",");
            suffix = split[1].trim();
            parts = split[0].split(" ");
        }

        if(parts.legth)



    }

}
