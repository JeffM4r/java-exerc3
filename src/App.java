import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] arr1 = new String[]{"Morango", "Uva", "Acerola", "Manga", "Limão"};
        String[] arr2 = new String[]{"Pêra", "Caju", "Morango", "Kiwi", "Limão"};

        for(int i = 0 ; i < arr1.length ; i++ ) {

            if(Arrays.asList(arr2).contains(arr1[i])){
                System.out.println(arr1[i]);
            }
        }

    }
}
