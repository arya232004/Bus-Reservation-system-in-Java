import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class destination
{
   
    Scanner in=new Scanner(System.in);
    public int count;
     public  int available[]=new int[] {20,20,20,20,20,20};
   
     public String check;
        public void visit()
        {
       
      System.out.println("***************************************");
      System.out.println("**   DESTINATION   |  FARE  |  SEAT  **");
      System.out.println("***************************************");
      System.out.println("** 1.)Delhi        | 2000 Rs |   "+available[1]+"   **");
      System.out.println("** 2.)Chennai      | 4000 Rs |   "+available[2]+"   **");
      System.out.println("** 3.)Kerla        | 8000 Rs |   "+available[3]+"   **");
      System.out.println("** 4.)Gujrat       | 1500 Rs |   "+available[4]+"   **");
      System.out.println("** 5.)Punjab       | 3000 Rs |   "+available[5]+"   **");
      System.out.println("***************************************");
      System.out.println("***************************************\n");

      System.out.print("Do you want another transaction? [Y/N]: ");
      check=in.nextLine();
      if(check=="y")
      {   
         
      }
      else
      {
        if(check.equalsIgnoreCase("n"))
        {   System.exit(0);
            
        }
    }
      
      
        }
    }     


     
    class pasengers extends destination 
    { 
      
        Scanner sc=new Scanner(System.in);
        public  static String name[]=new String[100];
        public  static int place[]=new int[100];
        public  static int tourist[]=new int[20];
        public  static double fare[] = { 0, 2000,4000,8000,1500,3000};
        public  static String dest[] = { " ", "Delhi", "Chennai", "Kerla", "Gujrat", "Punjab"};
        public int u=1;
        public  static int price=1;
        public  static int n;
        public  static int d=1;
        public int to;
        public  static int pas_c=1;
        public static double bill[]=new double[200];
        public static int q;
        void accept() 
        {   
            
            System.out.println("***************************************");
            System.out.println("**   DESTINATION   |  FARE  |  SEATS AVAILABLE  **");
            System.out.println("***************************************");
            System.out.println("** 1.)Delhi        | 2000 Rs |   "+available[1]+"   **");
            System.out.println("** 2.)Chennai      | 4000 Rs |   "+available[2]+"   **");
            System.out.println("** 3.)Kerla        | 8000 Rs |   "+available[3]+"   **");
            System.out.println("** 4.)Gujrat       | 1500 Rs |   "+available[4]+"   **");
            System.out.println("** 5.)Punjab       | 3000 Rs |   "+available[5]+"   **");
            System.out.println("***************************************");
            System.out.println("***************************************\n");
           

            if((available[1]==0)&&(available[2]==0)&&(available[3]==0)&&(available[4]==0)&&(available[5]==0))
                            {
                            System.out.println("Sorry, We don't  have available seats for all Destination!");                    
                            }
            else
            {               
                   
            System.out.println("Enter your name:");
         
            name[n]=sc.nextLine();
        
            
           
            System.out.println("ENTER DESTINATION [number]:");
            to=sc.nextInt();
            d=to;
            
            u=d;
            price=u;
          
            
            if(d<1||d>5)
            {
                System.out.println("Invalid Input!");
                System.exit(0);
            }
            
            System.out.println("How many passengers are you:");
         
            tourist[pas_c]=sc.nextInt();
            
           
                available[u] = available[u]-tourist[pas_c];
               
            
            if(available[u]<0)
            {
                System.out.print("Sorry, We don't have seat available for " +tourist[pas_c] +" person\n");
                available[u] = available[u]+tourist[pas_c];
                System.out.println("We only have seats for "+ available[u] +" passengers available");
            }
           
            System.out.println("\n***************************************");
            System.out.println("**        PASSENGER'S DETAILS        **");
            System.out.println("***************************************");
            System.out.println("PASSENGER'S NAME: " +  name[n]);
            System.out.println("PASSENGER'S DESTINATION : " +  dest[d]);
            System.out.println("FARE PRICE: " + fare[price]);
            System.out.println("NO. OF PASSENGERS: " + tourist[pas_c]);
            System.out.println("***************************************");
            System.out.println("***************************************\n");
            bill[q]=fare[price]*tourist[pas_c];
            
            System.out.print("Do you want another transaction? [Y/N]: ");
            check=in.nextLine();
           if(check=="y")
          {   
         
          }
          else
          {
          if(check.equalsIgnoreCase("n"))
          {   
            System.exit(0);
            
          }
    }

      }      
  }   
            
}   
    
            

