
class evenodd
{
    public static void main(String args[]) {
        
        int arr[] = {23,78,4,220,23,34,23,56,33};
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];   
        int eIdx = 0, oIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even[eIdx++] = arr[i];
            else
                odd[oIdx++] = arr[i];
        }
        
        System.out.println("Even Numbers:");
        for (int i = 0; i < eIdx; i++) {
            System.out.print(even[i] + " ");
        }
        
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oIdx; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}