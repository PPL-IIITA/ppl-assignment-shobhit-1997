import java.util.Collections; 
import java.util.Comparator; 
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.IOException;
public class Question2
{
    public static int main(String[] args) throws IOException
    {
	callme();
    }
    public static ArrayList<couple> form_cupls(ArrayList<Girl> girls_list, ArrayList<Boy> boys_list)
    {

	Collections.sort(boys_list, comp_function_b);
	Collections.sort(girls_list, comp_function_g);
	ArrayList<couple> lucky_couples = new ArrayList<couple>();
	for (Iterator<Girl> it = girls_list.iterator(); it.hasNext();)
	{
            Girl current = it.next();
            for (Iterator<Boy> b = boys_list.iterator(); b.hasNext();)
            {
		Boy current = b.next();
		if ((current).commited())
		{
                    continue;
		}
		if ((current).budget >= (current).budget && (current).attrctvnss <= (current).attrctvnss)
		{
                    (current).set_commited();
                    (current).set_commited();
                    couple C = new couple((current),(current));
                    lucky_couples.add(C);
                    break;
		}
            }
	}
	return lucky_couples;
    }
    public static int callme()
    {
	int n = DefineConstants.N;
	produceSample(n);
	ArrayList<Boy> boys_list = readBoy();
	ArrayList<Girl> girls_list = readGirl();
	ArrayList<couple> lucky_couples = form_cupls(new ArrayList(girls_list), new ArrayList(boys_list));
	ArrayList<gifts> gifts_list = readGift();
	Collections.sort(gifts_list, comp_function_gf);
	ofstream file = new ofstream("gift_log.txt");
	System.out.print("logging gifts exchange in gift_log.txt\n\n");
	for (Iterator<couple> it = lucky_couples.iterator(); it.hasNext();)
	{
            couple current = it.next();
            if ((current).budget < gifts_list.get(0).price)
            {
		(current).update_budget(gifts_list.get(0).price);
            }
            if ((current).boy.getType() == boyType.MISER)
            {
		for (Iterator<gifts> g = gifts_list.iterator(); g.hasNext();)
		{
                    gifts current = g.next();
                    if ((current).price < (current).budget)
                    {
			(current).add_gifts((current),(current));
			time_t now = time(null);
			tm ptm = localtime(now);
			String buffer = new String(new char[32]);
			if ((current).getVal() > (current).girl.budget)
                        {
                            break;
			}
                    }
		}
            }
            else if ((current).boy.getType() == boyType.GEEKS)
            {
		for (Iterator<gifts> g = gifts_list.iterator(); g.hasNext();)
		{
                    gifts current = g.next();
                    if ((current).price < (current).budget)
                    {
			(current).add_gifts((current),(current));
			time_t now = time(null);
			tm ptm = localtime(now);
			String buffer = new String(new char[32]);
			if ((current).getVal() > (current).girl.budget)
			{
                            break;
			}
                    }
		}
		for (Iterator<gifts> g = gifts_list.iterator(); g.hasNext();)
		{
                    gifts current = g.next();
                    if ((current).type == giftType.LUXURY)
                    {
			if ((current).budget >= (current).price)
			{
                            (current).add_gifts((current),(current));
                            time_t now = time(null);
                            tm ptm = localtime(now);
                            String buffer = new String(new char[32]);
			}
                    }
		}
            }
            else
            {
		gifts gft = new gifts();
		for (Iterator<gifts> g = gifts_list.iterator(); g.hasNext();)
		{
                    gifts current = g.next();
                    if ((current).price > (current).budget)
                    {
			break;
                    }
                    gft.copyFrom((current));
		}
		(current).add_gifts(gft,(current));
		time_t now = time(null);
		tm ptm = localtime(now);
		String buffer = new String(new char[32]);
            }
	}
	Collections.sort(lucky_couples, comp_function_cpl);
	System.out.print("PRINTING ");
	System.out.print(DefineConstants.K);
	System.out.print(" MOST HAPPY COUPLES \n");
	for (int i = 0;i < DefineConstants.K;++i)
	{
            couple c = lucky_couples.get(i);
            System.out.print(c.boy.name);
            System.out.print(" ");
            System.out.print(heart);
            System.out.print(" ");
            System.out.print(c.girl.name);
            System.out.print("\n");
	}
        Collections.sort(lucky_couples, comp_function_cpl2);
	System.out.print("PRINTING ");
	System.out.print(DefineConstants.K);
	System.out.print(" MOST COMPATIBLE COUPLES \n");
	for (int i = 0;i < DefineConstants.K;++i)
	{
            couple c = lucky_couples.get(i);
            System.out.print(c.boy.name);
            System.out.print(" ");
            System.out.print(heart);
            System.out.print(" ");
            System.out.print(c.girl.name);
            System.out.print("\n");
	}

    }
}