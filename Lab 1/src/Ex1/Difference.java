package Ex1;

public class Difference {
		public static boolean calculateDifference (int n) {
			int diff=0;
			int squareSum=0;
			int sumSq=0;
			for(int i=1;i<=n;i++) {
				squareSum +=i*i;
				sumSq +=i;
				System.out.println(squareSum);
				System.out.println(sumSq);
				sumSq=sumSq*sumSq;
				diff=Math.abs(squareSum-sumSq);
				return false;
			}
			return false;
			}
			public static void main(String[] args) { 
				System.out.print(calculateDifference(10));
			}
				
			
			
			
			
		}

