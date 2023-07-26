public class QuardatiacProbing {
    int size;
    int keytable[];
    int valuetable[];
    QuardatiacProbing(int size){
        this.size = size;
        keytable = new int[size];
        valuetable = new int[size];
        for(int i = 0;i<size;i++){
            keytable[i] = -1;
            valuetable[i] = -1;
        }
    }
    public int hashFunction(int key){
        return (2*key +3)%10;
    }
    void insert(int key, int value){
        int location = hashFunction(key);
        int i = 0;
        if(keytable[location]==-1){
            valuetable[location] = value;
        }
        while(keytable[location] !=-1 && i<size){
            location = (location = i*i)% size;
            i++;
        }
        if(keytable[location]!=-1){
            keytable[location] = key;
            valuetable[location] = value;
        }
        return;
    }
}
//(u+v*i)%m