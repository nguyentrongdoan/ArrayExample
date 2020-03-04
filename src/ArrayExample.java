import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random input = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++){
            arr[i] = input.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner a = new Scanner(System.in);
        System.out.println("\n Vui long nhap chi so cua mot phan tu");
        int x = a.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so" + x + "la: " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han cua mang");
        }
    }
}
