class Kadai05{
	public static void main(String[] args){
    String pi = "314159265358979323846";
    char[] pis = pi.toCharArray();
    int[] picount = new int[10];
    for(int i = 0; i < pis.length; i++){
      picount[(int)pis[i] - 48]++;
    }
    for(int i = 0; i < 10; i++){
      StringBuilder sb = new StringBuilder();
      for(int j = 0; j < picount[i]; j++){
        sb.append("*");
      }
      System.out.println(i + "|" + sb.toString());
    }
	}
}
