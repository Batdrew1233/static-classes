package com.pluralsight;

public class NameFormatter {
    private NameFormatter(){}

    public static String format(String firstName, String lastName){

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

}
