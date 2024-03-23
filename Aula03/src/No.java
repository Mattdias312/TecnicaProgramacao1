
public class No {

    private Object info;
    private No proximoNo;
    
    public No(Object info, No proximoNo) {
        this.info = info;
        this.proximoNo = proximoNo;
    }
    
    public Object getInfo(){
        return this.info;
    }
    public void setInfo(Object info){
        this.info = info;
    }
    
    public No getNo(){
        return this.proximoNo;
    }
    public void setNo(No proximoNo){
        this.proximoNo = proximoNo;
    }
    
}
