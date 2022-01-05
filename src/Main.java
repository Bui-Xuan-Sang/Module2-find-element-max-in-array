import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập size: ");
            size = scanner.nextInt();
            if (size > 100){
                System.out.println("Size không được quá 100 ");
            }
        }while (size > 100);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j++;
            }
        }
        System.out.println( "\n" + "Phần tử lớn nhất trong mảng: " + max +"\n" + "Nẳm ở vị trí: " + index);
    }
}
