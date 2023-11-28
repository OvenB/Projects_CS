#include <stdio.h>
char map[101][101];
int eat;

int pacmon (int j, int k, int row, int col){
    if(j>=row || j<0 || k>=col || k<0 || map[j][k]=='#'){
		return eat;
	}
    if(map[j][k]=='*') {
        eat++;
    }
    map[j][k]= '#';
    
    pacmon(j-1,k,row,col);
	pacmon(j+1,k,row,col);
	pacmon(j,k-1,row,col);
	pacmon(j,k+1,row,col);
	
	return eat;
}

int main (){
	int a;
	scanf("%d", &a);
	for (int i=1; i<=a; i++){
		eat =0;
		int eats;
		int row, col;
		scanf("%d %d", &row, &col);
		getchar();
		for (int j=0;j<row; j++){
			scanf("%s",map[j]);
		}
		
		for (int j=0;j<row; j++){
			for (int k=0;k<col; k++){
				if(map[j][k]=='P'){
					eats = pacmon(j,k,row,col);
					break;
				}
			}
		}
		printf("Case #%d: %d\n",i, eats);
	}
	return 0;
}
