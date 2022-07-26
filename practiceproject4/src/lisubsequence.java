

public class lisubsequence {
	
			static int max_ref; 
		static int lis1(int arr[], int n)
		{
			
			if (n == 1)
				return 1;

			int res, maxi = 1;
			for (int i = 1; i < n; i++) {
				res = lis1(arr, i);
				if (arr[i - 1] < arr[n - 1]
					&& res + 1 > maxi)
					maxi = res + 1;
			}

			
			if (max_ref < maxi)
				max_ref = maxi;

			return maxi;
		}

		
		static int lis(int arr[], int n)
		{
			
			max_ref = 1;


			lis1(arr, n);

			return max_ref;
		}

		
		public static void main(String args[])
		{
			int arr[]= { 10, 15, 9,34,24,68,19};
			
			int n = arr.length;
			System.out.println("given sequence is");
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+"  ");
				}
				System.out.println("\n");
			System.out.println("Length of longest incresing subsequence is " + lis(arr, n));
		}
	}
	


