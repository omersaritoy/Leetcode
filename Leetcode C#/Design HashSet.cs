public class MyHashSet {

    private HashSet<int> set=null;

    public MyHashSet() {
        set=new HashSet<int>();
    }
    
    public void Add(int key) {
        set.Add(key);
    }
    
    public void Remove(int key) {
        set.Remove(key);
    }
    
    public bool Contains(int key) {
        return set.Contains(key);
    }
}