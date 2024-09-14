public class celciusToFareheit{
    int convert(int celcius){
        int fahrenheit = (celcius*9/5)+32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        celciusToFareheit celciusToFareheit = new celciusToFareheit();
        System.out.println(celciusToFareheit.convert(43));
    }
}