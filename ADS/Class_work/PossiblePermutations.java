

class PossiblePermutations{
	static void findPermutations(String s,String res){
		if(s.length() == 0){
			System.out.println(res);
			return;
		}
		else{
			for(int i =0;i<s.length();i++){
				char a = s.charAt(i);
				System.out.print("Ch" + a + " " );
                 String ros = s.substring(0,i)+s.substring(i+1);
				 System.out.print("one" + s.substring(0,i) + " ");
				 System.out.print("two" + s.substring(i+1) + " ");
				findPermutations(ros, res+a);
			}
		}
	}
	public static void main(String[] args){
		
		findPermutations("ABC","");
	}
	
}