import java.util.*;
import java.io.*;
import java.io.FileWriter;
public class chatbot {
		String s=new String();
	   String a=new String();
	   int qc=0,ac=0;
	   Scanner sc;
	 
	   public chatbot(String exitstatement , String defaultanswer){
	       this.s=exitstatement;
	       this.a=defaultanswer;
	   }
	  
	   public int getNumberOfQuestions() throws IOException,FileNotFoundException{
	       this.sc=new Scanner(new File("questions.txt"));
	       while(this.sc.hasNextLine()){
	           String line=this.sc.nextLine();
	           this.qc++;
	       }
	       return this.qc;
	   }
	   public int getNumberOfAnswers() throws IOException,FileNotFoundException{
	       this.sc=new Scanner(new File("answers.txt"));
	       while(this.sc.hasNextLine()) {
	           String line=this.sc.nextLine();
	           this.ac++;
	       }
	       return this.ac;
	   }
	  
	   public void addQuestion(String q) throws IOException,FileNotFoundException{
	       FileWriter fw = new FileWriter("questions.txt");
	       fw.write(q);
	      
	   }
	  
	   public void addAnswer(String keyword,String answer) throws IOException,FileNotFoundException{
	       String val=keyword+","+answer;
	       FileWriter fw = new FileWriter("answers.txt");
	       fw.write(val);
	
	      
	   }
	  
	   public Boolean hasMoreQuestions(){
	       if(this.s==null)
	           return true;
	       else
	           return false;
	   }
	  
	   public String nextQuestion() throws IOException ,FileNotFoundException{
		   Random rand = new Random();
	       int n = rand.nextInt(13) + 1;
	       int i=0;
	       String line=new String();
	       this.sc=new Scanner(new File("answers.txt"));
	       while(i!=n)
	       {
	    	   while(sc.hasNextLine()){
	    		   line=this.sc.nextLine();
	    	   }
	          
	          
	       }
	       return line;
	    }

	
	  
	   public String answer(String response) throws IOException,FileNotFoundException{
	      

		   this.sc=new Scanner(new File("answers.txt"));
	       String temp=new String("");
	       String line=new String();char ch;int i=0;
	       while(this.sc.hasNextLine()) {
	           line=this.sc.nextLine();
	           for( i=0;i<line.length();i++) {   
	        	   if(line.charAt(i)!=','){
	           ch=line.charAt(i);temp=temp+ch;
	           }
	                 else
	                   break;
	          
	           }
	           if(i==line.length())
	               break;
	       }
	       if(temp.equals(response))
	               return line;
	           else
	               return this.a;
	      
	      
	   }
	}

