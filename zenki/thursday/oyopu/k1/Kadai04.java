class Kadai04{
	public static void main(String[] args){
    for(int i = 10; i <= 40; i++){
      System.out.print(!(i%10 == 2 || i/10 == 2) ? i+" " : "* ");
    }
    System.out.println("");
	}
}
