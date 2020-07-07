import java.util.Scanner;

public class BTXoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println();
        System.out.println("Mảng vừa tạo : ");
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*30);
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.println("Nhập số bất kì để kiểm tra : ");
        int number = scanner.nextInt();
        int count = 0 ;
        for (int i=0;i<array.length;i++){
            if (number==array[i]){
                int index = i;
                count++;
                while (array[index+1] == number){
                    count++;
                    index++;
                }
                if (count==1){
                    for (int j=i;j<array.length-1;j++){
                        array[j]=array[j+1];
                    }
                    array[array.length-1]=0;
                    count=0;
                    continue;
                }
                for (int j=i;j<array.length-count;j++){
                    array[j]=array[j+count];
                }
               for(int z = count; z > 0; z--){
                   array[array.length-z]=0;
               }
               count=0;

            }
        }
        System.out.println();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
