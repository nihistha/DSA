class linearProbing{
    int keytable[];
    int valtable[];
    int size;

    linearProbing(int size){
        this.size = size;
        keytable = new int[size];
        valtable = new int[size];
        for(int i = 0;i<size;i++){
            keytable[i] = -1;
            valtable[i] = -1;
        }
    }
    int hash (int key ){
        return key%size;
    }
    void insert(int key,int val){
        int location = hash(key);
        int temp = location;
        do{
            if(keytable[location] == -1){
                keytable[location] = key;
                keytable[location] = val;
                return;
            }else if(keytable[location] == key){
                valtable[location]=val;
                return;
            }else{
                location =(location + 1)% size;
            }
        }
        while(location!=temp);
    }
    public int get(int key){
        int location = hash(key);
        int temp = location;
        int value = -1;
        do{
            if(keytable[location] == key){
                value = valtable[location];
                break;
            }
            location = (location+1)%size;
        }while(location != temp );
        return value;
    }
}