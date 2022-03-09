public class task1 {
    public static void main (String []args){
        System.out.println(task1(1,2,3));
        System.out.println(task1(6,6,14));
    }
    static String task1(int a, int b, int c){
        int tambah, kali, pangkat;
        for(int i=0; i<=a; i++){
            for(int j=0; j<=b; j++){
                for(int k=0; k<=c; k++){
                    tambah = i+j+k;
                    kali = i*j*k;
                    pangkat = i*i+j*j+k*k;
                    if(tambah == a && kali == b && pangkat == c){
                        
                        return "a = "+tambah+" b = "+kali+" c = "+pangkat;
                    }
                }
            }
        }
        return "no solution";
    }
}
