
class Matematica {

    public int pot(int b, int p) {
        if(p==0) return 1;
        
        return b* pot(b,p-1);
    }
    
    
}
