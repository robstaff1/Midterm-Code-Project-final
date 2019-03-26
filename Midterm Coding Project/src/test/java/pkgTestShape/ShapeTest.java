package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.Rectangle;
import java.util.ArrayList;
import java.util.Collections;

public class ShapeTest {
	@Test
	public void RectangleGetterTest() {
		Rectangle rec = new Rectangle(3,7);
		
		assertTrue(rec.getiWidth() == 3);
		assertTrue(rec.getiLength() == 7);}
	
	@Test
	public void RectangleSetterTest() {
		Rectangle rec = new Rectangle(3,7);
		rec.setiLength(9);
		rec.setiWidth(16);
		
		assertTrue(rec.getiLength() == 9);
		assertTrue(rec.getiWidth() == 16);}
	
	@Test
	public void AreaTest() {
		Rectangle rec = new Rectangle(3,7);
		assertTrue(rec.area() == 21);}
	
	@Test
	public void PerimeterTest() {
		Rectangle rec = new Rectangle(3,7);
		assertTrue(rec.perimeter() == 20); }
	
	@Test
	public void RectangleCompareTest() {
		Rectangle rec1 = new Rectangle(3,7);
		Rectangle rec2 = new Rectangle(5,7);
		ArrayList<Rectangle> compareRec = new ArrayList<Rectangle>();
		compareRec.add(rec1);
		compareRec.add(rec2);
		Collections.sort(compareRec);
		
		assertTrue(compareRec.get(0).area() < compareRec.get(1).area()); }
	
	
	@Test (expected = IllegalArgumentException.class)
	public void RectangleTest2() {
		Rectangle rec = new Rectangle(-3, 7);
		
		assertTrue(rec.getiWidth() < 0);}
	
	@Test (expected = IllegalArgumentException.class)
	public void RectangleTest3() {
		Rectangle rec = new Rectangle(3, -7);
		
		assertTrue(rec.getiLength() < 0);}

	@Test
	public void CuboidSetterTest() {
		Cuboid cub = new Cuboid(1,2,3);
			cub.setiWidth(6);
			cub.setiLength(7);
			cub.setiDepth(8);
			
			assertTrue(cub.getiWidth() == 6);
			assertTrue(cub.getiLength() == 7);
			assertTrue(cub.getiDepth() == 8);}
	
	@Test
	public void CuboidGetterTest() {
		Cuboid cub = new Cuboid(2,3,4);
		
		assertTrue(cub.getiWidth() == 2);
		assertTrue(cub.getiLength() == 3);
		assertTrue(cub.getiDepth() == 4);}
	
	@Test
	public void CuboidAreaTest() {
		Cuboid cub = new Cuboid(1,2,3);
		
		assertTrue(cub.area() == 22);}
	
	@Test
	public void CuboidVolumeTest() {
		Cuboid cub = new Cuboid(1,2,3);
		
		assertTrue(cub.volume() == 6);}
	
	@Test (expected = UnsupportedOperationException.class)
	public void CubicPerimeterTest() {
		Cuboid cub = new Cuboid(1,2,3);
		cub.perimeter();}
	
	@Test
	public void CuboidAreaSortTest() {
		Cuboid cub1 = new Cuboid(1,2,3);
		Cuboid cub2 = new Cuboid(4,5,6);
		ArrayList<Cuboid> compareCub = new ArrayList<Cuboid>();
		compareCub.add(cub1);
		compareCub.add(cub2);
		Collections.sort(compareCub);
		assertTrue(compareCub.get(0).area() < compareCub.get(1).area());}
	
	@Test
	public void CuboidVolumeSortTest() {
		Cuboid cub1 = new Cuboid(1,2,3);
		Cuboid cub2 = new Cuboid(4,5,6);
		ArrayList<Cuboid> compareCub = new ArrayList<Cuboid>();
		compareCub.add(cub1);
		compareCub.add(cub2);
		Collections.sort(compareCub);
		assertTrue(compareCub.get(0).volume() < compareCub.get(1).volume());}
}
