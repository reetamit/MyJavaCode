public class StringPalindrom {
    public static void main(String[] args) {
        String[] strInputs = {
            "Hello World",
            "123321",
            "",
            null,
            " ",
            "Madam",
            "Anna",
            "Bob",
            "Rise to vote sir",
            "Java Example"            
        };

        for (String string : strInputs) {
            System.out.println(string+"  [isPalindrom]"+isPalindrom(string));
        }
    }
    
    public static boolean isPalindrom(String inputString)
    {
        if(inputString==null)
            return false;
        else if(inputString.length()==0)
            return false;

        return inputString.equalsIgnoreCase(new StringBuilder(inputString).reverse().toString());
    }
}
