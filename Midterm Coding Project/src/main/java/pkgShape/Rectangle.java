package pkgShape;

import pkgShape.Rectangle;
import pkgShape.Shape;

public class Rectangle extends Shape implements Comparable<Object>{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		if (iWidth >0 && iLength > 0)
		{
		this.iWidth = iWidth;
		this.iLength = iLength;
		}
		else 
		{
			throw new IllegalArgumentException();
		}
	}
	
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;}
		
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return iLength * iWidth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2*iLength) + (2*iWidth);
	}
	
	public int compareTo(Object obj) {
		int compareObj = (int) ((Rectangle)obj).area();
		return (int) (this.area() - compareObj);
	}

}

