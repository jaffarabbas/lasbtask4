
import java.util.Random;

import java.util.Scanner;

class PSL_team
{
    private String TeamName;

    public int TeamNo;

    private String PlayerNames;

    private int Rank;

    private int NoOfMatchesPlayed;

    private int NoOfMatchesWon;
    private int MatchesLost;




    public PSL_team(String teamName,int teamNo,String playerNames)
    {
         TeamName = teamName;
         TeamNo = teamNo;
         PlayerNames =playerNames;
    }


    public void play_match(char check)
    {
       if(check == 'T')
       {
        NoOfMatchesWon++;
        NoOfMatchesPlayed++; 
       }
       else
       {
        MatchesLost++;
        NoOfMatchesPlayed++;
       }
    }


    public int GetDetail(){

      System.out.println("The name of team is "+TeamName);
      System.out.println(" The No of Team is "+TeamNo);
      System.out.println(" PlayerNames is "+PlayerNames);
      System.out.println("  NoOfMatchesPlayed is "+NoOfMatchesPlayed);
      System.out.println("   NoOfMatchesWon is "+NoOfMatchesWon);
      System.out.println("    MatchesLost is "+MatchesLost);
      return NoOfMatchesWon;
  }
}

class task4
{
    public static void main(String[] args) {
      Random rand = new Random();
      Scanner obj = new Scanner(System.in);

      PSL_team KK =
              new PSL_team ("Karachi Kings", 1, "Imad Wasim (captain), Babar Azam, Mohammad Amir, Iftikhar Ahmed,\n Aamir Yamin, Usama Mir, Umer Khan, Alex Hales, Chris Jordan, Sharjeel Khan , Cameron Delport,\n Mohammad Rizwan, Umaid Asif,Chadwick Walton, Ali Khan, Arshad Iqbal,Mitch McClenaghan, Awais Zia");

      PSL_team IU =
              new PSL_team ("Islamabad United", 2, "Shadab Khan(captain), Faheem Ashraf, Asif Ali, Luke Ronchi,\n Hussain Talat, Amad Butt, Musa Khan, Dale Steyn,Colin Ingram, Colin Munro, Rumman Raees,\n  Rizwan Hussain,Phil Salt, Zafar Gohar, Akif Javed, Ahmed Safi Abdullah,Saif Badar, Dawid Malan.");

      PSL_team PZ =
              new PSL_team ("Peshawar Zalmi", 3,  "Darren Sammy (captain), Hasan Ali , Kieron Pollard (partial tournament),\n Wahab Riaz, Kamran Akmal, Imam-ul-Haq, Umar Amin, Tom Banton,Shoaib Malik,\n Liam Dawson, Mohammad Mohsin, Rahat Ali,Lewis Gregory, Adil Amin, Amir Khan, Aamir Ali,Liam Livingstone, Haider Ali,Carlos Brathwaite (partial tournament)");

      PSL_team QG =
              new PSL_team ("Quetta Gladiators", 4, "Sarfaraz Ahmed (captain), Mohammad Nawaz, Shane Watson,Ahmed Shehzad,\n Umar Akmal (suspended), Mohammad Hasnain,Ahsan Ali, Naseem Shah, Jason Roy,\n Ben Cutting,Fawad Ahmed, Sohail Khan, Tymal Mills, Abdul Nasir,Arish Ali Khan, Azam Khan, Keemo Paul (partial tournament),Khurram Manzoor, Zahid Mehmood (partial tournament),Anwar Ali");

      PSL_team LQ =
              new PSL_team ("Lahore Qalandars", 5, "Sohail Akhtar (captain), Fakhar Zaman, Mohammad Hafeez,Shaheen Shah Afridi,\n David Wiese, Usman Shinwari,Haris Rauf, Salman Butt, Chris Lynn, Samit Patel,Seekkuge Prasanna, Ben Dunk, Farzan Raja, Jaahid Ali,\n Muhammad Faizan, Dane Vilas, Dilbar Hussain.");

      PSL_team MS =
              new PSL_team ("Multan Sultans", 6, "Shan Masood (captain), Shahid Afridi, Mohammad Irfan,James Vince, Junaid Khan,\n Moeen Ali, Rilee Rossouw,Zeeshan Ashraf, Ravi Bopara, Sohail Tanvir, Ali Shafiq,Khushdil Shah,\n Usman Qadir,Fabian Allen (partial tournament), Mohammad Ilyas,Rohail Nazir, Imran Tahir, Bilawal Bhatti,Wayne Madsen (partial tournament)");




              for (int i = 0; i <= 30; i++) {
                int team1 = rand.nextInt(6) + 1;
                int team2 = rand.nextInt(6) + 1;
                int win = rand.nextInt(2);
    
                i = team1 == team2 ? i--: i ;
    
                //team 1
                char check;
                if(win == 0 )
                {
                  check = 'T';
                }
                else
                {
                  check = 'F'; 
                }
                char status2;

                if(check == 'T' )
                {
                  status2 ='F';
                }
                else
                {
                  status2 = 'T'; 
                }

                team2 = team2 * 10;
    
                switch(team1){
                    case 1:
                        KK.play_match(check);
                        break;
                    case 2:
                        IU.play_match(check);
                        break;
                    case 3:
                        PZ.play_match(check);
                        break;
                    case 4:
                        QG.play_match(check);
                        break;
                    case 5:
                        LQ.play_match(check);
                        break;
                    case 6:
                        MS.play_match(check);
                        break;
                    //team 2
    
                    case 10:
                        KK.play_match(status2);
                        break;
                    case 20:
                        IU.play_match(status2);
                        break;
                    case 30:
                        PZ.play_match(status2);
                        break;
                    case 40:
                        QG.play_match(status2);
                        break;
                    case 50:
                        LQ.play_match(status2);
                        break;
                    case 60:
                        MS.play_match(status2);
                        break;
                }
            }
    
            int[] arrary = new int[6];// for team ranks
            String[] array = {"Karachi Kings" , "Islamabad United" , "Multan Sultans" , "Quetta Gliadiators" , "Lahore Qalandars" , "Peshawar Zalmi"};
            int i = 0;
    
            arrary[i++] = KK.GetDetail();
            arrary[i++] = IU.GetDetail();
            arrary[i++] = MS.GetDetail();
            arrary[i++] = QG.GetDetail();
            arrary[i++] = LQ.GetDetail();
            arrary[i++] = PZ.GetDetail();
    
    // for ranks loop start
    
            for (i=0; i<5; i++)
                for (int j=0; j<5-i; j++)
                    if (arrary[j] < arrary[j+1]){
                        // swap temp and arrary[i]
                        int temp = arrary[j];
                        arrary[j] = arrary[j+1];
                        arrary[j+1] = temp;
    
                        // Team
    
                        String temp1 = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp1;
    
                    }
            System.out.println("\n\n\t\t\tThe Ranking of Teams are");
            for(i=0; i <=5; i++)
                System.out.println("The "+(i+1)+" Ranks of the team is "+array[i]+"With Total Win "+arrary[i]);
        }




 }
