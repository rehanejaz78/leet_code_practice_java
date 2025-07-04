package sample;

public class toggle {

    public static void shuffle_string (String text){

        char[] ch = text.toCharArray();
        StringBuilder result= new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(ch[i])){
                result.append(Character.toLowerCase(ch[i]));
            }
            else if (Character.isLowerCase(ch[i])){
                result.append(Character.toUpperCase(ch[i]));
            }

        }
        System.out.println(result);


    }


    public static void main(String[] args) {
        shuffle_string("StRiNg");
    }

}
