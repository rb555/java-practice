package tuni;

public class App {

    //invertir un string recibido

    private void stringInvertido (String text){
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length;i>0; i--){
            newText.append(array[i-1]);
        }
        System.out.println(newText);
    }

    private void esCapicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)){
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
    public static void main(String args[]){
        App app = new App();
        //app.stringInvertido("metallica");
        app.esCapicua(5005);
    }
}
