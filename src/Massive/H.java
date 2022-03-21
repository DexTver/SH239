package Massive;

public class H {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, 5}; // not copy!
        int sdlknkwe = 0;
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] < 0){
                arr[i] = 0;
                sdlknkwe++;
            }
        }
        sdlknkwe = arr.length - sdlknkwe;
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("\n" + sdlknkwe);
    }
}