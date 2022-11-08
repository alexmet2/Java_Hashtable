import java.util.Hashtable;

public class hashtable{
    public static void main(String[] args) {
        /* 
            Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
                        Each key/value pair is known as an Entry
                        FAST Insertion, look up, deletion of key/value pairs
                        Not ideal for small datasets, great with large data sets


            hashing   = Takes a key and computes an integer (formula will vaty based on key & data type)
                        In a Hashtable, we use the hash % capacity to calculate an index number

                        key.hashCode() % capacity = index

            bucket    = an indexed storage location for one or more Entries
                        can store multiple Entries in case of a collision (linked similarly a LinkedList)
                        
            collision = hash function generates the same index for more than one key
                        less collision = more efficiency

            Runtime complexity = Best Case o(1)
                                 Worst Case O(n)
        */
        /* declares table as a Hashtable */
        Hashtable<Integer,String> table = new Hashtable<>(10/* we can declare the capacity and a load factor from the start */);
        /* adding elements in the Hashtable */
        table.put(100, "Spongebob");
        table.put(123, "Patric");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        /* print a value with a specific key */
        System.out.println(table.get(100) + "\n");
        /* we can also print all the values using a for loop */
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() + "\t"+ key + "\t" + table.get(key));
        }
        System.out.println();
        main2();
        main3();
        main4();
    }
    public static void main2(){
        Hashtable<Integer,String> table = new Hashtable<>(10);
        /* adding elements in the Hashtable */
        table.put(100, "Spongebob");
        table.put(123, "Patric");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        /* we can remove values from the key */
        table.remove(777);
        /* we can also print all the values using a for loop */
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() + "\t"+ key + "\t" + table.get(key));
        }
        System.out.println();
    }
    public static void main3(){
        Hashtable<Integer,String> table = new Hashtable<>(10);
        /* adding elements in the Hashtable */
        table.put(100, "Spongebob");
        table.put(123, "Patric");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        /* we can also print all the values using a for loop */
        /*
            In this example:

            Spongebob is index 0
            Patric is index 3   
            Sandy is index 1
            Squidward is index 5
            Gary is index 7
        */
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
        }
        System.out.println();
    }
    public static void main4(){
        Hashtable<String,String> table = new Hashtable<>(10);
        /* adding elements in the Hashtable */
        table.put("100", "Spongebob");
        table.put("123", "Patric");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");
        /* we can also print all the values using a for loop */
        /*
            In this example:

            Spongebob is index 5
            Patric is index 0   
            Sandy is index 0
            Squidward is index 9
            Gary is index 5

            Here there are 2 collision. Both of these collision will go to 2 different buckets and each bucket will be treated as a LinkedList
        */
        for(String key : table.keySet()){
            System.out.println(key.hashCode() + "\t"+ key + "\t" + table.get(key));
        }
        System.out.println("\nOR\n");
        for(String key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
        }
    }

}