package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int i=1;i<=T;i++) {
        	String num = String.valueOf(i);
        	StringBuilder clap = new StringBuilder();
        	StringBuilder notClap = new StringBuilder();
        	boolean isClap = false;
        	for(char c : num.toCharArray()) {
        		if(c - '0' ==3 || c - '0' ==6 || c - '0' ==9) {
        			isClap = true;
        			clap.append("-");
        		}
        		if(!isClap) {
        			notClap.append(c);
        		}
        	}
        	if(isClap) {
        		System.out.print(clap.toString()+" ");
        	}else {
        		System.out.print(notClap.toString()+" ");
        	}
        }
        
    }
}

