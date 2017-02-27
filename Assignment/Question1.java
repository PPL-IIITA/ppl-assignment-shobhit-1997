/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplassign1;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author 
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int num_boys=1;
        int i;
        String name;
        int attractiveness,intelligence;
        Boolean commited;
        double Budget;
        String type_of_boy,type_of_girl;
        ArrayList<Boy> b1= new ArrayList<Boy>();
        ArrayList<Girl> g1 = new ArrayList<Girl>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<num_boys;i++)
        {
            name=br.readLine();
            attractiveness = Integer.parseInt(br.readLine());
            intelligence = Integer.parseInt(br.readLine());
            commited = false;
            Budget = Double.parseDouble(br.readLine());
            type_of_boy = br.readLine();
            Boy bj = new Boy(name,attractiveness,intelligence,commited,Budget,type_of_boy);
            b1.add(bj);
            
            
        }
        
        int num_girls = 1;
        for(i=0;i<num_girls;i++)
        {
            name=br.readLine();
            attractiveness = Integer.parseInt(br.readLine());
            intelligence = Integer.parseInt(br.readLine());
            commited = false;
            Budget = Double.parseDouble(br.readLine());
            type_of_girl = br.readLine();
            Girl gj = new Girl(name,attractiveness,intelligence,commited,Budget,type_of_girl);
            g1.add(gj);
        }
        ArrayList<Couple> c1 = new ArrayList<Couple>();
        for(i=0;i<num_boys;i++)
        {
            for(int j=0;j<num_girls;j++)
            {
                    if(b1.get(i).Budget >= g1.get(j).maintanence && b1.get(i).attractiveness >= g1.get(j).attractiveness && b1.get(i).commited == false && g1.get(j).commited == false){
                        b1.get(i).commited = true;
                        g1.get(j).commited = true;
                        c1.add(new Couple(b1.get(i),g1.get(j)));
                    }
                
            }
        }
        
        for(i=0;i<c1.size();i++)
        {
            System.out.println(c1.get(i).id);
        }
        // TODO code application logic here
    }
    
}
