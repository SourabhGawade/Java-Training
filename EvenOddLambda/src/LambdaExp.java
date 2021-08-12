public class LambdaExp {
	
	public void getEvenNumbers(int no) {
		EvenOddInterface evenNumber = num -> {
			int i =1; 
			int even_sum = 0;			
			while(i<=num) {
				if(i%2 == 0) {
					System.out.print(i+"\t");
					even_sum += i;
					i+=2;
				}else
					i+=1;
			}
			System.out.println("\nSum of All Even Numbers: "+ even_sum+"\n");
		};
		evenNumber.findNumber(no);
	}
	public void getOddNumbers(int no) {
		EvenOddInterface oddNumber = num -> {
			int i =1; 
			int odd_sum = 0;			
			while(i<=num) {
				if(i%2 != 0) {
					System.out.print(i+"\t");
					odd_sum += i;
					i+=2;
				}else
					i+=1;
			}
			System.out.println("\nSum of All Even Numbers: "+ odd_sum);
		};
		oddNumber.findNumber(no);
	}

}
