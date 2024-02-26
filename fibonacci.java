import java.util.*;
class fibonacci{  
  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter number of sequence u want to see: ");

    int see= sc.nextInt();

    ArrayList<Integer> arr1= new ArrayList<>();

    for(int i=0;i<see;i++){

        if(i==0 || i==1){

            arr1.add(i);

        }

        else{

            arr1.add(arr1.get(i-1)+arr1.get(i-2));

        }

    }

    System.out.println("Fibonacci number: "+arr1);

}

}