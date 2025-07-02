public class OrderedStream {

    int ptr; 
    Dictionary<int,string> kv;
    public OrderedStream(int n) {
        ptr=1;
        kv = new Dictionary<int,string>();
    }
    
    public IList<string> Insert(int idKey, string value) {
        IList<string> bucket = new List<string>();
        if(!kv.ContainsKey(idKey))
        {
            kv[idKey]=value;
        }
        while(kv.ContainsKey(ptr))
        {
            bucket.Add(kv[ptr]);
            ptr++;
        }
        return bucket;
    }
}