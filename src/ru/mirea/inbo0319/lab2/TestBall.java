package ru.mirea.inbo0319.lab2;

public class TestBall
{
    public  static  void main (String [] args)
    {
        Ball b1 = new Ball (100, 100);
        System.out.print(b1);
        b1.move (30, 15);
        System.out.print(b1);
    }
}
