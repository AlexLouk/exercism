import java.util.*;
import java.lang.*;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = replaceSpaces(identifier);
        identifier = kebabToCamelCase(identifier);
        identifier = convertLeetspeak(identifier);
        identifier = omitNonLetters(identifier);
        
        return identifier;
    }

    static String replaceSpaces(String str){
        str = str.replace(" ", "_");
        return str;
    }

    static String kebabToCamelCase(String str){
        char [] strArr = str.toCharArray();
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i] == '-'){
                strArr[i] = ' ';
                strArr[i+1] = Character.toUpperCase(strArr[i+1]);
            }
        }
        return new String(strArr).replaceAll("\\s", "");
    }

    static String convertLeetspeak(String str){
        str = str.replace("4", "a");
        str = str.replace("3", "e");
        str = str.replace("0", "o");
        str = str.replace("1", "l");
        str = str.replace("7", "t");

        return str;
    }

    static String omitNonLetters(String str){
        return str.replaceAll("[^a-zA-Z_]", "");
    }
}