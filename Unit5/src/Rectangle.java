
public class Rectangle extends Point{

	private int width;
	private int height;
	
	public Rectangle() {
		super();
		width = 0;
		height = 0;
	}
	
	public Rectangle(Point p, int width, int height) {
		super(p.getX(), p.getY());
		this.width = width;
		this.height = height;
	}	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(Point p1, Point p2) {
		super(p1.getX(), p1.getY());
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY();		
	}
	
	public  Rectangle(Segment segment) {	
		super(segment.getStartPoint().getX(),
				segment.getStartPoint().getY()) ;		
		Point p1 = segment.getStartPoint();
		Point p2 = segment.getEndPoint();
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY();		
	}
	
	public Rectangle(int x, int y, int width, int heigth) {
		super(x, y);
		this.width = width;
		this.height = height;	
	}
	
	public int getArea() {
		int area;
		area = width * height;
		return area;
	}
	
	public Point getPoint() {
		return this;
		
	}
	
	public Point getBottomLeftPoint() {
		return new Point(getX(), getY());
	}
	
	public Point getBottomRightPoint() {
		return new Point(getX() + width, getY());
	}
	
	public Point getTopLeftPoint() {
		return new Point(getX(), getY() + height);
	}
	
	public Point getTopRigthPoint() {
		return new Point(getX() + width, getY() + height);
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + " width: " + width + " height: " + height;		
	}	

}
