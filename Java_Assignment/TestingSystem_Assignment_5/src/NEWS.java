
public class NEWS implements INews {

	private int id; 
	private String title; 
	private String publishDate; 
	private String author; 
	private String content; 
	private float averageRate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	} 
	
	public float getAverageRate()
	{
		return averageRate; 
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
					title + "  " 
					+ publishDate + "  " 
					+ author + "  " 
					+ content + "  "  
					+ averageRate);
	}
	@Override
	public void calculate(int[] rates) {
		// TODO Auto-generated method stub
		
		int sum = 0; 
		for(int rate : rates)
		{
			sum = sum + rate; 
		}
		averageRate = (sum/3); 
		
		
	}
	
	
	

}
