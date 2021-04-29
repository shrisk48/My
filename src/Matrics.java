public class Matrics {
    public static void main(String[] args)
    {
        int [][] arr1= {{5,8},
                       {9,3}};
        int [][] arr2= {{5,4},
                {9,2}};
        int [][] arr3=new int[2][2];
        for(int i=0;i< arr1.length ;i++) {
            for(int j=0;j< arr2.length;j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<arr3.length;i++) {
                for(int j=0;j<arr3.length;j++) {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println() ;
        }
    }
}
