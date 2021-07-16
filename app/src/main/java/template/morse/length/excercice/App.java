package template.morse.length.excercice;

public class App {

    public static void main(String[] args) {
        String message = args[0];
        
        HashMap<String, String> morseAlphabet = generateMorseAlphabet();
        
        //TODO: Traducir mensaje a Morse
        String messageInMorse = "";
        
        //TODO: Contar mensajes con el mismo número de letras
        int counter = 0;

        //NO borrar este mensaje
        System.out.println("The '" + message + "' message in Morse '" + messageInMorse + "'"
                + " has " + counter + " messages with the same number of letters that it could represent");
    }

    public HashMap<String, String> generateMorseAlphabet() {
        HashMap<String, String> morseAlphabet = new HashMap<>();
        morseAlphabet.put("a", ".-");
        morseAlphabet.put("b", "-...");
        morseAlphabet.put("c", "-.-.");
        morseAlphabet.put("d", "-..");
        morseAlphabet.put("e", ".");
        morseAlphabet.put("f", "..-.");
        morseAlphabet.put("g", "--.");
        morseAlphabet.put("h", "....");
        morseAlphabet.put("i", "..");
        morseAlphabet.put("j", ".---");
        morseAlphabet.put("k", "-.-");
        morseAlphabet.put("l", ".-..");
        morseAlphabet.put("m", "--");
        morseAlphabet.put("n", "-.");
        morseAlphabet.put("o", "---");
        morseAlphabet.put("p", ".--.");
        morseAlphabet.put("q", "--.-");
        morseAlphabet.put("r", ".-.");
        morseAlphabet.put("s", "...");
        morseAlphabet.put("t", "-");
        morseAlphabet.put("u", "..-");
        morseAlphabet.put("v", "...-");
        morseAlphabet.put("w", ".--");
        morseAlphabet.put("x", "-..-");
        morseAlphabet.put("y", "-.--");
        morseAlphabet.put("z", "--..");
        
        return morseAlphabet;
    }
    
    public String getGreeting() {
        return "Hello World!";
    }
}
