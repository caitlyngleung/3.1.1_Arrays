/*
 * Activity 3.1.1
 */
public class Partners
{
    public static void main(String[] args)
    {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                         "Thursday", "Friday", "Saturday"};

        String[] partners = new String[7];

        partners[2] = "Alex";
        partners[4] = "Jordan";
        partners[6] = "Taylor";

        String[] friendPartners = partners;

        // Change partners using only the partners reference
        partners[2] = "Morgan";
        partners[4] = "Riley";
        partners[6] = "Casey";

        // Print friendPartners to confirm the changes
        System.out.println(days[2] + ": " + friendPartners[2]);
        System.out.println(days[4] + ": " + friendPartners[4]);
        System.out.println(days[6] + ": " + friendPartners[6]);
    }
}
