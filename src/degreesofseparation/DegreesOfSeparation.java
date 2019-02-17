package degreesofseparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DegreesOfSeparation {

	static Scanner sc=new Scanner(System.in);
	static boolean[][] relations=new boolean[50][50];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<50;i++)
			for (int j=0;j<50;j++)
				relations[i][j]=false;
		
		relations[2][6]=true;
		relations[6][2]=true;
		relations[1][6]=true;
		relations[6][1]=true;
		relations[3][6]=true;
		relations[3][6]=true;
		
		String cmd=sc.nextLine();
		while (!cmd.equals("q")) {
			switch (cmd.charAt(0)) {
			case 'i':
				int x=sc.nextInt();
				int y=sc.nextInt();
				sc.nextLine();
				relations[x][y]=true;
				relations[y][x]=true;
				break;
			case 'd':
				x=sc.nextInt();
				y=sc.nextInt();
				sc.nextLine();
				relations[x][y]=false;
				relations[y][x]=false;
				break;
			case 'n':
				x=sc.nextInt();
				sc.nextLine();
				int count=0;
				for (int i=0;i<50;i++) {
					if (relations[x][i])
						count++;
				}
				System.out.println(count);
				break;
			case 'f':
				x=sc.nextInt();
				sc.nextLine();
				count=0;
				HashSet<Integer> friends=new HashSet<Integer>();
				for (int i=0;i<50;i++) {
					if (relations[x][i]) {
						for (int j=0;j<50;j++) {
							if (relations[i][j]) {
								if (j!=x && !friends.contains(j) )
									friends.add(j);
							}
						}
					}
				}
				System.out.println(friends.size());
				break;
			case 's':
				x=sc.nextInt();
				y=sc.nextInt();
				sc.nextLine();
				ArrayList<Integer> currentFriends=new ArrayList<Integer>();
				currentFriends.add(x);
				ArrayList<Integer> nextFriends=new ArrayList<Integer>();
				HashSet<Integer> checkedFriends=new HashSet<Integer>();
				boolean found=false;
				int level=1;
				while (!found) {
					for (int f:currentFriends) {
						if (f==y) {
							System.out.println(level);
							found=true;
							break;
						}
						if (!checkedFriends.contains(f)) {
							checkedFriends.add(f);
							nextFriends.add(f);
						}
					}
					if (!found) {
						currentFriends=nextFriends;
						nextFriends=new ArrayList<Integer>();
					}
				}
				break;
			default:
				continue;
			}
			cmd=sc.nextLine();
		}
		
		getGCF(12,18);
	}
	
	public static int getGCF(int i, int j) {
		// TODO Auto-generated method stub
		return 1;
	}
	
	

}
