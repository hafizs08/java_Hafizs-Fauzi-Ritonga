

public class tes {
    public static void main (String[] args) {
        String str element("ATGCCATAG");
        System.out.println(str);
    }
    public static String element(String dna){
       char[] chars = dna.toCharArray();
       int i = 0;
       for(char chr : chars){
              if(chr == 'A'){
                chars[i] = 'T';
              }
              if(chr == 'T'){ 
                chars[i] = 'A';
              }
              if(chr == 'C'){
                chars[i] = 'G';
              }
              if(chr == 'G'){
                chars[i] = 'C';
              }
              i++;
       }
       String str =new String(chars);
       return str;
       }

}