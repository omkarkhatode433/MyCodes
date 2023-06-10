package solving;


public class PlaceBishop {

	public static void main(String[] args) {
		int n=8,count=0;
		char[][] board=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='.';
			}
		}
		for(int i=0;i<n;i++) {
			board[i%2][i]='B';
		}
		for(int i=1;i<n;i++) {
			if(i%2==1) {
				board[i%2][i]='.';
				int j=1,k=i;
				if(i!=n-1) {
				for( j=1,k=i;j<n&&k<n;j++,k++) {
					
					
				}
				board[j-1][k-1]='B';
				print(board);
				count++;
				}else {
					for(int l=j,m=k;l<n&&m>=0;l++,m--) {
						if(l==m) {
							board[j-1][k-1]='.';
							board[l][m]='B';
							print(board);
							
						}
						
					}
				}
				if(j-1!=k-1) {
				for(int l=j-1,m=k-1;l<n&&m>=0;l++,m--) {
					if(l==m) {
						board[j-1][k-1]='.';
						board[l][m]='B';
						print(board);
						count++;
					}
					
				}
				}
				
			}
				for(int l=0,m=i;l<n&&m>=0;l++,m--) {
					if(l==m) {
						board[0][i]='.';
						board[l][m]='B';
						print(board);
						count++;
					}
					
				}
				
			
			
		}
		
		
		
		print(board);
		System.out.println();
		System.out.println(count);
		

	}

	private static void print(char[][] board) {
		int n=board.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}
	

}
