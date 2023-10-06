import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i=0; i <= numeros.length - 1; i++){
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }

        String[] letras = {"A", "B", "C", "J", "X"};
        for (int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));

        int[] nums = { 9, 10, 12, 25, 2};
        int maior = nums[0];
        int menor = nums[0];
        int media = 0;

        for (int i=0; i < nums.length; i++){
            if (nums[i] > maior)
                maior = nums[i];
            if (nums[i] < menor)
                menor = nums[i];
            media += nums[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/nums.length);
    }
}
