package assignment;

public class Question2_Theatre extends Question2_Movies {


public static void main(String[] args) {
	
	Question2_Theatre movie = new Question2_Theatre();			
	movie.Bollywood();					
	movie.Hollywood();					
	
}

@Override
void Bollywood() {
	// TODO Auto-generated method stub
	System.out.println("Pathaan");
}

@Override
void Hollywood() {
	// TODO Auto-generated method stub
	System.out.println("Avatar");
}
}
