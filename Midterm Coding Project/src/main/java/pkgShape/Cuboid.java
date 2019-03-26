package pkgShape;

import java.util.Comparator;

import pkgShape.Cuboid;
import pkgShape.Rectangle; 
public class Cuboid extends Rectangle {
	private int iDepth;

	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
	if (iDepth > 0) {
		this.iDepth= iDepth;
	}
	else 
		{
		throw new IllegalArgumentException();
		}
	}
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return getiLength()*getiWidth()*iDepth;
	}
	public double area() {
		return 2*((getiLength()*getiWidth()) + (getiWidth()*iDepth) + (iDepth*getiLength()));
	}
	public double perimeter() {
		throw new UnsupportedOperationException("Unable to calculate perimeter");
	}
	public int compareTo(Object obj) {
		int compareObj = (int) ((Cuboid)obj).area();
		return (int) (this.area() - compareObj);
	}
	
	class SortByArea implements Comparator<Cuboid>
	{
		@Override
		public int compare(Cuboid a, Cuboid b) {
			// TODO Auto-generated method stub
			return (int) (a.volume() - b.volume());
		}
		
	}
	
	class SortByVolume implements Comparator<Cuboid>
	{

		@Override
		public int compare(Cuboid a, Cuboid b) {
			// TODO Auto-generated method stub
			return  (int) (a.area() - b.area());
		}

		
	}
}
