public class Kadai03{
	public static void main(String[] args){
    String[] strs = new String[4];
    strs[0] = "Kadai01.txt";
    strs[1] = "Katakuramachi, Hachioji, Tokyo";
    strs[2] = "Before-tax price is 800 yen";
    strs[3] = "Kadai03.txt";
    int index = 0;
    for(int i = strs[0].length() - 1; i >= 0; i--){
      if(strs[0].charAt(i) == 'a'){
        index = i;
        break;
      }
    }
    System.out.println(index);
    System.out.println(strs[1].substring(strs[1].indexOf("m"), strs[1].indexOf("i") + 1));
    System.out.println(Integer.parseInt(strs[2].split(" ")[3]) * 1.08);
    System.out.printf("%s　の　index　は　%d\n", strs[3], 3);
	}
}
