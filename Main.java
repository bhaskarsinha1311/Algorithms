import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  
  public static void main(String[] args) {
        
        int M[][]=  new int[][] {{1, 1, 0, 1, 0},
                                 {0, 1, 0, 0, 0},
                                 {1, 0, 0, 1, 1},
                                 {0, 1, 0, 0, 1},
                                 {0, 0, 1, 0, 1},
                                 {1, 0, 1, 0, 1},
                                 {1, 0, 1, 0, 1},
                                 {1, 0, 1, 0, 1}
                                };
                                
        int row = M.length;
        int column = M[0].length;
        
        int count=0;
        
        for(int i=0;i<row;i++){
          for(int j=0;j<column;j++){
            if(M[i][j]==1){
              DFS(M, i, j, row , column);
              count++;
            }
          }
        }
        
        System.out.println(count);
  }
  
  public static void DFS(int[][] M, int i, int j, int row, int column){
    
        M[i][j]=0;
        
        if(i-1>=0 && i-1<row && j>=0 && j<column){
          if(M[i-1][j]==1)
            DFS(M,i-1,j,row,column);
        }
        
        if(i>=0 && i<row && j-1>=0 && j-1<column){
          if(M[i][j-1]==1)
            DFS(M,i,j-1,row,column);
        }
        
        if(i+1>=0 && i+1<row && j>=0 && j<column){
          if(M[i+1][j]==1)
            DFS(M,i+1,j,row,column);
        }
        
        if(i>=0 && i<row && j+1>=0 && j+1<column){
          if(M[i][j+1]==1)
            DFS(M,i,j+1,row,column);
        }
        
        if(i+1>=0 && i+1<row && j-1>=0 && j-1<column){
          if(M[i+1][j-1]==1)
            DFS(M,i+1,j-1,row,column);
        }
        
        if(i-1>=0 && i-1<row && j+1>=0 && j+1<column){
          if(M[i-1][j+1]==1)
            DFS(M,i-1,j+1,row,column);
        }
        
        if(i-1>=0 && i-1<row && j-1>=0 && j-1<column){
          if(M[i-1][j-1]==1)
            DFS(M,i-1,j-1,row,column);
        }
        
        if(i+1>=0 && i+1<row && j+1>=0 && j+1<column){
          if(M[i+1][j+1]==1)
            DFS(M,i+1,j+1,row,column);
        }
        
        return;
  }
  
}