package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
        for (int i = 0; i < size; i++){
		if (str[i] == s){
			return true;
		}	
    }
             return false;
    public void reverse() {
	    int j = size-1;
	    char c;
        for (int i = 0; i < size; i++){
		if(i > j)
			return;
		c = str[i];
		str[i] = str[j];
		str[j--] = c;
		
    }
	    return;
}}
