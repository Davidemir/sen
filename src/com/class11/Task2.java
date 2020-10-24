package com.class11;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,Miss 
		 * and Smith, Jordan, Jackson, Obama. After storing values print the
		 * following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		
		String[] [] name = {
	// 1.row==> col 0, col 1, col 2  col 3	
				{"Mr", "Mrs", "Ms", "Miss"},
	// 2.row==> col 0,     col 1,      col 2     col 3
				{"Smith", "Jordan", "Jackson", "Obama"},
				
		};
		
		System.out.println(name[0] [1]+" "+name[1] [0]);//first row column 1 + second row column 0;
        System.out.println(name[0] [0]+" "+name[1] [3]);//first row column 0 + second row column 3;
        System.out.println(name[0] [2]+" "+name[1] [2]);//first row column 2 + second row column 2;
        System.out.println(name[0] [3]+" "+name[1] [1]);//first row column 3 + second row column 1;
        
        
        
        System.out.println(".........................");
        
        /*
         * Create a 2D array that ﬁrst row will contain 4 names and second row will contain grades.
         * Then you program should print name of the students that has as an A and B grade
         */
        
        String[][] names = {
      // 1.row==> col 0,  col 1,  col 2   col 3
        		{"Adam", "Jack", "Tony", "Solomon"},
      // 2.row==>col 0,   col 1
        		{"A",     "B"},
        };
        
        System.out.println(names[0][0]+" grade= "+names[1][0]);//1.row==> col 0 + 2.row==>col 0
        System.out.println(names[0][1]+" grade= "+names[1][1]);//1.row==> col 1 + 2.row==>col 1
        System.out.println(names[0][2]+" grade= "+names[1][0]);//1.row==> col 2 + 2.row==>col 0
        System.out.println(names[0][3]+" grade= "+names[1][1]);//1.row==> col 3 + 2.row==>col 1
        }
	}


