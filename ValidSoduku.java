package LeetCode;

import java.io.IOException;
import java.util.*;

/**
 * Created by Samarth on 3/22/2015.
 */
public class ValidSoduku {
    public static void main(String[] args) throws IOException {
    }
    
    
    public static boolean isValidSudoku(char[][] board) {     
    	// Check rows
    	for (int i=0; i<board.length; i++)
    	{
    		Set<Character> hash = new HashSet<Character>();
    		if (!isValidRow(board, i))
    		{
    			return false;
    		}
    		
    	}
    	
    	// Check columns
    	for (int i=0; i<board.length; i++)
    	{
    		Set<Character> hash = new HashSet<Character>();
    		if (!isValidColumn(board, i))
    		{
    			return false;
    		}
    	}
    	
    	
    	// check 3x3 cells
    	for (int row=0; row<9; row=row+3)
    	{
    		for (int column=0; column<9; column=column+3)
        	{
    			 if (!isValidRegion(board,  row,  column))
    			 {
    				 return false;
    			 }
        	}
    	}
    	
    	return true;
    	
    }
    
    public static boolean isValidRegion(char[][] board, int row, int column)
    {
    	Set<Character> hash = new HashSet<Character>();
		for (int i=row; i<(row+3); i++)
    	{ 
			for (int j=column; j<(column+3); j++)
	    	{ 
				if (!checkCell(board[i][j], hash))
				{
					return false;
				}
				
	    	}

    	}
		return true;
    }
    
    
    public static boolean isValidRow(char[][] board, int row)
    {
    	Set<Character> hash = new HashSet<Character>();
		for (int j=0; j<board.length; j++)
    	{ 
			if (!checkCell(board[row][j], hash))
			{
				return false;
			}
    	}
		return true;
    }
    
    public static boolean isValidColumn(char[][] board, int column)
    {
    	Set<Character> hash = new HashSet<Character>();
		for (int j=0; j<board.length; j++)
    	{ 
			if (!checkCell(board[j][column], hash))
			{
				return false;
			}
			
    	}
		return true;
    }
    
    
    public static boolean checkCell (char c, Set<Character> hash)
    {
    	if (c != '.')
		{
			if (!Character.isDigit(c) || c == '0')
			{
				return false;
			}
			if (hash.contains(c))
			{
				return false;
			}
		}
    	hash.add(c);
    	return true;
    }

}
