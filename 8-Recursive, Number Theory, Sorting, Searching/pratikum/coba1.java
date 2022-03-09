public class coba1 {
    public String complementWC(){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<dna.length();i++){
            char c = dna.charAt(i);
            if(dna.charAt(i) == 'T'){
                builder.append('A');
            }
            if(dna.charAt(i) == 'A'){
                builder.append('T');
            }
            if(dna.charAt(i) == 'C'){
                builder.append('G');
            }
            if(dna.charAt(i) == 'G'){
                builder.append('T');
            }   
        }
        return builder.toString();
    }
     public static void main(String[] args) {
        System.out.println(primeNumber(1000000007));
}
