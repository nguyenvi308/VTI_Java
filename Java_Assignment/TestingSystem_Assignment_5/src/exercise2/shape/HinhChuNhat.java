package exercise2.shape;

public class  HinhChuNhat {

	
	private float x ; 
	private float y; 
	
	
	
	public HinhChuNhat(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public float tinhchuvi()
	{
		return (x+y)*2; 
	}
	public float tinhdientich()
	{
		return x*y; 
		
	}
	

}
