/*
 * Activity 3.1.1
 */
public class DogArrays
{
    public static void main(String[] args)
    {
        Dog[] myDogs = {new Dog("Buddy"), new Dog("Max"), new Dog("Luna")};

        Dog[] neighborsDogs = new Dog[2];

        // 1. Print the names of your dogs
        System.out.println(myDogs[0]);
        System.out.println(myDogs[1]);
        System.out.println(myDogs[2]);

        // 2. Create and print your neighbor's dogs
        neighborsDogs[0] = new Dog("Charlie");
        neighborsDogs[1] = new Dog("Daisy");

        System.out.println(neighborsDogs[0]);
        System.out.println(neighborsDogs[1]);

        // 3. Create and print your friend's dogs
        Dog[] friendsDogs = {new Dog("Lady"), new Dog("Tramp")};
        System.out.println(friendsDogs[0] + " and " + friendsDogs[1]);

        // Error: Array initializer syntax cannot be used when assigning
        // to an already-declared array without using new Dog[].
        // neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")};

        // Error: Index 2 is out of bounds because neighborsDogs
        // has space for only two elements (indexes 0 and 1).
        // neighborsDogs[2] = new Dog("Cocoa");

        // This creates a new array with three empty Dog slots,
        // overwriting the original array and its dog references.
        // neighborsDogs = new Dog[3];

        // Error: These statements cause a NullPointerException because
        // the new array's elements are null until Dog objects are assigned.
        // System.out.println(neighborsDogs[0].getName());
        // System.out.println(neighborsDogs[1].getName());
    }
}
