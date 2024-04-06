
public class NoDuplo {
    
    private int info;
    private NoDuplo proximoNo;
    private NoDuplo anteriorNo;
    
    public NoDuplo(int info, NoDuplo proximoNo,NoDuplo anteriorNo) {
        this.info = info;
        this.proximoNo = proximoNo;
        this.anteriorNo = anteriorNo;
    }
    
    public int getInfo(){
        return this.info;
    }
    public void setInfo(int info){
        this.info = info;
    }
    
    public NoDuplo getProximoNo(){
        return this.proximoNo;
    }
    public void setProximoNo(NoDuplo proximoNo){
        this.proximoNo = proximoNo;
    }
    
    public NoDuplo getAnteriorNo(){
        return this.anteriorNo;
    }
    
    public void setAnteriorNo(NoDuplo anteriorNo){
        this.anteriorNo = anteriorNo;
    }
    
}
