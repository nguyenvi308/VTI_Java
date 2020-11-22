import java.util.Scanner;

import java.util.*;
public class MyNews {

	
	private static final Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		List<NEWS> listOfNews = new ArrayList<>(); 
		
		System.out.println("Enter number of function : ");
		int k = scanner.nextInt(); 
		int[] rates = new int[3]; 
		NEWS news = new NEWS(); 
		switch(k)
		{
		case 1: 
			{
				// Insert news 
				System.out.println("Enter title :");
				String title = scanner.nextLine(); 
				news.setTitle(title);
				
				scanner.nextLine(); 
				
				System.out.println("Enter Content : ");
				String content = scanner.nextLine(); 
				news.setContent(content);
				scanner.nextLine(); 
				
				System.out.println("Enter PublishDate : ");
				String publishDate = scanner.nextLine(); 
				news.setPublishDate(publishDate);
				scanner.nextLine(); 
				
				System.out.println("Enter Author : ");
				String author = scanner.nextLine(); 
				news.setAuthor(author);
				
				listOfNews.add(news); 
				break; 
				
				
				
			}
		case 2 :
			{
				// Display 
				for(NEWS news1 : listOfNews)
				{
					news1.display();
				}
				break; 
			}
		case 3 : 
			{ 
				// Calculate 
				System.out.println("Enter Rating : ");
				
				for(int  i = 0; i < rates.length ; i++)
				{
					 rates[i] = scanner.nextInt(); 
					
					
				}
		
				news.calculate(rates);
				System.out.println("Average Rating " + news.getAverageRate());
				break; 
			}
		default : 
			{
				return; 
			}
		}
		
	}

}
