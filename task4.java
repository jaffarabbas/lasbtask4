/******************************************************************************

 Lab Task:

 Task 4:

 Create a class PSLteams with attributes such as teamName, playerNames, Rank, NoOfMatchesPlayed,
 NoOfMatchesWon, MatchesLost etc. Apply access modifiers so that
 - fields can not be changed but can be viewed.
 - methods can be accessed from anywhere.
 Design a constructor to add information of team etc. name, player names and rank , set matches played, won and lost
 to 0. Design method playmatch() which takes a single parameter bstatusb which can be true or false, where true
 indicates winning and false means that team has lost the match. No. of matches played, match won and lost should
 automatically be maintained whenever there is a match played. User will be able to view updated information at any
 time.
 Design a class PSLteams2019 as test class. Create objects for all PSLteams (KarachiKings, MultanSultan,
 IslamabadUnited, QuettaGliadiators and PeshawarZalmi). Call method playmatch() by every team and pass status.
 Check no. of matches played, won and lost.
 Bonus: Try to create a mechanism of auto ranking for bonus point

 *******************************************************************************/
   
  
import java.util.Random;

import java.util.Scanner;

 
 
class PSLteams 
{
  
 
    //Variables
    
private String TeamName;
  
public int TeamNo;
  
private String[]PlayerNames = new String[15];
  
private int Rank;
  
private int NoOfMatchesPlayed;
  
private int NoOfMatchesWon;
  private int MatchesLost;
  
 
    //constructor
    
 
public PSLteams (String teamname, int teamno, String[]playernames)
  {
  TeamName = teamname;
  TeamNo = teamno;
  PlayerNames = playernames;
  } 

 //methods
 
public void playmatch(char status){
  if(status == 'T'){
    NoOfMatchesWon++;
    NoOfMatchesPlayed++;
  }
  
  else{
    MatchesLost++;
    NoOfMatchesPlayed++;
    
  }
} 

public void GetDetail(){
  System.out.println("The name of team is "+TeamName);
  System.out.println("PlayerNames is "+PlayerNames);
  System.out.println("NoOfMatchesPlayed is "+NoOfMatchesPlayed);
  System.out.println("NoOfMatchesWon is "+NoOfMatchesWon);
  System.out.println("MatchesLost is "+MatchesLost);
}


} 
 
 
public class task4
{
  
 
public static void main (String[]args) 
  {
    
 
Random rang = new Random();
Scanner scan = new Scanner(System.in);


String[] m1 = {"Imad Wasim (captain)", " Babar Azam", " Mohammad Amir",
	" Iftikhar Ahmed", " Aamir Yamin", " Usama Mir", " Umer Khan",
	" Alex Hales", " Chris Jordan", " Sharjeel Khan",
	" Cameron Delport", " Mohammad Rizwan", " Umaid Asif",
	" Chadwick Walton", " Ali Khan", " Arshad Iqbal",
	" Mitch McClenaghan", " Awais Zia"};
PSLteams KK =
      new PSLteams ("Karachi Kings", 1, m1);
    
 
String[] m2 = {"Shadab Khan(captain)", " Faheem Ashraf", " Asif Ali", " Luke Ronchi",
	" Hussain Talat", " Amad Butt", " Musa Khan", " Dale Steyn",
	" Colin Ingram", " Colin Munro", " Rumman Raees", " Rizwan Hussain",
	" Phil Salt", " Zafar Gohar", " Akif Javed", " Ahmed Safi Abdullah",
	" Saif Badar", " Dawid Malan."};
PSLteams IU =
      new PSLteams ("Islamabad United", 2, m2);
    
 
String[] m3 =
    {
    "Darren Sammy (captain)", " Hasan Ali",
	" Kieron Pollard (partial tournament)", " Wahab Riaz",
	" Kamran Akmal", " Imam-ul-Haq", " Umar Amin", " Tom Banton",
	" Shoaib Malik", " Liam Dawson", " Mohammad Mohsin", " Rahat Ali",
	" Lewis Gregory", " Adil Amin", " Amir Khan", " Aamir Ali",
	" Liam Livingstone", " Haider Ali",
	" Carlos Brathwaite (partial tournament)"};
PSLteams PZ =
      new PSLteams ("Peshawar Zalmi", 3, m3);
    
 
String[] m4 =
    {
    "Sarfaraz Ahmed (captain)", " Mohammad Nawaz", " Shane Watson",
	" Ahmed Shehzad", " Umar Akmal (suspended)", " Mohammad Hasnain",
	" Ahsan Ali", " Naseem Shah", " Jason Roy", " Ben Cutting",
	" Fawad Ahmed", " Sohail Khan", " Tymal Mills", " Abdul Nasir",
	" Arish Ali Khan", " Azam Khan", " Keemo Paul (partial tournament)",
	" Khurram Manzoor", " Zahid Mehmood (partial tournament)",
	" Anwar Ali"};
PSLteams QG =
      new PSLteams ("Quetta Gladiators", 4, m4);
    
 
String[] m5 =
    {
    "Sohail Akhtar (captain)", " Fakhar Zaman", " Mohammad Hafeez",
	" Shaheen Shah Afridi", " David Wiese", " Usman Shinwari",
	" Haris Rauf", " Salman Butt", " Chris Lynn", " Samit Patel",
	" Seekkuge Prasanna", " Ben Dunk", " Farzan Raja", " Jaahid Ali",
	" Muhammad Faizan", " Dane Vilas", " Dilbar Hussain."};
    
PSLteams LQ =
      new PSLteams ("Lahore Qalandars", 5, m5);
    
 
String[] m6 =
    {
    "Shan Masood (captain)", " Shahid Afridi", " Mohammad Irfan",
	" James Vince", " Junaid Khan", " Moeen Ali", " Rilee Rossouw",
	" Zeeshan Ashraf", " Ravi Bopara", " Sohail Tanvir", " Ali Shafiq",
	" Khushdil Shah", " Usman Qadir",
	" Fabian Allen (partial tournament)", " Mohammad Ilyas",
	" Rohail Nazir", " Imran Tahir", " Bilawal Bhatti",
	" Wayne Madsen (partial tournament)"};
    
PSLteams MS = 
      new PSLteams ("Multan Sultans", 6, m6);

      for (int i = 0; i <= 30; i++) {
        int team1 = rang.nextInt(6) + 1; 
        int team2 = rang.nextInt(6) + 1;
        int win = rang.nextInt(2);
        
        i = team1 == team2 ? i--: i ;
        
        //team 1
        char status = win == 0 ? 'T' : 'F';
        char statu = status == 'T' ? 'F': 'T';
        team2 = team2 * 10;
        
        switch(team1){
          case 1:
            KK.playmatch(status);
            break;
          case 2:
            IU.playmatch(status);
            break;
          case 3:
            PZ.playmatch(status);
            break;
          case 4:
            QG.playmatch(status);
            break;
          case 5:
            LQ.playmatch(status);
            break;
          case 6:
            MS.playmatch(status);
            break;
          //team 2
          
          case 10:
            KK.playmatch(statu);
            break;
          case 20:
            IU.playmatch(statu);
            break;
          case 30:
            PZ.playmatch(statu);
            break;
          case 40:
            QG.playmatch(statu);
            break;
          case 50:
            LQ.playmatch(statu);
            break;
          case 60:
            MS.playmatch(statu);
            break;
        }
        }
        
      
 
 KK.GetDetail();
 IU.GetDetail();
 MS.GetDetail();
 QG.GetDetail();
 LQ.GetDetail();
 PZ.GetDetail();
 
 
 
} 

  
}
