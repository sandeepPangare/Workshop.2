public class Array {

   public void setArray() {

       int[] array = new int[]{7, 3, 9, 0, 7, 8, 0};

       for (int i = 0; i < array.length; i++) {
           for (int j = i + 1; j < array.length; j++) {
               if (array[i] < array[j]) { //compare that element
                   //swaping
                   int temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }

    public void Palindrome(){
       String a="level";
       String rev="";
       for (int i=a.length()-1; i>=0; i--){

           rev=rev+a.charAt(i);
       }
       if(a.toLowerCase().equals(rev.toLowerCase())){
        System.out.println(rev+"is a palindrome");
    }
       else {
           System.out.println(rev+"is not palindrome");
        }
   }

    public static void main(String[] args) {
        Array array = new Array();
        array.setArray();
        array.Palindrome();
    }
}
