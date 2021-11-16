import java.util.*;
class InsertionSort{
		public static void main(String args[]){
			int n,i,j,key,a[];
			Scanner s = new Scanner(System.in);
			System.out.println("How many numbers?");
			n = s.nextInt();
			a = new int [n]; //Instantiating array
			for(i=0;i<n;++i)
				a[i] = s.nextInt();
			// Insertion sorting array
			for(i = 1; i<n; ++i)
			{
				key = a[i];
				j = i-1;
				while(j>=0 && a[j]>key)
				{
					a[j+1] =a[j];
					j--;
				}
				a[j+1] = key;
			}
			// Printing the sorted array
			for(i =0;i<n;++i)
				System.out.print(a[i] + " ");
		}
}