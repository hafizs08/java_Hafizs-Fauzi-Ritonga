public class ujian{
    public static void main(String[]args){
        int[] a =  {1, 2, 3};
        int[] b =  {1, 2, 3};
        int total = 0, tes= 0;
        for (int i = 0; i < a.length; ++i) {
            total = a[i] * b[i];
            tes+= total ;
           
         //System.out.println(tes+" tes");
           
        }
        System.out.println(tes);
      }
    
    }