class billing extends pasengers
{   
    Scanner in=new Scanner(System.in);
    String search;
    public  static String check="checked";
    public double pay[]=new double[150];
    public int money;
    public String again;
    public void bill() 
    {    
            
       
        System.out.print("ENTER PASSENGER'S NAME: ");
        search=in.nextLine();
        
        if(search.equalsIgnoreCase(name[n]))
        {    
            System.out.println("\n***************************************");
            System.out.println("**        PASSENGER'S DETAILS        **");
            System.out.println("***************************************");
            System.out.println("PASSENGER'S NAME: " +  name[n]);
            System.out.println("PASSENGER'S DESTINATION : " +  dest[d]);
            System.out.println("FARE PRICE: Php " + fare[price]);
            System.out.println("NO. OF PASSENGERS: " + tourist[pas_c]);
            System.out.println("***************************************");
            System.out.println("***************************************\n");
           
           
             if(check=="paid")
             {
                System.out.println("Passenger's Already Paid!");
                
             }
             else
             {
                System.out.println("\nPASSENGER'S TOTAL FARE:  "+bill[q]);
                System.out.print("ENTER AMOUNT TO PAY: ");
                pay[money]=in.nextInt();

                if(pay[money]<0||pay[money]<bill[q])
                {
                    System.out.println("Invalid Input!");
                }
                else
                {
                  System.out.println("You have succesfully paid your amount!!");
                  System.out.println("***************************************\n");
                  check="paid";
                }
                
           }

        }
        else
        {
            System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
        }
        System.out.print("Do you want another transaction? [Y/N]: ");
            again=in.nextLine();
           if(again=="y")
          {   
         
          }
          else
          {
          if(again.equalsIgnoreCase("n"))
          {   
            System.exit(0);
            
          }

    }
}
}

          
           
class view extends billing
{   
    public String search;
    public String password="goibo";
    Scanner sc=new Scanner(System.in);
    public String input;
    
    public void data()
    {   
        System.out.print("Enter password: ");
        input=in.nextLine();
        if(input.equals(password))
        {
        System.out.print("SEARCH PASSENGER'S NAME: ");
        search=sc.nextLine();
        try
       {
        if(search.equalsIgnoreCase(name[n]))
        {  
            
            System.out.println("\n***************************************");
            System.out.println("**        PASSENGER'S DETAILS        **");
            System.out.println("***************************************");
            System.out.println("PASSENGER'S NAME: " +  name[n]);
            System.out.println("PASSENGER'S DESTINATION : " +  dest[d]);
            System.out.println("FARE PRICE: Php " + fare[price]);
            System.out.println("NO. OF PASSENGERS: " + tourist[pas_c]);
            System.out.println("***************************************");
            System.out.println("***************************************\n");
            
            if(check.equals("paid"))
            {
                System.out.println("Amount :"+bill[q]);
                System.out.println("STATUS: PAID");
            }   
            else
            {
            System.out.println("STATUS: NOT PAID");
            System.out.println("***************************************");
    		System.out.println("***************************************");
            }

        }
        else
        {
            System.out.println("Passenger's Name not found!");
        }
    }  
    
    catch(Exception e)
    {
        System.out.println("There was error while displaying the bill!");
    }
        
} 
else{
    System.out.println("invalid password!");
    System.out.print("Do you want another transaction? [Y/N]: ");
    again=in.nextLine();
    if(again=="y")
    {   
   
    }
    else
    {
    if(again.equalsIgnoreCase("n"))
    {   
      System.exit(0);
      
    }
}
}
}
}

class show extends view 
{    
 public void init()
    {   try
        {
        Frame f= new Frame("Label Example");  
        Label l1,l2,l3,l4,l5,l6,l7;
        Button b=new Button("Close");
        l1=new Label("       PASSENGER'S DETAILS        ");
        l2=new Label("PASSENGER'S NAME : " +  name[n]);
        l3=new Label("PASSENGER'S DESTINATION : " +  dest[d]);
        l4=new Label("FARE PRICE:   " + fare[price]);
        l5=new Label("NO. OF PASSENGERS : " + tourist[pas_c]);
        
        if(check.equals("paid"))
        {    
            l6=new Label("Amount :"+bill[q]);
            l7=new Label("STATUS: PAID");
        }   
        else
        {    
            l6=new Label("Amount :"+bill[q]);
            l7=new Label("STATUS: NOT PAID");
        }
        
        
        l1.setBounds(106,64, 174,17);  
        l2.setBounds(65,110, 232,17);
        l3.setBounds(65,151, 281,17);
        l4.setBounds(65,195, 210,17);
        l5.setBounds(65,240, 268,17);
        l6.setBounds(65,284,285,17);
        l7.setBounds(65,330,230,17);
        b.setBounds(126,377,60,30);
        
        f.add(l1); 
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(b);
       
      f.setSize(459,497);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setBackground(Color.lightGray);

        b.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {  
                        f.setVisible(false);  
                    }  
                
            });
            
        
    }
    catch(Exception e)
    {
        System.out.println("There was problem while executing the code: "+e );
    }
}
       
} 
  
   
 
        


            
public class bus extends show
{ 
     public static void main(String[] args)
    {    
        Scanner in=new Scanner(System.in);
        int i;
        
        bus b=new bus();
        
        {   
            while(true)
            {   
        System.out.println("********************************************");
        System.out.println("**        BUS RESERVATION SYSTEM   **");
        System.out.println("********************************************");
        System.out.println("** [1] Destination                   **");
        System.out.println("** [2] Make a Reservation            **");
        System.out.println("** [3] Billing                       **");
        System.out.println("** [4] View Records                  **");
        System.out.println("** [5] Exit                          **");
        System.out.println("***************************************");
        System.out.println("***************************************\n");
        System.out.println("Enter your choice: ");
        i=in.nextInt();
        switch (i) 
        {
            case 1:
            b.visit();
            
            break;
               
            case 2:
            b.accept();
            break;
              
            case 3:
            b.bill();
            break;
              
            case 4:
            b.data();
            b.init();
            
            break;
              
            default:
            System.exit(0);
            break;
        }
    } 
    }
}
}

                