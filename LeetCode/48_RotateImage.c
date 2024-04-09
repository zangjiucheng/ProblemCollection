void rotate(int** pt, int n, int* cn) {
    int x = 0, i, t, y;
    n--;
    while(x<n){
        y = n;
        for (i = x; i<n; i++){
            t = pt[x][i];
            pt[x][i] = pt[y][x];
            pt[y][x] = pt[n][y];
            pt[n][y--] = pt[i][n];
            pt[i][n] = t;
        }
        n--;
        x++;
    }
}
