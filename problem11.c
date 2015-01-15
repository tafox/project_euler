#include <stdio.h>
#include <stdlib.h>

#define N 20

int getaline(int* line);
void printline(int* line);
int getmax(int* lines[]);

int main() 
{
	int* lines[N];
	for (int i = 0; i < N; i++) {
		lines[i] = malloc(N*sizeof(int));
		getaline(lines[i]);
	}
	for (int i = 0; i < N; i++)
		printline(lines[i]);
	printf("%d\n", getmax(lines));
	return 0;
}

int getmax(int* lines[])
{
	int max;
	int pmax;
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (i < 17) { 
				pmax = lines[i][j] * lines[i+1][j] * lines[i+2][j] * lines[i+3][j];
				if (pmax > max) 
					max = pmax;
			}
			if (j < 17) {
				pmax = lines[i][j] * lines[i][j+1] * lines[i][j+2] * lines[i][j+3];
				if (pmax > max) 
					max = pmax;
			}
			if (i > 2) {
				pmax = lines[i][j] * lines[i-1][j] * lines[i-2][j] * lines[i-3][j];
				if (pmax > max) 
					max = pmax;
			}
			if (j > 2) {
				pmax = lines[i][j] * lines[i][j-1] * lines[i][j-2] * lines[i][j-3];
				if (pmax > max) 
					max = pmax;
			}
			if (i < 17 && j < 17) {
				pmax = lines[i][j] * lines[i+1][j+1] * lines[i+2][j+2] * lines[i+3][j+3];
				if (pmax > max) 
					max = pmax;
			}
			if (i < 17 && j > 2) {
				pmax = lines[i][j] * lines[i+1][j-1] * lines[i+2][j-2] * lines[i+3][j-3];
				if (pmax > max) 
					max = pmax;
			}
			if (i > 2 && j > 2) {
				pmax = lines[i][j] * lines[i-1][j-1] * lines[i-2][j-2] * lines[i-3][j-3];
				if (pmax > max) 
					max = pmax;
			}
			if (i > 2 && j < 17) {
				pmax = lines[i][j] * lines[i-1][j+1] * lines[i-2][j+2] * lines[i-3][j+3];
				if (pmax > max) 
					max = pmax;
			}
		}
	}
	return max;
}
				
void printline(int* line) {
	for (int i = 0; i < N; i++) {
		if (i == 0) 
			printf("%2d", line[i]);
		else
			printf("%3d", line[i]);
	}
	printf("\n");
}

int getaline(int* line)
{
	int c;
	for (int i = 0; i < N; i++) {
		if (scanf("%d", &c) == EOF) 
			return -1;
		line[i] = c;
	}
	return 0;
}
		
	
