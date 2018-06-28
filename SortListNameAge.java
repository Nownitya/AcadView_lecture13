
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortListNameAge 
{
    Integer age;
    String name;
    public SortListNameAge(Integer age,String name)
    {
       this.name = name;
       this.age = age;
    }
}
class compAge implements Comparator <SortListNameAge> 
{
    @Override
    public int compare(SortListNameAge a1, SortListNameAge a2) 
    {
        if(a1.age > a2.age) return 1;
	if(a1.age < a2.age) return -1;
	else return 0;
    }
}
class compName implements Comparator<SortListNameAge> 
{
    @Override
    public int compare(SortListNameAge a1, SortListNameAge a2) 
    {
	if((a1.name).compareTo(a2.name) > 0 ) return 1;
	if((a1.name).compareTo(a2.name) < 0 ) return -1;
	else return 0;
    }
}
class Main
{
    public static void main(String[] args) 
    {
        ArrayList<SortListNameAge> list = new ArrayList<SortListNameAge>();
	list.add(new SortListNameAge(25,"Deepak"));
	list.add(new SortListNameAge(24,"Sundaram"));
	list.add(new SortListNameAge(23,"Kaushal"));
	list.add(new SortListNameAge(22,"Monish"));
	compName c1 = new compName();
	Collections.sort(list,c1);
	System.out.println("Sort by Name :");
	for(SortListNameAge s: list)
	{
            System.out.println("age: " + s.age + " name: " + s.name);
	}
	compAge c2 = new compAge();
	Collections.sort(list, c2);
	System.out.println("Sort by Age: ");
	for(SortListNameAge s1 : list)
	{
            System.out.println("age: " + s1.age + " name: " + s1.name);
	}
    }
}