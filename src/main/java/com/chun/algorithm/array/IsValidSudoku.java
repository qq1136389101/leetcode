package com.chun.algorithm.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 有效的数独
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2f9gg/
 *
 * @author chun
 * @date 2021/6/23 15:27
 */
public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] chars = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean validSudoku = isValidSudoku(chars);
    }

    /**
     * 复杂版
     * @param board
     * @return
     */
    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> row = new HashMap();
        Map<Integer, Set<Character>> col = new HashMap();
        Map<Integer, Set<Character>> square = new HashMap();
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board.length; i1++) {
                if(board[i][i1] == '.'){
                    continue;
                }
                if(!row.containsKey(i)){
                    row.put(i, new HashSet<>());
                }
                if(!row.get(i).add(board[i][i1])){
                    return false;
                }

                if(!col.containsKey(i1)){
                    col.put(i1, new HashSet<>());
                }
                if(!col.get(i1).add(board[i][i1])){
                    return false;
                }

                int squareIndex = i / 3 * 3 + i1 / 3;
                if(!square.containsKey(squareIndex)){
                    square.put(squareIndex, new HashSet<>());
                }
                if(!square.get(squareIndex).add(board[i][i1])){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 简化版
     * @param board
     * @return
     */
    public static boolean isValidSudoku2(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] square = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board.length; i1++) {
                if(board[i][i1] == '.'){
                    continue;
                }

                if(row[i][board[i][i1] - '1'] == 1){
                    return false;
                }else{
                    row[i][board[i][i1] - '1'] = 1;
                }

                if(col[i1][board[i][i1] - '1'] == 1){
                    return false;
                }else{
                    col[i1][board[i][i1] - '1'] = 1;
                }

                int squareIndex = i / 3 * 3 + i1 / 3;
                if(square[squareIndex][board[i][i1] - '1'] == 1){
                    return false;
                }else{
                    square[squareIndex][board[i][i1] - '1'] = 1;
                }
            }
        }
        return true;
    }
}
