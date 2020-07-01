package com.company;

public class connectedones {
    public static void main(String args[]){
        System.out.println(sol());
    }
    public static int sol() {
        int[][] grid = {{1, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1}};
        int count=0;
        for (int i = 0; i < grid.length; i++) {
             for(int j=0;j<grid[i].length;j++){
                 if(grid[i][j]==1){
                     count=count+findones(grid,i,j,0);
                 }
             }
        }
        return count;
    }
    public static int findones(int [][]grid,int row, int col,int count){
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]!=1){
            return 0;
        }
        grid[row][col]=0;
        count=count+1;

        findones(grid,row+1,col,count);
        findones(grid,row-1,col,count);
        findones(grid,row,col+1,count);
        findones(grid,row+1,col-1,count);
        return count;

    }
}
